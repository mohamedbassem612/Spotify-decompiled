package p;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bav0 {
    public final List a;
    public final oi b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    public bav0(List list, oi oiVar) {
        MotionEvent motionEventA;
        this.a = list;
        this.b = oiVar;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        this.c = (i < 29 || (motionEventA = a()) == null) ? 0 : motionEventA.getClassification();
        MotionEvent motionEventA2 = a();
        this.d = motionEventA2 != null ? motionEventA2.getButtonState() : 0;
        MotionEvent motionEventA3 = a();
        this.e = motionEventA3 != null ? motionEventA3.getMetaState() : 0;
        MotionEvent motionEventA4 = a();
        if (motionEventA4 != null) {
            boolean z = i >= 34 && motionEventA4.getClassification() == 3;
            boolean z2 = i >= 34 && motionEventA4.getClassification() == 5;
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (z) {
                                    i2 = 10;
                                } else if (z2) {
                                    i2 = 7;
                                } else if (!z2) {
                                    i2 = 1;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 6:
                                if (z) {
                                    i2 = 12;
                                } else if (z2) {
                                    i2 = 9;
                                } else if (!z2) {
                                    i2 = 2;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 7:
                                if (z) {
                                    i2 = 11;
                                } else if (!z2) {
                                    i2 = 3;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 8:
                                i2 = 6;
                                break;
                            case 9:
                                i2 = 4;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                        }
                    } else if (z) {
                        i2 = 11;
                    } else if (!z2) {
                        i2 = 8;
                    } else {
                        i2 = 3;
                    }
                } else if (z) {
                    i2 = 12;
                } else if (!z2 || z2) {
                    i2 = 2;
                } else {
                    i2 = 9;
                }
            } else if (z) {
                i2 = 10;
            } else if (!z2 || z2) {
                i2 = 1;
            } else {
                i2 = 7;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i2 < size) {
                    hav0 hav0Var = (hav0) list.get(i2);
                    if (p8p1.k(hav0Var)) {
                        i2 = 2;
                    } else if (p8p1.i(hav0Var)) {
                        i2 = 1;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = 3;
                }
            }
        }
        this.f = i2;
    }

    public final MotionEvent a() {
        oi oiVar = this.b;
        if (oiVar != null) {
            return oiVar.E();
        }
        return null;
    }
}
