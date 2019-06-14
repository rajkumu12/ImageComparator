package com.airsaid.imagecomparator.library

import android.graphics.Bitmap

/**
 * 图片比对器。
 *
 * @author airsaid
 */
class ImageComparator(comparison: Comparison) {

  private var mImageComparison: Comparison = comparison

  /**
   * 设置图片比对方式。
   *
   * @param comparison 图片比对方式。
   */
  fun setImageComparison(comparison: Comparison) {
    this.mImageComparison = comparison
  }

  /**
   * 开始对指定的两张图片进行比较。
   *
   * @param sourceImage 原图。
   * @param targetImage 比对图。
   * @return 百分比结果。0% - 100%，100% 表示最相近。
   */
  fun comparison(sourceImage: Bitmap, targetImage: Bitmap): Float {
    return mImageComparison.comparison(sourceImage, targetImage)
  }

}