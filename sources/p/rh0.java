package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rh0 extends kh0 {
    public final /* synthetic */ sh0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ o1p1 c;

    public rh0(sh0 sh0Var, String str, o1p1 o1p1Var) {
        this.a = sh0Var;
        this.b = str;
        this.c = o1p1Var;
    }

    public final void a(Object obj) throws Exception {
        sh0 sh0Var = this.a;
        ArrayList arrayList = sh0Var.d;
        LinkedHashMap linkedHashMap = sh0Var.b;
        String str = this.b;
        Object obj2 = linkedHashMap.get(str);
        o1p1 o1p1Var = this.c;
        if (obj2 == null) {
            k220.n("Attempting to launch an unregistered ActivityResultLauncher with contract ", o1p1Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            return;
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            sh0Var.d(iIntValue, o1p1Var, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }

    public final void b() {
        this.a.j(this.b);
    }
}
