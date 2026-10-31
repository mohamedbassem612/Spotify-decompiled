package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class an extends z511 {
    public final /* synthetic */ byte d;
    public Object e;
    public final Object f;
    public Object g;

    public an(dg30 dg30Var, k8e k8eVar) {
        this.d = (byte) 1;
        this.f = dg30Var;
        this.g = k8eVar;
        this.e = z6x.a;
    }

    public ArrayList A(mh90 mh90Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add(new olc1(mh90Var));
        }
        for (rh90 rh90Var : mh90Var.f) {
            int i = 0;
            if (rh90Var instanceof rh90) {
                arrayList.add(new olc1(rh90Var));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                rh90 rh90Var2 = rh90Var;
                yge ygeVar = rh90Var2.e;
                if (ygeVar.b != null) {
                    linkedHashSet.add(kfe.a);
                }
                if (ygeVar.a != null) {
                    linkedHashSet.add(kfe.b);
                }
                for (Object obj : linkedHashSet) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList.add(new tge(rh90Var, (kfe) obj, new g90((Object) this, i, (Object) rh90Var2, (byte) 21)));
                    i = i2;
                }
            } else {
                if (!(rh90Var instanceof mh90)) {
                    eg.o();
                    return null;
                }
                A((mh90) rh90Var, false);
            }
        }
        return arrayList;
    }

    public final int e() {
        switch (this.d) {
            case 0:
                return ((List) this.e).size();
            case 1:
                return ((List) this.e).size();
            case 2:
                return ((List) this.e).size();
            case 3:
                return ((List) this.e).size();
            case 4:
                return ((List) this.e).size();
            case 5:
                return ((ArrayList) ((c21) this.e).f).size();
            default:
                return ((List) this.e).size();
        }
    }

    public int g(int i) {
        switch (this.d) {
            case 1:
                mto0 mto0Var = (mto0) ((List) this.e).get(i);
                if (mto0Var instanceof z8e) {
                    return 1;
                }
                if (mto0Var instanceof tge) {
                    return 2;
                }
                return mto0Var instanceof olc1 ? 3 : -1;
            case 2:
                return !u890.j(((lx10) ((List) this.e).get(i)).a, "opt_out_confirm") ? 1 : 0;
            case 3:
            case 4:
            default:
                return super.g(i);
            case 5:
                return ((c21) this.e).p(i);
        }
    }

    public final void n(int i, w611 w611Var) {
        byte b = this.d;
        Object obj = this.f;
        switch (b) {
            case 0:
                zm zmVar = (zm) w611Var;
                ho hoVar = (ho) ((List) this.e).get(i);
                qzh qzhVar = zmVar.U0;
                qzhVar.f(new mp(hoVar.getName(), hoVar.getAvatar(), hoVar.getColor()));
                qzhVar.n(new ym(zmVar.V0, i, (byte) 0));
                break;
            case 1:
                ((mto0) ((List) this.e).get(i)).a((dg30) obj, ((ox40) w611Var).U0);
                break;
            case 2:
                ps10 ps10Var = (ps10) w611Var;
                lx10 lx10Var = (lx10) ((List) this.e).get(i);
                TextView textView = ps10Var.V0;
                textView.setText(lx10Var.b);
                textView.setOnClickListener(new cvr(ps10Var, lx10Var, (byte) 28));
                break;
            case 3:
                khg0 khg0Var = (khg0) w611Var;
                hji0 hji0Var = (hji0) ((List) this.e).get(i);
                yir yirVar = khg0Var.U0;
                yirVar.f(new mni0(hji0Var));
                yirVar.n(new j2d0(khg0Var.V0, hji0Var, (byte) 24));
                break;
            case 4:
                ((zpm0) w611Var).U0.h(new l07(new g07((String) ((List) this.e).get(i)), false));
                break;
            case 5:
                ((c21) this.e).g((u1i) w611Var, i, (Object) null);
                ((l0x0) obj).v(i);
                break;
            default:
                int iIntValue = ((Number) ((List) this.e).get(i)).intValue();
                Button button = ((nqa1) w611Var).U0;
                button.setText((CharSequence) ((lss) obj).invoke(Integer.valueOf(iIntValue)));
                button.setOnClickListener(new oja(this, iIntValue, (byte) 3));
                break;
        }
    }

    public void o(w611 w611Var, int i, List list) {
        switch (this.d) {
            case 5:
                ((c21) this.e).g((u1i) w611Var, i, o7h.s0(list));
                ((l0x0) this.f).v(i);
                break;
            default:
                super.o(w611Var, i, list);
                break;
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        View viewInflate;
        byte b = this.d;
        Object obj = this.f;
        switch (b) {
            case 0:
                return new zm(this, ((pp) obj).a((l0i) null));
            case 1:
                dg30 dg30Var = (dg30) obj;
                s7s0 s7s0VarR = t890.r(dg30Var, viewGroup, 2131625034);
                vw31 vw31Var = new vw31(s7s0VarR);
                s7s0VarR.setTag(2131429011, vw31Var);
                vw31Var.i(new SwitchCompat(dg30Var));
                return new ox40(vw31Var);
            case 2:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                if (i == 0) {
                    viewInflate = layoutInflater.inflate(2131625131, viewGroup, false);
                } else {
                    if (i != 1) {
                        hhg1.n("Unknown view type");
                        return null;
                    }
                    viewInflate = layoutInflater.inflate(2131625130, viewGroup, false);
                }
                viewInflate.getClass();
                return new ps10(viewInflate, (os10) this.g);
            case 3:
                return new khg0(this, ((zfx) obj).a(null));
            case 4:
                int i2 = zpm0.V0;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from((Context) obj);
                f47 f47Var = (f47) this.g;
                View viewInflate2 = layoutInflaterFrom.inflate(2131624078, viewGroup, false);
                b8k1.n(viewInflate2, 2131427618).setViewContext(f47Var);
                viewInflate2.getClass();
                return new zpm0(viewInflate2);
            case 5:
                return ((c21) this.e).j(i, viewGroup, (bkl) this.g);
            default:
                View viewL = eqq.l(viewGroup, 2131626188, viewGroup, false);
                if (viewL != null) {
                    Button button = (Button) viewL;
                    return new nqa1(new r2a1(button, button, (byte) 9));
                }
                bhn0.i("rootView");
                return null;
        }
    }

    public an(List list, lss lssVar) {
        this.d = (byte) 6;
        this.e = list;
        this.f = lssVar;
    }

    public an(zfx zfxVar) {
        this.d = (byte) 3;
        this.e = z6x.a;
        this.f = zfxVar;
    }

    public an(Context context, List list, f47 f47Var) {
        this.d = (byte) 4;
        this.f = context;
        this.e = list;
        this.g = f47Var;
    }

    public /* synthetic */ an(Object obj, Object obj2, Object obj3, byte b) {
        this.d = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }
}
