package p;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class vpq0 {
    public static final pl10[] a = new pl10[0];
    public static final pl10 b;
    public static final mmn1 c;

    static {
        pl10 pl10Var = new pl10("vision.barcode", 1L);
        pl10 pl10Var2 = new pl10("vision.custom.ica", 1L);
        pl10 pl10Var3 = new pl10("vision.face", 1L);
        pl10 pl10Var4 = new pl10("vision.ica", 1L);
        pl10 pl10Var5 = new pl10("vision.ocr", 1L);
        b = pl10Var5;
        pl10 pl10Var6 = new pl10("mlkit.langid", 1L);
        pl10 pl10Var7 = new pl10("mlkit.nlclassifier", 1L);
        pl10 pl10Var8 = new pl10("tflite_dynamite", 1L);
        pl10 pl10Var9 = new pl10("mlkit.barcode.ui", 1L);
        pl10 pl10Var10 = new pl10("mlkit.smartreply", 1L);
        dna1 dna1Var = new dna1();
        dna1Var.b("barcode", pl10Var);
        dna1Var.b("custom_ica", pl10Var2);
        dna1Var.b("face", pl10Var3);
        dna1Var.b("ica", pl10Var4);
        dna1Var.b("ocr", pl10Var5);
        dna1Var.b("langid", pl10Var6);
        dna1Var.b("nlclassifier", pl10Var7);
        dna1Var.b("tflite_dynamite", pl10Var8);
        dna1Var.b("barcode_ui", pl10Var9);
        dna1Var.b("smart_reply", pl10Var10);
        sfn1 sfn1Var = (sfn1) dna1Var.c;
        if (sfn1Var != null) {
            throw sfn1Var.a();
        }
        mmn1 mmn1VarC = mmn1.c(dna1Var.a, (Object[]) dna1Var.b, dna1Var);
        sfn1 sfn1Var2 = (sfn1) dna1Var.c;
        if (sfn1Var2 != null) {
            throw sfn1Var2.a();
        }
        c = mmn1VarC;
        dna1 dna1Var2 = new dna1();
        dna1Var2.b("com.google.android.gms.vision.barcode", pl10Var);
        dna1Var2.b("com.google.android.gms.vision.custom.ica", pl10Var2);
        dna1Var2.b("com.google.android.gms.vision.face", pl10Var3);
        dna1Var2.b("com.google.android.gms.vision.ica", pl10Var4);
        dna1Var2.b("com.google.android.gms.vision.ocr", pl10Var5);
        dna1Var2.b("com.google.android.gms.mlkit.langid", pl10Var6);
        dna1Var2.b("com.google.android.gms.mlkit.nlclassifier", pl10Var7);
        dna1Var2.b("com.google.android.gms.tflite_dynamite", pl10Var8);
        dna1Var2.b("com.google.android.gms.mlkit_smartreply", pl10Var10);
        sfn1 sfn1Var3 = (sfn1) dna1Var2.c;
        if (sfn1Var3 != null) {
            throw sfn1Var3.a();
        }
        mmn1.c(dna1Var2.a, (Object[]) dna1Var2.b, dna1Var2);
        sfn1 sfn1Var4 = (sfn1) dna1Var2.c;
        if (sfn1Var4 != null) {
            throw sfn1Var4.a();
        }
    }

    public static void a(Context context) {
        jen1 jen1Var = efn1.g;
        Object[] objArr = {"ocr"};
        u2o1.x(1, objArr);
        oin1 oin1Var = new oin1(1, objArr);
        mz40.b.getClass();
        if (h450.b(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join((CharSequence) ",", (Iterable) oin1Var));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        pl10[] pl10VarArr = new pl10[oin1Var.size()];
        for (int i = 0; i < oin1Var.size(); i++) {
            pl10 pl10Var = (pl10) c.get(oin1Var.get(i));
            zod.s(pl10Var);
            pl10VarArr[i] = pl10Var;
        }
        b(context, pl10VarArr);
    }

    public static void b(Context context, final pl10[] pl10VarArr) {
        hfp1 hfp1VarE;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new upq0() { // from class: p.jzo1
            @Override // p.upq0
            public final pl10[] a() {
                pl10[] pl10VarArr2 = vpq0.a;
                return pl10VarArr;
            }
        });
        zod.j("APIs must not be empty.", !arrayList.isEmpty());
        o9n1 o9n1Var = new o9n1(context, null, o9n1.n, mh5.k, jz40.c);
        fi5 fi5VarJ = fi5.j(arrayList, true);
        if (fi5VarJ.a.isEmpty()) {
            hfp1VarE = o0c.z(new cjm0(0, false));
        } else {
            asd1 asd1VarB = asd1.b();
            asd1VarB.a = new pl10[]{upo1.a};
            asd1VarB.b = true;
            asd1VarB.c = (char) 27304;
            asd1VarB.d = new frl1(o9n1Var, fi5VarJ, (byte) 12);
            hfp1VarE = o9n1Var.e(0, asd1VarB.a());
        }
        hfp1VarE.m(new xam1());
    }
}
