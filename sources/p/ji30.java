package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ji30 extends vnn0 {
    public String Y;

    @Override // p.vnn0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof ji30) && super.equals(obj) && u890.j(this.Y, ((ji30) obj).Y);
    }

    @Override // p.vnn0
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.Y;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p.vnn0
    public final void k(Context context, AttributeSet attributeSet) {
        super.k(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, emz0.b);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.Y = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // p.vnn0
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" class=");
        String str = this.Y;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
