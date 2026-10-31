package com.spotify.connect.mediarouteactivity.jam;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.a7h1;
import p.b7x;
import p.blc0;
import p.bp90;
import p.c9c0;
import p.f7b1;
import p.fn31;
import p.g0l;
import p.i3o1;
import p.inr;
import p.ip31;
import p.kk0;
import p.kly0;
import p.kx40;
import p.l0l;
import p.lir0;
import p.llm;
import p.lnm;
import p.lwh0;
import p.m0s;
import p.mir0;
import p.mzo;
import p.nhc1;
import p.nik1;
import p.o7h;
import p.o8n;
import p.owh0;
import p.p6r0;
import p.pdp0;
import p.q7h;
import p.qo90;
import p.r6h1;
import p.rih1;
import p.u890;
import p.w6b1;
import p.w7h1;
import p.x6h1;
import p.x7h1;
import p.y6h1;
import p.yon1;
import p.z7h1;
import p.zlo;
import p.zor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/connect/mediarouteactivity/jam/OutputSwitcherJamLauncherActivity;", "Lp/mzo;", "Lp/lir0;", "<init>", "()V", "src_main_java_com_spotify_connect_mediarouteactivity-mediarouteactivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OutputSwitcherJamLauncherActivity extends mzo implements lir0 {
    public ip31 b1;

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("CONNECT_OUTPUTSWITCHERDEVICEPICKER", "connect/outputSwitcherDevicePicker", 398, "connect"), nik1.E2.a(), 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.mzo
    public final void onCreate(Bundle bundle) {
        String string;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        super.onCreate(bundle);
        ip31 ip31Var = this.b1;
        if (ip31Var == null) {
            u890.C("jamLauncher");
            throw null;
        }
        Intent intent = getIntent();
        pdp0 pdp0Var = new pdp0(this, (byte) 26);
        c9c0 c9c0Var = (c9c0) ip31Var.e;
        inr inrVar = (g0l) ip31Var.c;
        Bundle extras = intent.getExtras();
        if (extras == null || (string = extras.getString("android.media.extra.ROUTE_ID")) == null) {
            string = "";
        }
        inr inrVar2 = inrVar;
        Iterator it = inrVar2.i().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!nhc1.R(string, ((l0l) next).d(), false));
        l0l l0lVar = (l0l) next;
        if (l0lVar == null) {
            List listI = inrVar2.i();
            ArrayList arrayList = new ArrayList(q7h.U(listI, 10));
            Iterator it2 = listI.iterator();
            while (it2.hasNext()) {
                ((l0l) it2.next()).getClass();
                arrayList.add(rih1.a);
            }
            ((owh0) ip31Var.b).getClass();
            owh0.b();
            Iterator it3 = owh0.c().i.iterator();
            do {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
            } while (!nhc1.R(((lwh0) next3).c, string, false));
            lwh0 lwh0Var = (lwh0) next3;
            Iterator it4 = inrVar2.i().iterator();
            do {
                if (!it4.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it4.next();
            } while (!u890.j(((l0l) next4).getName(), lwh0Var != null ? lwh0Var.d : null));
            l0lVar = (l0l) next4;
        }
        if (l0lVar != null) {
            boolean zIsActive = l0lVar.isActive();
            m0s m0sVar = (m0s) ip31Var.g;
            b7x b7xVar = b7x.a;
            if (zIsActive) {
                String str = l0lVar.G().a;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-connect-google-output-switcher";
                x6h1VarI.f = "3.2.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarR = kk0.r(x6h1VarI, "background");
                x6h1VarR.i.add(new a7h1("container_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = false;
                x6h1 x6h1VarC = x6h1VarR.a().c();
                x6h1VarC.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("active_device_with_jam", str, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                String strA = m0sVar.a(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", yon1.G1("SOCIAL_LISTENING_PARTICIPANTLIST", "social-listening/participantlist", 1911, "social-listening").c)), y6h1VarA, r6h1.c, System.currentTimeMillis()));
                w6b1 w6b1VarA = f7b1.a(blc0.g5);
                w6b1VarA.getClass();
                String str2 = (String) o7h.q0(w6b1VarA.c);
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(str2));
                intent2.setClassName((Context) this, (String) ((kly0) ip31Var.h).get());
                intent2.putExtra("DEVICE_PICKER_INTERACTION_ID", strA);
                intent2.putExtra("DEVICE_PICKER_OPEN_PARTICIPANTS", true);
                startActivity(intent2);
            } else {
                String str3 = l0lVar.G().a;
                boolean zW = l0lVar.w();
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-connect-google-output-switcher";
                x6h1VarI2.f = "3.2.0";
                x6h1VarI2.g = "22.0.0";
                x6h1 x6h1VarR2 = kk0.r(x6h1VarI2, "background");
                x6h1VarR2.i.add(new a7h1("container_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR2.j = false;
                x6h1 x6h1VarC3 = x6h1VarR2.a().c();
                x6h1VarC3.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA2 = x6h1VarC3.a();
                String str4 = zW ? "suggested" : "";
                x6h1 x6h1VarC4 = y6h1VarA2.c();
                x6h1VarC4.i.add(new a7h1("remote_device", str3, (Integer) null, (String) null, str4));
                x6h1VarC4.j = false;
                String strA2 = m0sVar.a(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()));
                String strD = l0lVar.d();
                Iterator it5 = ((Iterable) c9c0Var.c.available().getValue()).iterator();
                do {
                    if (!it5.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it5.next();
                } while (!u890.j(((qo90) next2).e.a, strD));
                qo90 qo90Var = (qo90) next2;
                bp90 bp90Var = (bp90) c9c0Var.e.a().getValue();
                if ((bp90Var.b || bp90Var.d) && qo90Var != null) {
                    fn31.T((llm) ip31Var.i, (o8n) null, 0, new zlo(ip31Var, strA2, qo90Var, (lnm) null, (byte) 10), 3);
                } else {
                    zor.k((zor) ip31Var.d, l0lVar.j(), strA2, 20);
                }
            }
        }
        pdp0Var.invoke();
    }
}
