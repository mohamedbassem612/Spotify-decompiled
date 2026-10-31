package p;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xey0 {
    public final ArrayList a = new ArrayList();
    public final pdd1 b;
    public nk80 c;
    public nk80 d;
    public int e;
    public boolean f;

    public xey0(pdd1 pdd1Var, ArrayList arrayList) {
        nk80 nk80Var = nk80.e;
        this.c = nk80Var;
        this.d = nk80Var;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = pdd1Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            nk80 nk80Var2 = pdd1Var.c;
            nk80 nk80Var3 = pdd1Var.d;
            this.c = nk80Var2;
            this.d = nk80Var3;
            c();
            b(pdd1Var.e);
        }
        this.b = pdd1Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            y9h y9hVar = (y9h) list.get(i);
            y9hVar.getClass();
            if (true == z) {
                xey0 xey0Var = y9hVar.e;
                if (xey0Var != null) {
                    throw new IllegalStateException(y9hVar + " (" + (i + 1) + "/" + size + ") is already controlled by " + xey0Var + " but is still added to " + this);
                }
                y9hVar.e = this;
                this.a.add(y9hVar);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y9h y9hVar = (y9h) arrayList.get(size);
            if (!y9hVar.g) {
                ColorDrawable colorDrawable = y9hVar.f;
                if (y9hVar.h != i) {
                    y9hVar.h = i;
                    colorDrawable.setColor(i);
                    wey0 wey0Var = y9hVar.b;
                    wey0Var.e = colorDrawable;
                    xmu0 xmu0Var = wey0Var.i;
                    if (xmu0Var != null) {
                        ((View) xmu0Var.c).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i;
        nk80 nk80VarC;
        ArrayList arrayList = this.a;
        nk80 nk80Var = nk80.e;
        nk80 nk80VarA = nk80Var;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y9h y9hVar = (y9h) arrayList.get(size);
            nk80 nk80Var2 = this.c;
            nk80 nk80Var3 = this.d;
            y9hVar.c = nk80Var2;
            wey0 wey0Var = y9hVar.b;
            y9hVar.d = nk80Var3;
            if (!wey0Var.c.equals(nk80VarA)) {
                wey0Var.c = nk80VarA;
                xmu0 xmu0Var = wey0Var.i;
                if (xmu0Var != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xmu0Var.b;
                    layoutParams.leftMargin = nk80VarA.a;
                    layoutParams.topMargin = nk80VarA.b;
                    layoutParams.rightMargin = nk80VarA.c;
                    layoutParams.bottomMargin = nk80VarA.d;
                    ((View) xmu0Var.c).setLayoutParams(layoutParams);
                }
            }
            byte b = y9hVar.a;
            if (b == 1) {
                i = y9hVar.c.a;
                int i2 = y9hVar.d.a;
                if (wey0Var.a != i2) {
                    wey0Var.a = i2;
                    xmu0 xmu0Var2 = wey0Var.i;
                    if (xmu0Var2 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) xmu0Var2.b;
                        layoutParams2.width = i2;
                        ((View) xmu0Var2.c).setLayoutParams(layoutParams2);
                    }
                }
                nk80VarC = nk80.c(i, 0, 0, 0);
            } else if (b == 2) {
                i = y9hVar.c.b;
                int i3 = y9hVar.d.b;
                if (wey0Var.b != i3) {
                    wey0Var.b = i3;
                    xmu0 xmu0Var3 = wey0Var.i;
                    if (xmu0Var3 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) xmu0Var3.b;
                        layoutParams3.height = i3;
                        ((View) xmu0Var3.c).setLayoutParams(layoutParams3);
                    }
                }
                nk80VarC = nk80.c(0, i, 0, 0);
            } else if (b == 4) {
                i = y9hVar.c.c;
                int i4 = y9hVar.d.c;
                if (wey0Var.a != i4) {
                    wey0Var.a = i4;
                    xmu0 xmu0Var4 = wey0Var.i;
                    if (xmu0Var4 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) xmu0Var4.b;
                        layoutParams4.width = i4;
                        ((View) xmu0Var4.c).setLayoutParams(layoutParams4);
                    }
                }
                nk80VarC = nk80.c(0, 0, i, 0);
            } else if (b != 8) {
                nk80VarC = nk80Var;
                i = 0;
            } else {
                i = y9hVar.c.d;
                int i5 = y9hVar.d.d;
                if (wey0Var.b != i5) {
                    wey0Var.b = i5;
                    xmu0 xmu0Var5 = wey0Var.i;
                    if (xmu0Var5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) xmu0Var5.b;
                        layoutParams5.height = i5;
                        ((View) xmu0Var5.c).setLayoutParams(layoutParams5);
                    }
                }
                nk80VarC = nk80.c(0, 0, 0, i);
            }
            boolean z = i > 0;
            if (wey0Var.d != z) {
                wey0Var.d = z;
                xmu0 xmu0Var6 = wey0Var.i;
                if (xmu0Var6 != null) {
                    ((View) xmu0Var6.c).setVisibility(z ? 0 : 8);
                }
            }
            float f = 0.0f;
            y9hVar.a(i > 0 ? 1.0f : 0.0f);
            if (i > 0) {
                f = 1.0f;
            }
            y9hVar.b(f);
            nk80VarA = nk80.a(nk80VarA, nk80VarC);
        }
    }
}
