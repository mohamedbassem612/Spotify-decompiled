package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bwa implements g4h1 {
    public final zva a;
    public final ynb0 b;
    public final Flowable c;
    public final gw70 d;
    public final Scheduler e;
    public final gxn f;
    public final xf4 g;
    public wva h;

    public bwa(zva zvaVar, ynb0 ynb0Var, Flowable flowable, gw70 gw70Var, Scheduler scheduler, gxn gxnVar, xf4 xf4Var) {
        this.a = zvaVar;
        this.b = ynb0Var;
        this.c = flowable;
        this.d = gw70Var;
        this.e = scheduler;
        this.f = gxnVar;
        this.g = xf4Var;
    }

    public final f4h1 a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Matcher matcher;
        zzg1 zzg1Var;
        Observable observable;
        String str = this.a.a;
        zzg1[] zzg1VarArrValues = zzg1.values();
        int iS = zno1.s(zzg1VarArrValues.length);
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        int i = 0;
        for (zzg1 zzg1Var2 : zzg1VarArrValues) {
            linkedHashMap.put(zzg1Var2, Pattern.compile("(spotify:artist:([a-zA-Z0-9]+))".concat(zzg1Var2.a)));
        }
        zzg1[] zzg1VarArrValues2 = zzg1.values();
        int length = zzg1VarArrValues2.length;
        Matcher matcher2 = null;
        while (true) {
            if (i >= length) {
                matcher = matcher2;
                zzg1Var = null;
                break;
            }
            zzg1Var = zzg1VarArrValues2[i];
            Object obj = linkedHashMap.get(zzg1Var);
            obj.getClass();
            matcher = ((Pattern) obj).matcher(str);
            if (matcher.find()) {
                break;
            }
            i++;
            matcher2 = matcher;
        }
        if (zzg1Var == null) {
            hhg1.n("Specified artistUri doesn't match any type");
            return null;
        }
        if (matcher == null) {
            u890.C("matcher");
            throw null;
        }
        String strGroup = matcher.group(2);
        strGroup.getClass();
        rm5 rm5Var = new rm5(str, (i8h1) this.b.get());
        xf4 xf4Var = this.g;
        boolean zH = xf4Var.h();
        gxn gxnVar = this.f;
        if (zH) {
            observable = gxnVar.b(strGroup).toObservable();
            observable.getClass();
        } else {
            observable = gxnVar.a(strGroup).toObservable();
            observable.getClass();
        }
        Observable observable2 = observable;
        tva tvaVar = new tva(context, layoutInflater, this.d, rm5Var, xoi1.a(context), xf4Var.z(), xf4Var.A());
        tvaVar.h = this.h;
        ewa ewaVar = new ewa(this.e, observable2, new ObservableFromPublisher(this.c), rm5Var, tvaVar, str);
        tvaVar.i = new tla(ewaVar, (byte) 7);
        int i2 = kgr0.T0;
        return new awa(xyn1.z(tvaVar.g), ewaVar, tvaVar, bundle);
    }

    public final void b(wva wvaVar) {
        this.h = wvaVar;
    }
}
