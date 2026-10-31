package p;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class jj30 extends ej30 {
    @Override // p.ej30
    public final void a(View view, Object obj) {
        ((jhg1) obj).b(view);
    }

    @Override // p.ej30
    public final void b(Object obj, ArrayList arrayList) {
        glg1 glg1Var = (jhg1) obj;
        if (glg1Var == null) {
            return;
        }
        int i = 0;
        if (glg1Var instanceof glg1) {
            glg1 glg1Var2 = glg1Var;
            int size = glg1Var2.f1.size();
            while (i < size) {
                b(glg1Var2.V(i), arrayList);
                i++;
            }
            return;
        }
        if (ej30.k(((jhg1) glg1Var).e) && ej30.k(((jhg1) glg1Var).f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                glg1Var.b((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // p.ej30
    public final void c(Object obj) {
        ((chg1) obj).i();
    }

    @Override // p.ej30
    public final void d(Object obj, e0i e0iVar) {
        chg1 chg1Var = (chg1) obj;
        chg1Var.g = e0iVar;
        if (!chg1Var.b) {
            chg1Var.d = (byte) 2;
        } else {
            chg1Var.j();
            chg1Var.e.a(0.0f);
        }
    }

    @Override // p.ej30
    public final void e(ViewGroup viewGroup, Object obj) {
        fjg1.a(viewGroup, (jhg1) obj);
    }

    @Override // p.ej30
    public final boolean g(Object obj) {
        return obj instanceof jhg1;
    }

    @Override // p.ej30
    public final Object h(Object obj) {
        if (obj != null) {
            return ((jhg1) obj).l();
        }
        return null;
    }

    @Override // p.ej30
    public final Object i(ViewGroup viewGroup, Object obj) {
        jhg1 jhg1Var = (jhg1) obj;
        ArrayList arrayList = fjg1.c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if (jhg1Var.z()) {
                arrayList.add(viewGroup);
                jhg1 jhg1VarL = jhg1Var.l();
                glg1 glg1Var = new glg1();
                glg1Var.U(jhg1VarL);
                fjg1.d(viewGroup, glg1Var);
                viewGroup.setTag(2131431516, null);
                ejg1 ejg1Var = new ejg1();
                ejg1Var.a = glg1Var;
                ejg1Var.b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(ejg1Var);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(ejg1Var);
                viewGroup.invalidate();
                chg1 chg1Var = new chg1(glg1Var);
                ((jhg1) glg1Var).Z0 = chg1Var;
                glg1Var.a(chg1Var);
                return ((jhg1) glg1Var).Z0;
            }
            hhg1.n("The Transition must support seeking.");
        }
        return null;
    }

    @Override // p.ej30
    public final boolean l() {
        return true;
    }

    @Override // p.ej30
    public final boolean m(Object obj) {
        boolean z = ((jhg1) obj).z();
        if (!z) {
            Objects.toString(obj);
        }
        return z;
    }

    @Override // p.ej30
    public final Object n(Object obj, Object obj2, Object obj3) {
        jhg1 jhg1Var = (jhg1) obj;
        jhg1 jhg1Var2 = (jhg1) obj2;
        jhg1 jhg1Var3 = (jhg1) obj3;
        if (jhg1Var != null && jhg1Var2 != null) {
            jhg1 glg1Var = new glg1();
            glg1Var.U(jhg1Var);
            glg1Var.U(jhg1Var2);
            glg1Var.Y(1);
            jhg1Var = glg1Var;
        } else if (jhg1Var == null) {
            jhg1Var = jhg1Var2 != null ? jhg1Var2 : null;
        }
        if (jhg1Var3 == null) {
            return jhg1Var;
        }
        glg1 glg1Var2 = new glg1();
        if (jhg1Var != null) {
            glg1Var2.U(jhg1Var);
        }
        glg1Var2.U(jhg1Var3);
        return glg1Var2;
    }

    @Override // p.ej30
    public final Object o(Object obj, Object obj2) {
        glg1 glg1Var = new glg1();
        if (obj != null) {
            glg1Var.U((jhg1) obj);
        }
        glg1Var.U((jhg1) obj2);
        return glg1Var;
    }

    @Override // p.ej30
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((jhg1) obj).a(new gj30(view, arrayList));
    }

    @Override // p.ej30
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((jhg1) obj).a(new hj30(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p.ej30
    public final void r(float f, Object obj) {
        chg1 chg1Var = (chg1) obj;
        boolean z = chg1Var.b;
        if (z) {
            glg1 glg1Var = chg1Var.h;
            long j = ((jhg1) glg1Var).Y0;
            long j2 = (long) (f * j);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == j) {
                j2 = j - 1;
            }
            if (chg1Var.e != null) {
                eg.m("setCurrentPlayTimeMillis() called after animation has been started");
                return;
            }
            long j3 = chg1Var.a;
            if (j2 == j3 || !z) {
                return;
            }
            if (!chg1Var.c) {
                if (j2 == 0 && j3 > 0) {
                    j2 = -1;
                } else if (j2 == j && j3 < j) {
                    j2 = j + 1;
                }
                if (j2 != j3) {
                    glg1Var.K(j2, j3);
                    chg1Var.a = j2;
                }
            }
            dna1 dna1Var = chg1Var.f;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i = (dna1Var.a + 1) % 20;
            dna1Var.a = i;
            ((long[]) dna1Var.b)[i] = jCurrentAnimationTimeMillis;
            ((float[]) dna1Var.c)[i] = j2;
        }
    }

    @Override // p.ej30
    public final void s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            ej30.j(rect, view);
            ((jhg1) obj).M(new fj30(rect, (byte) 0));
        }
    }

    @Override // p.ej30
    public final void t(Object obj, Rect rect) {
        ((jhg1) obj).M(new fj30(rect, (byte) 1));
    }

    @Override // p.ej30
    public final void u(Object obj, vhd vhdVar, fss fssVar, Runnable runnable) {
        jhg1 jhg1Var = (jhg1) obj;
        k65 k65Var = new k65(fssVar, jhg1Var, runnable, (byte) 8);
        synchronized (vhdVar) {
            while (vhdVar.c) {
                try {
                    try {
                        vhdVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (((k65) vhdVar.d) != k65Var) {
                vhdVar.d = k65Var;
                if (vhdVar.b) {
                    Runnable runnable2 = (Runnable) k65Var.b;
                    jhg1 jhg1Var2 = (jhg1) k65Var.c;
                    Runnable runnable3 = (Runnable) k65Var.d;
                    if (runnable2 == null) {
                        jhg1Var2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        jhg1Var.a(new ij30(runnable));
    }

    @Override // p.ej30
    public final void v(zf30 zf30Var, Object obj, vhd vhdVar, Runnable runnable) {
        u(obj, vhdVar, null, runnable);
    }

    @Override // p.ej30
    public final void w(Object obj, View view, ArrayList arrayList) {
        glg1 glg1Var = (glg1) obj;
        ArrayList arrayList2 = ((jhg1) glg1Var).f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ej30.f((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(glg1Var, arrayList);
    }

    @Override // p.ej30
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        glg1 glg1Var = (glg1) obj;
        if (glg1Var != null) {
            ArrayList arrayList3 = ((jhg1) glg1Var).f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(glg1Var, arrayList, arrayList2);
        }
    }

    @Override // p.ej30
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        glg1 glg1Var = new glg1();
        glg1Var.U((jhg1) obj);
        return glg1Var;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        glg1 glg1Var = (jhg1) obj;
        int i = 0;
        if (glg1Var instanceof glg1) {
            glg1 glg1Var2 = glg1Var;
            int size = glg1Var2.f1.size();
            while (i < size) {
                z(glg1Var2.V(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (ej30.k(((jhg1) glg1Var).e)) {
            ArrayList arrayList3 = ((jhg1) glg1Var).f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    glg1Var.b((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    glg1Var.H((View) arrayList.get(size3));
                }
            }
        }
    }
}
