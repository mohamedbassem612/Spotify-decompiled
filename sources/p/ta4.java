package p;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ta4 implements ViewTranslationCallback {
    public static final ta4 a = new ta4();

    /* JADX WARN: Code duplicated, block: B:20:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x006e A[LOOP:0: B:5:0x0018->B:21:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[EDGE_INSN: B:24:0x0071->B:22:0x0071 BREAK  A[LOOP:0: B:5:0x0018->B:21:0x006e], SYNTHETIC] */
    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onClearTranslation(View view) {
        we weVar;
        Function0 function0;
        ob4 contentCaptureManager$ui = ((ha4) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.e = 1;
        or80 or80VarC = contentCaptureManager$ui.c();
        Object[] objArr = or80VarC.c;
        long[] jArr = or80VarC.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            o161 o161Var = ((x161) objArr[(i << 3) + i3]).a.d;
                            if (eko1.v(o161Var, z161.E) != null && (weVar = (we) eko1.v(o161Var, m161.n)) != null && (function0 = weVar.b) != null) {
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[LOOP:0: B:5:0x0018->B:21:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[EDGE_INSN: B:24:0x0079->B:22:0x0079 BREAK  A[LOOP:0: B:5:0x0018->B:21:0x0076], SYNTHETIC] */
    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onHideTranslation(View view) {
        we weVar;
        iu30 iu30Var;
        ob4 contentCaptureManager$ui = ((ha4) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.e = 1;
        or80 or80VarC = contentCaptureManager$ui.c();
        Object[] objArr = or80VarC.c;
        long[] jArr = or80VarC.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            o161 o161Var = ((x161) objArr[(i << 3) + i3]).a.d;
                            if (u890.j(eko1.v(o161Var, z161.E), Boolean.TRUE) && (weVar = (we) eko1.v(o161Var, m161.m)) != null && (iu30Var = weVar.b) != null) {
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onShowTranslation(View view) {
        we weVar;
        iu30 iu30Var;
        ob4 contentCaptureManager$ui = ((ha4) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.e = 2;
        or80 or80VarC = contentCaptureManager$ui.c();
        Object[] objArr = or80VarC.c;
        long[] jArr = or80VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        o161 o161Var = ((x161) objArr[(i << 3) + i3]).a.d;
                        if (u890.j(eko1.v(o161Var, z161.E), Boolean.FALSE) && (weVar = (we) eko1.v(o161Var, m161.m)) != null && (iu30Var = weVar.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
