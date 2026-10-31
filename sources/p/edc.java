package p;

import android.content.Context;
import android.content.res.TypedArray;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class edc extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edc(eyh0 eyh0Var, int i, Context context, TypedArray typedArray, int[] iArr, String[] strArr, lnm lnmVar) {
        super(2, lnmVar);
        this.c = eyh0Var;
        this.b = i;
        this.d = context;
        this.e = typedArray;
        this.f = iArr;
        this.g = strArr;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                return new edc((eyh0) obj6, this.b, (Context) obj5, (TypedArray) obj4, (int[]) obj3, (String[]) obj2, lnmVar);
            default:
                return new edc((q811) obj6, (String) obj5, (String) obj4, this.b, (ven0) obj3, (ven0) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        List listV;
        otu otuVarS;
        switch (this.a) {
            case 0:
                hm5.M(obj);
                eyh0 eyh0Var = (eyh0) this.c;
                int i = this.b;
                StringBuilder sb = new StringBuilder("emoji.v1.");
                ktd.p(b5x.O0 ? 1 : 0, i, ".", ".", sb);
                sb.append(xhh1.a("🥱") ? 1 : 0);
                String string = sb.toString();
                ddc ddcVar = new ddc((Context) this.d, (TypedArray) this.e, this.b);
                synchronized (eyh0Var.d) {
                    try {
                        File file = new File((File) eyh0Var.b, (String) eyh0Var.c);
                        if (!file.exists()) {
                            File[] fileArrListFiles = ((File) eyh0Var.b).listFiles();
                            if (fileArrListFiles != null) {
                                for (File file2 : fileArrListFiles) {
                                    file2.getClass();
                                    y520.E(file2);
                                }
                            }
                            file.mkdirs();
                        }
                        File file3 = new File(file, string);
                        listV = eyh0.v(file3);
                        if (listV == null) {
                            listV = eyh0.L(file3, ddcVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                int[] iArr = (int[]) this.f;
                int i2 = this.b;
                return new bdc(((String[]) this.g)[i2], listV, iArr[i2]);
            default:
                hm5.M(obj);
                op80 op80Var = (op80) ((q811) this.c).a;
                if (op80Var != null && (otuVarS = z8p1.s(op80Var)) != null) {
                    otuVarS.h((String) this.d, (String) this.e);
                }
                ven0 ven0Var = (ven0) this.f;
                tka0 tka0Var = otw.a;
                ven0Var.getValue();
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edc(q811 q811Var, String str, String str2, int i, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.c = q811Var;
        this.d = str;
        this.e = str2;
        this.b = i;
        this.f = ven0Var;
        this.g = ven0Var2;
    }
}
