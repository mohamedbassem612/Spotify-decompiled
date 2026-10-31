package p;

import android.content.res.TypedArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class az71 extends k9 {
    public az71() {
        super((byte) 14);
        ((bz71) ((k9) this).b).p = false;
    }

    public final k9 B0(TypedArray typedArray) {
        bz71 bz71Var = (bz71) ((k9) this).b;
        super.B0(typedArray);
        if (typedArray.hasValue(2)) {
            bz71Var.e = (typedArray.getColor(2, bz71Var.e) & 16777215) | (bz71Var.e & (-16777216));
        }
        if (typedArray.hasValue(12)) {
            bz71Var.d = typedArray.getColor(12, bz71Var.d);
        }
        return this;
    }

    public final k9 a1() {
        return this;
    }
}
