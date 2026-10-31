package androidx.car.app.model;

import java.util.Objects;
import p.e2q0;
import p.m2g;
import p.qi90;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class Chip implements qi90 {
    private final CarIcon mEndIcon;
    private final boolean mIsSelected;
    private final e2q0 mOnClickDelegate;
    private final CarIcon mStartIcon;
    private final ChipStyle mStyle;
    private final CarText mTitle;

    private Chip() {
        this.mTitle = null;
        this.mStartIcon = null;
        this.mEndIcon = null;
        this.mIsSelected = false;
        this.mOnClickDelegate = null;
        this.mStyle = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Chip)) {
            return false;
        }
        Chip chip = (Chip) obj;
        if (Objects.equals(this.mTitle, chip.mTitle) && Objects.equals(this.mStartIcon, chip.mStartIcon) && Objects.equals(this.mEndIcon, chip.mEndIcon) && this.mIsSelected == chip.mIsSelected) {
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(chip.mOnClickDelegate == null)) && Objects.equals(this.mStyle, chip.mStyle)) {
                return true;
            }
        }
        return false;
    }

    public CarIcon getEndIcon() {
        return this.mEndIcon;
    }

    public e2q0 getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarIcon getStartIcon() {
        return this.mStartIcon;
    }

    public ChipStyle getStyle() {
        return this.mStyle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mStartIcon, this.mEndIcon, Boolean.valueOf(this.mIsSelected), Boolean.valueOf(this.mOnClickDelegate == null), this.mStyle);
    }

    public boolean isSelected() {
        return this.mIsSelected;
    }

    public String toString() {
        return "Chip{title=" + this.mTitle + ", startIcon=" + this.mStartIcon + ", endIcon=" + this.mEndIcon + ", isSelected=" + this.mIsSelected + ", onClickDelegate=" + this.mOnClickDelegate + ", style=" + this.mStyle + "}";
    }

    public Chip(m2g m2gVar) {
        throw null;
    }
}
