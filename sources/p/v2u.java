package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v2u extends vnn0 implements kr20 {
    public String Y;

    @Override // p.vnn0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof v2u) && super.equals(obj) && u890.j(this.Y, ((v2u) obj).Y);
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
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, emz0.a);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.Y = string;
        }
        typedArrayObtainAttributes.recycle();
    }
}
