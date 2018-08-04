package com.darshankomu.bounceinterpolator

    class BounceInterpolatorClass : android.view.animation.Interpolator {


        private var mAmplitude : Double = 0.0
        private var mFrequency : Double = 0.0

        constructor(){}

        constructor(mAmplitude : Double, mFrequency : Double)
        {
            this.mAmplitude = mAmplitude
            this.mFrequency = mFrequency

        }

        override fun getInterpolation(input: Float): Float {

            return (-1*Math.pow(Math.E,-input/mAmplitude)*Math.cos(mFrequency*input)+1).toFloat()

        }




    }
