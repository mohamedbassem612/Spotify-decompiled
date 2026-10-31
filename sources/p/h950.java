package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h950 implements iyf0 {
    public final lzn0 a;
    public final bm00 b;
    public final PublishSubject c;
    public final dg30 d;
    public faa0 e;
    public faa0 f;
    public final llm g;
    public xa50 h;
    public String i;
    public final idd1 t = new idd1(new g050(this, (byte) 4));

    public h950(lzn0 lzn0Var, bm00 bm00Var, PublishSubject publishSubject, dg30 dg30Var, q8n q8nVar) {
        this.a = lzn0Var;
        this.b = bm00Var;
        this.c = publishSubject;
        this.d = dg30Var;
        this.g = smo1.e(q8nVar);
    }

    public final void a(lik1 lik1Var) {
        String str = lik1Var.a;
        this.i = str;
        dwn0 dwn0VarH = rrn1.w(str).h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("managed_by_graduation_launcher_plugin", true);
        this.a.i(dwn0VarH, bundle);
    }

    public final void b(xa50 xa50Var) {
        switch (xa50Var.ordinal()) {
            case 0:
            case 1:
            case 5:
            case 8:
                if (this.i != null) {
                    this.i = null;
                    this.a.e();
                }
                break;
            case 2:
                a(nik1.a4);
                break;
            case 3:
                a(nik1.c4);
                break;
            case 4:
                a(nik1.d4);
                break;
            case 6:
                a(nik1.g4);
                break;
            case 7:
                a(nik1.h4);
                break;
            case 9:
                this.i = nik1.b4.a;
                dg30 dg30Var = this.d;
                dg30Var.startActivity(new Intent((Context) dg30Var, (Class<?>) ForcedGraduationLockActivity.class));
                break;
            default:
                eg.o();
                break;
        }
    }

    @Override // p.iyf0
    public final void c() {
        faa0 faa0Var = this.e;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        mx mxVar = new mx(this, (lnm) null, (byte) 24);
        llm llmVar = this.g;
        this.e = c921.y(llmVar, (o8n) null, 0, mxVar, 3);
        faa0 faa0Var2 = this.f;
        if (faa0Var2 != null) {
            faa0Var2.d(null);
        }
        this.f = c921.y(llmVar, (o8n) null, 0, new j020(this, (lnm) null, (byte) 20), 3);
    }

    @Override // p.iyf0
    public final void d() {
        faa0 faa0Var = this.e;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        faa0 faa0Var2 = this.f;
        if (faa0Var2 != null) {
            faa0Var2.d(null);
        }
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
        idd1 idd1Var = this.t;
        ((oe41) idd1Var.getValue()).c("graduation_launcher_plugin_saved_state", new uk(this, (byte) 6));
        Bundle bundleA = ((oe41) idd1Var.getValue()).a("graduation_launcher_plugin_saved_state");
        if (bundleA != null) {
            Serializable serializable = bundleA.getSerializable("graduation_status");
            this.h = serializable instanceof xa50 ? (xa50) serializable : null;
            this.i = bundleA.getString("current_message");
        }
    }
}
