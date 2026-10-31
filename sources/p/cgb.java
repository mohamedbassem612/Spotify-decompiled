package p;

import android.content.Context;
import com.spotify.accessory.categorizer.BluetoothCategorizer;
import com.spotify.accessory.categorizer.CategorizerResponse;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cgb implements BluetoothCategorizer {
    public static final bma1 i = bma1.b.q("known_bluetooth_devices_v2");
    public static final int j = 86400000;
    public final yqg a;
    public final r210 b;
    public final nfa0 c;
    public final q8n d;
    public final llm e;
    public final llm f;
    public final dma1 g;
    public final nlc0 h = new nlc0(chc1.a, o4b0.Companion.serializer());

    public cgb(Context context, yqg yqgVar, r210 r210Var, ut71 ut71Var, nfa0 nfa0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = yqgVar;
        this.b = r210Var;
        this.c = nfa0Var;
        this.d = q8nVar;
        this.e = i3a.k(q8nVar2);
        this.f = i3a.k(q8nVar);
        this.g = ut71Var.c(context);
    }

    public final Map a() {
        b7x b7xVar = b7x.a;
        String strE = this.g.e(i, "");
        String str = strE != null ? strE : "";
        try {
            return str.length() == 0 ? b7xVar : (Map) this.c.a(str, this.h);
        } catch (Exception e) {
            Logger.e(e, l1d.m("Failed to parse cached devices - ", rc11.a.b(e.getClass()).r()), new Object[0]);
            return b7xVar;
        }
    }

    public final void b(String str, CategorizerResponse categorizerResponse) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(a());
        n4b0 n4b0Var = o4b0.Companion;
        long jB = this.a.b();
        n4b0Var.getClass();
        linkedHashMap.put(str, new o4b0(categorizerResponse, jB));
        String strB = this.c.b(this.h, linkedHashMap);
        hma1 hma1VarEdit = this.g.edit();
        hma1VarEdit.d(i, strB);
        hma1VarEdit.g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.accessory.categorizer.BluetoothCategorizer
    public final Object categorize(String str, lnm lnmVar) throws Exception {
        bgb bgbVar;
        if (lnmVar instanceof bgb) {
            bgbVar = (bgb) lnmVar;
            int i2 = bgbVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bgbVar.d = i2 - Integer.MIN_VALUE;
            } else {
                bgbVar = new bgb(this, lnmVar);
            }
        } else {
            bgbVar = new bgb(this, lnmVar);
        }
        Object objJ = bgbVar.b;
        int i3 = bgbVar.d;
        try {
            if (i3 == 0) {
                hm5.M(objJ);
                Single<CategorizerResponse> singleLookup = this.b.lookup(str);
                bgbVar.a = str;
                bgbVar.d = 1;
                objJ = fc11.j(singleLookup, bgbVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = bgbVar.a;
                hm5.M(objJ);
            }
            Objects.toString((CategorizerResponse) objJ);
            return (CategorizerResponse) objJ;
        } catch (Exception e) {
            Logger.e(e, gvg.h("Network call failed for device: ", str, " - ", rc11.a.b(e.getClass()).r()), new Object[0]);
            if ((e instanceof IOException) || (e instanceof HttpException)) {
                return null;
            }
            throw e;
        }
    }

    @Override // com.spotify.accessory.categorizer.BluetoothCategorizer
    public final mr20 categorizeAndUpdateCaches(String str) {
        return new m441(new og5(str, this, (lnm) null, (byte) 6));
    }

    @Override // com.spotify.accessory.categorizer.BluetoothCategorizer
    public final void stop() {
        smo1.p(this.e, null);
        smo1.p(this.f, null);
    }

    @Override // com.spotify.accessory.categorizer.BluetoothCategorizer
    public final mr20 categorizeAndUpdateCaches(m210 m210Var) {
        return categorizeAndUpdateCaches(m210Var.c);
    }
}
