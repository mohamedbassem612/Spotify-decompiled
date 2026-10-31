package p;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.spotify.reporting.reportaction.ReportWebViewActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ia0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oa0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ia0(oa0 oa0Var, byte b) {
        super(3);
        this.a = b;
        this.b = oa0Var;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x02e1  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w7h1 w7h1Var;
        byte b = this.a;
        oa0 oa0Var = this.b;
        switch (b) {
            case 0:
                tqw tqwVar = (tqw) obj3;
                goq goqVar = oa0Var.d;
                Activity activity = oa0Var.a;
                tom tomVar = oa0Var.h;
                ga0 ga0Var = ((x90) obj2).a;
                if (ga0Var.equals(fa0.d)) {
                    int i = ReportWebViewActivity.f1;
                    oa0Var.b.a(v9p1.A(activity.getApplication(), (String) oa0Var.Y.getValue()));
                } else if (ga0Var instanceof y90) {
                    String str = ((y90) ga0Var).d;
                    ClipboardManager clipboardManager = (ClipboardManager) activity.getApplication().getSystemService(ClipboardManager.class);
                    if (clipboardManager != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("", str));
                    }
                } else if (ga0Var instanceof ea0) {
                    ea0 ea0Var = (ea0) ga0Var;
                    ArrayList<ca0> arrayList = ea0Var.d;
                    ArrayList arrayList2 = ea0Var.e;
                    if (!arrayList.isEmpty()) {
                        twu twuVar = oa0Var.e;
                        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                        for (ca0 ca0Var : arrayList) {
                            arrayList3.add(new cxu(ca0Var.a, ca0Var.b, ca0Var.c));
                        }
                        twuVar.b(arrayList3);
                    }
                    if (!arrayList2.isEmpty()) {
                        r2v r2vVar = oa0Var.f;
                        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(new a3v(((da0) it.next()).a));
                        }
                        r2vVar.b(arrayList4);
                    }
                } else if (ga0Var instanceof z90) {
                    tv80 tv80VarD = cvl1.d(tqwVar);
                    boolean z = ((z90) ga0Var).d;
                    mxr mxrVar = oa0Var.c;
                    y6t y6tVar = new y6t(tomVar);
                    if (z) {
                        qf4 qf4Var = ((add) mxrVar.a).a;
                        if (qf4Var.h() && qf4Var.r()) {
                            ((yhm) mxrVar.b).a(y6tVar, tv80VarD);
                        } else {
                            String str2 = tomVar.a;
                            Set set = pcf.a;
                            String strConcat = "spotify:chat-message:".concat(str2);
                            mfm mfmVarA = ((i4q) mxrVar.c).a(new lik1(strConcat));
                            m441 m441Var = new m441(new us0(mxrVar, y6tVar, (lnm) null, (byte) 29));
                            AtomicReferenceArray atomicReferenceArray = p6r0.e;
                            mfm.d(mfmVarA, m441Var, yon1.d1(), new bjm(6, strConcat, (String) null), tv80VarD, 16);
                        }
                    } else {
                        String str3 = tomVar.a;
                        Set set2 = pcf.a;
                        String strConcat2 = "spotify:chat-message:".concat(str3);
                        mfm mfmVarA2 = ((i4q) mxrVar.c).a(new lik1(strConcat2));
                        m441 m441Var2 = new m441(new us0(mxrVar, y6tVar, (lnm) null, (byte) 29));
                        AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                        mfm.d(mfmVarA2, m441Var2, yon1.d1(), new bjm(6, strConcat2, (String) null), tv80VarD, 16);
                    }
                } else if (ga0Var.equals(ba0.d)) {
                    goqVar.c(tomVar, true);
                } else {
                    if (!ga0Var.equals(aa0.d)) {
                        eg.o();
                        return null;
                    }
                    goqVar.b(tomVar, false);
                }
                oa0Var.i.invoke();
                return rih1.a;
            default:
                x90 x90Var = (x90) obj3;
                int i2 = x90Var.b;
                ga0 ga0Var2 = x90Var.a;
                boolean zEquals = ga0Var2.equals(fa0.d);
                b7x b7xVar = b7x.a;
                if (zEquals) {
                    qvk0 qvk0VarE = oa0Var.e();
                    Integer numValueOf = Integer.valueOf(i2);
                    qvk0VarE.getClass();
                    x6h1 x6h1VarC = qvk0VarE.a.c();
                    x6h1VarC.i.add(new a7h1("actions", (String) null, numValueOf, (String) null, "report"));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    String str4 = (String) oa0Var.Y.getValue();
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else if (ga0Var2 instanceof y90) {
                    qvk0 qvk0VarE2 = oa0Var.e();
                    Integer numValueOf2 = Integer.valueOf(i2);
                    qvk0VarE2.getClass();
                    x6h1 x6h1VarC2 = qvk0VarE2.a.c();
                    x6h1VarC2.i.add(new a7h1("actions", (String) null, numValueOf2, (String) null, "copy"));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("copy_to_clipboard", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                } else if (ga0Var2 instanceof ea0) {
                    qvk0 qvk0VarE3 = oa0Var.e();
                    Integer numValueOf3 = Integer.valueOf(i2);
                    qvk0VarE3.getClass();
                    x6h1 x6h1VarC3 = qvk0VarE3.a.c();
                    x6h1VarC3.i.add(new a7h1("actions", (String) null, numValueOf3, (String) null, "download"));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                } else if (ga0Var2 instanceof z90) {
                    qvk0 qvk0VarE4 = oa0Var.e();
                    Integer numValueOf4 = Integer.valueOf(i2);
                    qvk0VarE4.getClass();
                    x6h1 x6h1VarC4 = qvk0VarE4.a.c();
                    x6h1VarC4.i.add(new a7h1("actions", (String) null, numValueOf4, (String) null, "delete"));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                } else if (ga0Var2.equals(ba0.d)) {
                    qvk0 qvk0VarE5 = oa0Var.e();
                    Integer numValueOf5 = Integer.valueOf(i2);
                    qvk0VarE5.getClass();
                    x6h1 x6h1VarC5 = qvk0VarE5.a.c();
                    x6h1VarC5.i.add(new a7h1("actions", (String) null, numValueOf5, (String) null, "delete_for_you"));
                    x6h1VarC5.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!ga0Var2.equals(aa0.d)) {
                        eg.o();
                        return null;
                    }
                    qvk0 qvk0VarE6 = oa0Var.e();
                    Integer numValueOf6 = Integer.valueOf(i2);
                    qvk0VarE6.getClass();
                    x6h1 x6h1VarC6 = qvk0VarE6.a.c();
                    x6h1VarC6.i.add(new a7h1("actions", (String) null, numValueOf6, (String) null, "delete"));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
        }
    }
}
