package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ym81 {
    public final t8q a;
    public final u8q b;
    public final v8q c;

    public ym81(t8q t8qVar, u8q u8qVar, v8q v8qVar) {
        this.a = t8qVar;
        this.b = u8qVar;
        this.c = v8qVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ArrayList arrayList, onm onmVar) {
        xm81 xm81Var;
        t8q t8qVar;
        ymk0 ymk0Var;
        if (onmVar instanceof xm81) {
            xm81Var = (xm81) onmVar;
            int i = xm81Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xm81Var.e = i - Integer.MIN_VALUE;
            } else {
                xm81Var = new xm81(this, onmVar);
            }
        } else {
            xm81Var = new xm81(this, onmVar);
        }
        Object obj = xm81Var.c;
        int i2 = xm81Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            daq daqVar = this.b.a.a;
            ymk0 ymk0Var2 = new ymk0((Context) daqVar.x1.a, (yqg) daqVar.J1.get(), (ut71) daqVar.g2.get(), str);
            v8q v8qVar = this.c;
            v8qVar.getClass();
            ul81 ul81Var = new ul81(new vrn((yqg) v8qVar.a.a.J1.get(), (byte) 2), ymk0Var2);
            t8qVar = this.a;
            xm81Var.a = t8qVar;
            xm81Var.b = ymk0Var2;
            xm81Var.e = 1;
            Object objA = ul81Var.a(arrayList, xm81Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            obj = objA;
            ymk0Var = ymk0Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ymk0Var = xm81Var.b;
            t8qVar = xm81Var.a;
            hm5.M(obj);
        }
        t8qVar.getClass();
        return new zm81(ymk0Var, (Map) obj);
    }
}
