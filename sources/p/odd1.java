package p;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class odd1 extends jme {
    public final HashMap c;
    public final /* synthetic */ pdd1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odd1(pdd1 pdd1Var) {
        super(0);
        this.d = pdd1Var;
        this.c = new HashMap();
    }

    @Override // p.jme
    public final void r0(mrl1 mrl1Var) {
        ArrayList arrayList = this.d.b;
        if ((mrl1Var.a.d() & 519) != 0) {
            this.c.remove(mrl1Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                xey0 xey0Var = (xey0) arrayList.get(size);
                int i = xey0Var.e;
                boolean z = i > 0;
                int i2 = i - 1;
                xey0Var.e = i2;
                if (z && i2 == 0) {
                    xey0Var.c();
                }
            }
        }
    }

    @Override // p.jme
    public final void s0(mrl1 mrl1Var) {
        ArrayList arrayList = this.d.b;
        if ((mrl1Var.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((xey0) arrayList.get(size)).e++;
            }
        }
    }

    @Override // p.jme
    public final hsl1 t0(hsl1 hsl1Var, List list) {
        ArrayList arrayList = this.d.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            mrl1 mrl1Var = (mrl1) list.get(size);
            Integer num = (Integer) this.c.get(mrl1Var);
            if (num != null) {
                int iIntValue = num.intValue();
                float fA = mrl1Var.a.a();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fA;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fA;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fA;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fA;
                }
                i |= iIntValue;
            }
        }
        nk80 nk80VarB = nk80.b(hsl1Var.a.i(519), hsl1Var.a.i(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            xey0 xey0Var = (xey0) arrayList.get(size2);
            nk80 nk80Var = xey0Var.d;
            ArrayList arrayList2 = xey0Var.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                y9h y9hVar = (y9h) arrayList2.get(size3);
                byte b = y9hVar.a;
                if ((b & i) != 0) {
                    wey0 wey0Var = y9hVar.b;
                    if (!wey0Var.d) {
                        wey0Var.d = true;
                        xmu0 xmu0Var = wey0Var.i;
                        if (xmu0Var != null) {
                            ((View) xmu0Var.c).setVisibility(0);
                        }
                    }
                    if (b == 1) {
                        int i2 = nk80Var.a;
                        if (i2 > 0) {
                            y9hVar.b(nk80VarB.a / i2);
                        }
                        y9hVar.a(rectF.left);
                    } else if (b == 2) {
                        int i3 = nk80Var.b;
                        if (i3 > 0) {
                            y9hVar.b(nk80VarB.b / i3);
                        }
                        y9hVar.a(rectF.top);
                    } else if (b == 4) {
                        int i4 = nk80Var.c;
                        if (i4 > 0) {
                            y9hVar.b(nk80VarB.c / i4);
                        }
                        y9hVar.a(rectF.right);
                    } else if (b == 8) {
                        int i5 = nk80Var.d;
                        if (i5 > 0) {
                            y9hVar.b(nk80VarB.d / i5);
                        }
                        y9hVar.a(rectF.bottom);
                    }
                }
            }
        }
        return hsl1Var;
    }

    @Override // p.jme
    public final frl1 u0(mrl1 mrl1Var, frl1 frl1Var) {
        if ((mrl1Var.a.d() & 519) != 0) {
            nk80 nk80Var = (nk80) frl1Var.c;
            nk80 nk80Var2 = (nk80) frl1Var.b;
            int i = nk80Var.a != nk80Var2.a ? 1 : 0;
            if (nk80Var.b != nk80Var2.b) {
                i |= 2;
            }
            if (nk80Var.c != nk80Var2.c) {
                i |= 4;
            }
            if (nk80Var.d != nk80Var2.d) {
                i |= 8;
            }
            this.c.put(mrl1Var, Integer.valueOf(i));
        }
        return frl1Var;
    }
}
