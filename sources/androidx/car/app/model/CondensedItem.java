package androidx.car.app.model;

import java.util.Objects;
import p.dsk;
import p.e2q0;
import p.qi90;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class CondensedItem implements qi90 {
    public static final int IMAGE_TYPE_LARGE = 3;
    public static final int IMAGE_TYPE_MEDIUM = 2;
    public static final int IMAGE_TYPE_SMALL = 1;
    private final boolean mIndexable;
    private final CarIcon mLeadingImage;
    private final int mLeadingImageType;
    private final e2q0 mOnClickDelegate;
    private final CarProgressBar mProgressBar;
    private final CondensedItemStyle mStyle;
    private final CarText mText;
    private final CarText mTitle;
    private final CarIcon mTrailingImage;
    private final int mTrailingImageType;

    private CondensedItem(dsk dskVar) {
        this.mTitle = dskVar.a;
        this.mText = null;
        this.mLeadingImage = dskVar.b;
        this.mLeadingImageType = dskVar.c;
        this.mTrailingImage = dskVar.d;
        this.mTrailingImageType = 1;
        this.mStyle = dskVar.e;
        this.mOnClickDelegate = dskVar.f;
        this.mProgressBar = dskVar.g;
        this.mIndexable = dskVar.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CondensedItem)) {
            return false;
        }
        CondensedItem condensedItem = (CondensedItem) obj;
        if (Objects.equals(this.mTitle, condensedItem.mTitle) && Objects.equals(this.mText, condensedItem.mText) && Objects.equals(this.mLeadingImage, condensedItem.mLeadingImage) && this.mLeadingImageType == condensedItem.mLeadingImageType && Objects.equals(this.mTrailingImage, condensedItem.mTrailingImage) && this.mTrailingImageType == condensedItem.mTrailingImageType && Objects.equals(this.mStyle, condensedItem.mStyle)) {
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(condensedItem.mOnClickDelegate == null)) && this.mIndexable == condensedItem.mIndexable && Objects.equals(this.mProgressBar, condensedItem.mProgressBar)) {
                return true;
            }
        }
        return false;
    }

    public CarIcon getLeadingImage() {
        return this.mLeadingImage;
    }

    public int getLeadingImageType() {
        return this.mLeadingImageType;
    }

    public e2q0 getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    public CondensedItemStyle getStyle() {
        return this.mStyle;
    }

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public CarIcon getTrailingImage() {
        return this.mTrailingImage;
    }

    public int getTrailingImageType() {
        return this.mTrailingImageType;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mText, this.mLeadingImage, Integer.valueOf(this.mLeadingImageType), this.mTrailingImage, Integer.valueOf(this.mTrailingImageType), this.mStyle, this.mOnClickDelegate, this.mProgressBar);
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public String toString() {
        return "CondensedItem { title: " + this.mTitle + ", text: " + this.mText + ", leadingImage: " + this.mLeadingImage + ", leadingImageType: " + this.mLeadingImageType + ", trailingImage: " + this.mTrailingImage + ", trailingImageType: " + this.mTrailingImageType + ", style: " + this.mStyle + ", onClickDelegate: " + this.mOnClickDelegate + ", progressBar: " + this.mProgressBar + " }";
    }

    public /* synthetic */ CondensedItem(dsk dskVar, int i) {
        this(dskVar);
    }

    private CondensedItem() {
        this.mTitle = null;
        this.mText = null;
        this.mLeadingImage = null;
        this.mLeadingImageType = 1;
        this.mTrailingImage = null;
        this.mTrailingImageType = 1;
        this.mStyle = null;
        this.mOnClickDelegate = null;
        this.mProgressBar = null;
        this.mIndexable = true;
    }
}
