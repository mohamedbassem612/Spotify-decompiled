package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oav0 extends kav0 {
    public int a = 1;
    public bav0 b;
    public final /* synthetic */ pav0 c;

    public oav0(pav0 pav0Var) {
        this.c = pav0Var;
    }

    public final void a(bav0 bav0Var, boolean z) {
        List list = bav0Var.a;
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            if (((hav0) list.get(i)).l()) {
                b(bav0Var);
                return;
            }
        }
        elb0 layoutCoordinates$ui = getLayoutCoordinates$ui();
        if (layoutCoordinates$ui == null) {
            eg.m("layoutCoordinates not set");
            return;
        }
        long jO = layoutCoordinates$ui.O(0L);
        pav0 pav0Var = this.c;
        d9p1.q(bav0Var, jO, new gub0(this, pav0Var, (byte) 12), false);
        if (this.a == 2) {
            if (z) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((hav0) list.get(i2)).a();
                }
            }
            oi oiVar = bav0Var.b;
            if (oiVar != null) {
                oiVar.b = !pav0Var.c;
            }
        }
    }

    public final void b(bav0 bav0Var) {
        if (this.a == 2) {
            elb0 layoutCoordinates$ui = getLayoutCoordinates$ui();
            if (layoutCoordinates$ui == null) {
                eg.m("layoutCoordinates not set");
                return;
            }
            d9p1.q(bav0Var, layoutCoordinates$ui.O(0L), new waq0(this.c, (byte) 3), true);
        }
        this.a = 3;
    }

    @Override // p.kav0
    public final void onCancel() {
        if (this.a == 2) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            pav0 pav0Var = this.c;
            pav0Var.a().invoke(motionEventObtain);
            motionEventObtain.recycle();
            this.a = 1;
            pav0Var.c = false;
            this.b = null;
        }
    }

    @Override // p.kav0
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public final void mo85onPointerEventH0pRuoY(bav0 bav0Var, cav0 cav0Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        List list = bav0Var.a;
        List list2 = list;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            hav0 hav0Var = (hav0) list.get(i);
            if (p8p1.i(hav0Var) || p8p1.k(hav0Var)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (((hav0) list.get(i2)).l()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        pav0 pav0Var = this.c;
        if (pav0Var.c) {
            z3 = true;
            break;
        }
        int size3 = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                hav0 hav0Var2 = (hav0) list.get(i3);
                if (!p8p1.i(hav0Var2) && !p8p1.k(hav0Var2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        int i4 = this.a;
        cav0 cav0Var2 = cav0.c;
        if (i4 != 3) {
            if (cav0Var == cav0.a && z3) {
                this.b = bav0Var;
                a(bav0Var, !z || pav0Var.c);
            }
            if (cav0Var == cav0.b && z && bav0Var == this.b && pav0Var.c) {
                int size4 = list2.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((hav0) list.get(i5)).a();
                }
            }
            if (cav0Var == cav0Var2 && !z3 && bav0Var != this.b) {
                a(bav0Var, true);
            }
        }
        if (cav0Var == cav0Var2) {
            int size5 = list2.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    this.a = 1;
                    pav0Var.c = false;
                    this.b = null;
                    break;
                } else if (!p8p1.k((hav0) list.get(i6))) {
                    break;
                } else {
                    i6++;
                }
            }
            if (bav0Var == this.b && z) {
                int size6 = list2.size();
                for (int i7 = 0; i7 < size6; i7++) {
                    if (((hav0) list.get(i7)).l()) {
                        if (pav0Var.c) {
                            break;
                        }
                        b(bav0Var);
                        return;
                    }
                }
                int size7 = list2.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    ((hav0) list.get(i8)).a();
                }
            }
        }
    }
}
