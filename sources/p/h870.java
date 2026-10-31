package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h870 extends i770 {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h870(Class cls, byte b) {
        super(cls, (byte) 1);
        this.d = b;
    }

    @Override // p.i770, p.f770
    public void f(nx40 nx40Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        switch (this.d) {
            case 1:
                hh51 hh51Var = (hh51) nx40Var;
                super.f(hh51Var, y570Var, l670Var, yfuVar);
                hh51Var.f.setText(((id70) y570Var.n()).a.b);
                break;
            case 2:
                ih51 ih51Var = (ih51) nx40Var;
                super.f(ih51Var, y570Var, l670Var, yfuVar);
                ih51Var.f.setText(((id70) y570Var.n()).a.b);
                break;
            case 3:
            case 4:
            case 5:
            default:
                super.f(nx40Var, y570Var, l670Var, yfuVar);
                break;
            case 6:
                f((bh51) nx40Var, y570Var, l670Var, yfuVar);
                break;
            case 7:
                f((bh51) nx40Var, y570Var, l670Var, yfuVar);
                break;
            case 8:
                f((bh51) nx40Var, y570Var, l670Var, yfuVar);
                break;
            case 9:
                ih51 ih51Var2 = (ih51) nx40Var;
                super.f(ih51Var2, y570Var, l670Var, yfuVar);
                ih51Var2.f.setText(((id70) y570Var.n()).a.d);
                break;
            case 10:
                hh51 hh51Var2 = (hh51) nx40Var;
                super.f(hh51Var2, y570Var, l670Var, yfuVar);
                hh51Var2.f.setText(((id70) y570Var.n()).a.b);
                break;
        }
    }

    @Override // p.f770
    public final nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        switch (this.d) {
            case 0:
                boolean z = l670Var.k;
                View viewInflate = LayoutInflater.from(context).inflate(2131626174, viewGroup, false);
                bh51 bh51Var = new bh51(viewInflate, z);
                viewInflate.setTag(2131429011, bh51Var);
                return bh51Var;
            case 1:
                View viewInflate2 = LayoutInflater.from(context).inflate(2131626178, viewGroup, false);
                hh51 hh51Var = new hh51(viewInflate2);
                viewInflate2.setTag(2131429011, hh51Var);
                return hh51Var;
            case 2:
                boolean z2 = l670Var.k;
                View viewInflate3 = LayoutInflater.from(context).inflate(2131626179, viewGroup, false);
                ih51 ih51Var = new ih51(viewInflate3, z2);
                viewInflate3.setTag(2131429011, ih51Var);
                return ih51Var;
            case 3:
                boolean z3 = l670Var.k;
                View viewInflate4 = LayoutInflater.from(context).inflate(2131626175, viewGroup, false);
                bh51 bh51Var2 = new bh51(viewInflate4, z3);
                viewInflate4.setTag(2131429011, bh51Var2);
                return bh51Var2;
            case 4:
                boolean z4 = l670Var.k;
                View viewInflate5 = LayoutInflater.from(context).inflate(2131626176, viewGroup, false);
                bh51 bh51Var3 = new bh51(viewInflate5, z4);
                viewInflate5.setTag(2131429011, bh51Var3);
                return bh51Var3;
            case 5:
                boolean z5 = l670Var.k;
                View viewInflate6 = LayoutInflater.from(context).inflate(2131626177, viewGroup, false);
                bh51 bh51Var4 = new bh51(viewInflate6, z5);
                viewInflate6.setTag(2131429011, bh51Var4);
                return bh51Var4;
            case 6:
                boolean z6 = l670Var.k;
                View viewInflate7 = LayoutInflater.from(context).inflate(2131626176, viewGroup, false);
                bh51 bh51Var5 = new bh51(viewInflate7, z6);
                viewInflate7.setTag(2131429011, bh51Var5);
                return bh51Var5;
            case 7:
                boolean z7 = l670Var.k;
                View viewInflate8 = LayoutInflater.from(context).inflate(2131626177, viewGroup, false);
                bh51 bh51Var6 = new bh51(viewInflate8, z7);
                viewInflate8.setTag(2131429011, bh51Var6);
                return bh51Var6;
            case 8:
                boolean z8 = l670Var.k;
                View viewInflate9 = LayoutInflater.from(context).inflate(2131626174, viewGroup, false);
                bh51 bh51Var7 = new bh51(viewInflate9, z8);
                viewInflate9.setTag(2131429011, bh51Var7);
                return bh51Var7;
            case 9:
                boolean z9 = l670Var.k;
                View viewInflate10 = LayoutInflater.from(context).inflate(2131626179, viewGroup, false);
                ih51 ih51Var2 = new ih51(viewInflate10, z9);
                viewInflate10.setTag(2131429011, ih51Var2);
                return ih51Var2;
            default:
                View viewInflate11 = LayoutInflater.from(context).inflate(2131626178, viewGroup, false);
                hh51 hh51Var2 = new hh51(viewInflate11);
                viewInflate11.setTag(2131429011, hh51Var2);
                return hh51Var2;
        }
    }

    @Override // p.i770
    /* JADX INFO: renamed from: i */
    public void f(bh51 bh51Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        switch (this.d) {
            case 1:
                hh51 hh51Var = (hh51) bh51Var;
                super.f(hh51Var, y570Var, l670Var, yfuVar);
                hh51Var.f.setText(((id70) y570Var.n()).a.b);
                break;
            case 2:
                ih51 ih51Var = (ih51) bh51Var;
                super.f(ih51Var, y570Var, l670Var, yfuVar);
                ih51Var.f.setText(((id70) y570Var.n()).a.b);
                break;
            case 9:
                ih51 ih51Var2 = (ih51) bh51Var;
                super.f(ih51Var2, y570Var, l670Var, yfuVar);
                ih51Var2.f.setText(((id70) y570Var.n()).a.d);
                break;
            case 10:
                hh51 hh51Var2 = (hh51) bh51Var;
                super.f(hh51Var2, y570Var, l670Var, yfuVar);
                hh51Var2.f.setText(((id70) y570Var.n()).a.b);
                break;
            default:
                super.f(bh51Var, y570Var, l670Var, yfuVar);
                break;
        }
    }
}
