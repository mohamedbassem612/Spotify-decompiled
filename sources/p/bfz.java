package p;

import android.os.Bundle;
import android.view.View;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bfz implements Connectable, sek1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;

    public bfz(cr6 cr6Var, u800 u800Var, Bundle bundle, qs61 qs61Var, ufz0 ufz0Var) {
        this.a = (byte) 4;
        this.b = cr6Var;
        this.d = qs61Var;
        this.e = ufz0Var;
        this.c = new idd1(new j5z(u800Var, (byte) 1));
        if (bundle != null) {
            cr6Var.g = bundle.getParcelable("SettingsPageViewBinderImpl.savedState");
        }
    }

    public final Connection L(Consumer consumer) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                vku vkuVar = new vku();
                vkuVar.a(((PublishSubject) this.d).subscribe(new dn(consumer, (byte) 22)));
                yzu yzuVar = (yzu) obj;
                vkuVar.a(((mez) yzuVar.a).f.subscribe(new dn(consumer, (byte) 23)));
                ((qzh) ((idd1) yzuVar.d).getValue()).n(new nty(this, (byte) 19));
                return new cn(vkuVar, this, (byte) 20);
            case 1:
                xmu0 xmu0Var = (xmu0) obj;
                pee0 pee0Var = new pee0(consumer, (bfz) this.e, (byte) 6);
                ((uhs) ((o0g1) xmu0Var.b).d).n(new mwv0(pee0Var, (byte) 3));
                z0w0 z0w0Var = (z0w0) xmu0Var.c;
                z0w0Var.b.b = pee0Var;
                z0w0Var.c.b = pee0Var;
                z0w0Var.d.b = pee0Var;
                z0w0Var.e.b = pee0Var;
                z0w0Var.f.b = pee0Var;
                return new n1b0(this, (byte) 16);
            case 2:
                return new pee0(consumer, this, (byte) 6);
            case 3:
                ((vku) this.e).a(((FlowableMap) obj).J(new nhc(this, (byte) 22)).t(Functions.a).subscribe(new k1p0(consumer, (byte) 7)));
                return new n1b0(this, (byte) 24);
            default:
                Connectable[] connectableArr = {(qs61) this.d, (cr6) obj, (ufz0) this.e};
                xu2 xu2Var = new xu2(consumer, (byte) 20);
                ArrayList arrayList = new ArrayList(3);
                for (int i = 0; i < 3; i++) {
                    arrayList.add(connectableArr[i].L(xu2Var));
                }
                return new q1k(arrayList, (byte) 2);
        }
    }

    public i8h1 a() {
        return (i8h1) ((kly0) this.b).get();
    }

    public View getView() {
        return (View) ((idd1) this.c).getValue();
    }

    public bfz(FlowableMap flowableMap, xrn0 xrn0Var, tas tasVar, ln91 ln91Var) {
        this.a = (byte) 3;
        this.b = flowableMap;
        this.c = xrn0Var;
        this.d = tasVar;
        this.e = new vku();
    }

    public bfz(yzu yzuVar) {
        this.a = (byte) 0;
        this.b = yzuVar;
        this.c = new idd1(new pdy(this, (byte) 15));
        this.d = new PublishSubject();
        this.e = z6x.a;
    }

    public bfz(xmu0 xmu0Var, dzp0 dzp0Var, t2w0 t2w0Var, bfz bfzVar) {
        this.a = (byte) 1;
        this.b = xmu0Var;
        this.c = dzp0Var;
        this.d = t2w0Var;
        this.e = bfzVar;
    }

    public bfz(ywp ywpVar, zok0 zok0Var, bbm bbmVar) {
        this.a = (byte) 2;
        this.b = ywpVar;
        this.c = zok0Var;
    }
}
