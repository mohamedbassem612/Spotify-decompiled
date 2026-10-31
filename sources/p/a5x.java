package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a5x extends eg50 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a5x(Object obj, byte b) {
        this.d = b;
        this.e = obj;
    }

    public final int e(int i) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                b5x b5xVar = (b5x) obj;
                h46 h46Var = b5xVar.i;
                if (h46Var == null) {
                    u890.C("emojiPickerItems");
                    throw null;
                }
                int iC = l1d.C(h46Var.c(i).a);
                if (iC == 0 || iC == 1) {
                    return b5xVar.getEmojiGridColumns();
                }
                return 1;
            default:
                s1b0 s1b0Var = ((pv51) ((List) obj).get(i)).a;
                if (s1b0Var instanceof q1b0) {
                    return 4;
                }
                if (s1b0Var instanceof r1b0) {
                    return 3;
                }
                eg.o();
                return 0;
        }
    }
}
