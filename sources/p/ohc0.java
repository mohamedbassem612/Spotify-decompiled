package p;

import android.graphics.Paint;
import android.os.Parcel;
import android.text.ParcelableSpan;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ohc0 implements LineHeightSpan, ParcelableSpan {
    public final int a;

    public ohc0(int i) {
        this.a = i;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = i5 - fontMetricsInt.ascent;
        if (i6 > 0) {
            int i7 = this.a;
            int iU = jch0.U(i5 * ((i7 * 1.0f) / i6));
            fontMetricsInt.descent = iU;
            fontMetricsInt.ascent = iU - i7;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.text.ParcelableSpan
    public final int getSpanTypeId() {
        return 28;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
