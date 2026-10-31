package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bab implements ct80 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ bab(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final gt80 a(Intent intent) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        et80 et80Var = et80.a;
        switch (b) {
            case 0:
                u9b u9bVar = (u9b) obj3;
                Uri data = intent.getData();
                if (data == null) {
                    return et80Var;
                }
                if (!lcc.x(data).equals(nik1.p6.a) && (!lcc.y(data) || !u9bVar.a())) {
                    return et80Var;
                }
                if (!((v9b) obj2).a()) {
                    return (!u9bVar.a() || lcc.y(data)) ? et80Var : new ft80(new Intent("android.intent.action.VIEW", Uri.parse(new mss0().b())));
                }
                ((jab) obj).a();
                return dt80.a;
            default:
                String dataString = intent.getDataString();
                if (dataString == null) {
                    return et80Var;
                }
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(dataString);
                if (s4b1VarX.c != blc0.f6 || !((oc4) obj3).d()) {
                    return et80Var;
                }
                a0m a0mVar = (a0m) obj2;
                j851 j851Var = new j851(s4b1VarX.n("rescue_session_id"), s4b1VarX.n("suggestion_id"), s4b1VarX.n("trigger_correlation_id"), s4b1VarX.n("message_opportunity_id"));
                if (j851Var.equals(new j851())) {
                    j851Var = null;
                }
                a0mVar.i(j851Var);
                mtr mtrVar = (mtr) obj;
                if (mtrVar.d.d()) {
                    faa0 faa0Var = mtrVar.k;
                    if (faa0Var != null) {
                        faa0Var.d((CancellationException) null);
                    }
                    mtrVar.k = null;
                    if (!mtrVar.g) {
                        mtrVar.g = true;
                        mtrVar.i = c921.y(mtrVar.f, (o8n) null, 0, new n1o(mtrVar, (lnm) null, (byte) 16), 3);
                        mtrVar.b.g(mtrVar.o);
                        mtrVar.c.b.add(mtrVar.f77p);
                    }
                }
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("spotify:search"));
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    intent2.putExtras(extras);
                }
                return new ft80(intent2);
        }
    }
}
