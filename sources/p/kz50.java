package p;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kz50 implements d021 {
    public Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public final Object h;

    public kz50(ne neVar, cxc cxcVar, lmw lmwVar, hm61 hm61Var) {
        pz11 pz11Var = hm61Var.b;
        pw21 pw21Var = qw21.a;
        ne neVarB = sqe.B(cxcVar);
        pw21Var.getClass();
        qw21 qw21VarA = pw21.a(neVarB);
        mta mtaVar = new mta((byte) 2);
        xav0 xav0Var = hm61Var.c;
        this.a = t9w.a(neVar);
        this.b = qw21VarA;
        this.c = mtaVar;
        this.d = neVar;
        this.e = xav0Var;
        this.f = new AtomicLong(0L);
        this.g = new rm5(neVar, new aq80(lmwVar, pz11Var, xav0Var, (byte) 1));
        this.h = new jkt0(this, (byte) 13);
    }

    public static void f(y1g0 y1g0Var) {
        lz40 lz40Var = lz40.e;
        Context context = y1g0Var.getContext();
        int iC = lz40Var.c(context, mz40.a);
        String strC = x8n1.c(context, iC);
        String strE = x8n1.e(context, iC);
        LinearLayout linearLayout = new LinearLayout(y1g0Var.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        y1g0Var.addView(linearLayout);
        TextView textView = new TextView(y1g0Var.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strC);
        linearLayout.addView(textView);
        Intent intentA = lz40Var.a(iC, context, (String) null);
        if (intentA != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strE);
            linearLayout.addView(button);
            button.setOnClickListener(new ond(context, intentA, (byte) 2));
        }
    }

    @Override // p.d021
    public Single a() {
        return Single.fromCallable(new w0c1((ne) this.d, (byte) 0)).subscribeOn(Schedulers.c);
    }

    @Override // p.d021
    public Single b(x020 x020Var) {
        ResolveRequest resolveRequestA = otk.a(x020Var, (xav0) this.e);
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        utw0Var.z("Request: " + resolveRequestA, new Object[0]);
        return ((qw21) this.b).c(resolveRequestA).doOnSubscribe(new z2a1(this, (byte) 25)).doOnSuccess((jkt0) this.h).compose(new yc31()).doOnSuccess(new cj9(this, x020Var, (byte) 7)).doOnError(wx91.i).doOnError(new z0u0(this, x020Var, (byte) 29)).map(new h5a1(this, (byte) 17)).onErrorReturnItem(c020.a).subscribeOn(Schedulers.c);
    }

    @Override // p.d021
    public void c(Context context) {
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        utw0Var.A("Calling unscheduleRecurringSyncUsingWorkManager on UnauthFetcher does nothing.", new Object[0]);
    }

    @Override // p.d021
    public Completable d() {
        CompletableEmpty completableEmpty = CompletableEmpty.a;
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        utw0Var.A("Calling onReconnect on UnauthFetcher does nothing.", new Object[0]);
        return completableEmpty;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.maps.model.RuntimeRemoteException */
    public void e() throws RuntimeRemoteException {
        o8n1 o8n1Var = new o8n1(this);
        if (((zrj1) this.a) != null) {
            o8n1Var.a();
            return;
        }
        LinkedList linkedList = (LinkedList) this.b;
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.b = linkedList;
        }
        linkedList.add(o8n1Var);
        utw0 utw0Var = (utw0) this.c;
        this.f = utw0Var;
        ArrayList arrayList = (ArrayList) this.h;
        Context context = (Context) this.e;
        if (utw0Var == null || ((zrj1) this.a) != null) {
            return;
        }
        try {
            rqg0.z(context);
            qso1 qso1VarH1 = hm5.R(context).h1(new qfp0(context), (GoogleMapOptions) this.g);
            if (qso1VarH1 == null) {
                return;
            }
            ((utw0) this.f).w(new zrj1((y1g0) this.d, qso1VarH1));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((zrj1) this.a).g((iyi1) it.next());
            }
            arrayList.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    public kz50(y1g0 y1g0Var, Context context, GoogleMapOptions googleMapOptions) {
        this.c = new utw0(this);
        this.h = new ArrayList();
        this.d = y1g0Var;
        this.e = context;
        this.g = googleMapOptions;
    }

    public kz50(v7m0 v7m0Var, cce cceVar, gw70 gw70Var, pe peVar, q9l1 q9l1Var, dbp dbpVar, ComposeView composeView) {
        this.a = v7m0Var;
        this.b = cceVar;
        this.c = gw70Var;
        this.d = peVar;
        this.e = q9l1Var;
        this.f = dbpVar;
        this.g = gio1.b((Object) null);
        this.h = gio1.b(Boolean.FALSE);
        composeView.setContent(apo.j(1090796706, new jz50(this, (byte) 2), true));
    }

    public kz50(l670 l670Var) {
        this.d = new oc70();
        this.e = op71.E(new dp5(this, (byte) 20));
        this.h = new nc70(this);
        l670Var.getClass();
        uo5 uo5Var = new uo5(l670Var);
        this.c = uo5Var;
        t470 t470Var = new t470(this, uo5Var);
        this.b = t470Var;
        this.a = new zsc(l670Var, uo5Var, t470Var);
    }
}
