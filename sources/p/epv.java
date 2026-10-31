package p;

import android.icu.text.BreakIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class epv implements dk80 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ epv(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    public final void i(h4e1 h4e1Var) {
        byte b = this.a;
        int i = this.b;
        int i2 = 0;
        switch (b) {
            case 0:
                String string = h4e1Var.c.toString();
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(string);
                int i3 = 0;
                while (characterInstance.next() != -1) {
                    i3++;
                }
                if (i3 > i && ((bfn0) h4e1Var.c().b).c > 0) {
                    dfe dfeVar = (dfe) ((bfn0) h4e1Var.c().b).a[0];
                    long jE = e6p1.e(dfeVar.a, dfeVar.b);
                    int i4 = nbe1.c;
                    int i5 = (int) (jE & 4294967295L);
                    dfe dfeVar2 = (dfe) ((bfn0) h4e1Var.c().b).a[0];
                    if (i5 > ((int) (e6p1.e(dfeVar2.c, dfeVar2.d) & 4294967295L))) {
                        h4e1Var.m();
                    }
                    break;
                }
                break;
            default:
                String string2 = h4e1Var.c.toString();
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                characterInstance2.setText(string2);
                while (characterInstance2.next() != -1) {
                    i2++;
                }
                if (i2 > i) {
                    h4e1Var.m();
                }
                break;
        }
    }
}
