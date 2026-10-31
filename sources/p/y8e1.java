package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y8e1 extends i5 {
    public static final Parcelable.Creator<y8e1> CREATOR = new aw91((byte) 17);
    public CharSequence c;
    public boolean d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;

    public y8e1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.c = (CharSequence) creator.createFromParcel(parcel);
        this.d = parcel.readInt() == 1;
        this.e = (CharSequence) creator.createFromParcel(parcel);
        this.f = (CharSequence) creator.createFromParcel(parcel);
        this.g = (CharSequence) creator.createFromParcel(parcel);
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.c) + " hint=" + ((Object) this.e) + " helperText=" + ((Object) this.f) + " placeholderText=" + ((Object) this.g) + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        parcel.writeInt(this.d ? 1 : 0);
        TextUtils.writeToParcel(this.e, parcel, i);
        TextUtils.writeToParcel(this.f, parcel, i);
        TextUtils.writeToParcel(this.g, parcel, i);
    }
}
