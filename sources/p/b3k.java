package p;

import android.support.v4.media.session.MediaSessionCompat;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b3k {
    public final /* synthetic */ byte a = 0;
    public Object b;
    public Object c;
    public Object d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public b3k(b380 b380Var, m9x0 m9x0Var, cnw cnwVar, boolean z, boolean z2, int i, boolean z3) {
        boolean z4 = true;
        Iterator it = b380Var.iterator();
        if (it.hasNext()) {
            ((f4w) it.next()).getClass();
        } else {
            z4 = false;
        }
        dm5.n(z4, "Composition must have at least one non-looping sequence.");
        this.b = b380.p(b380Var);
        this.c = m9x0Var;
        this.d = cnwVar;
        this.e = z;
        this.f = z2;
        this.g = i;
        this.h = z3;
    }

    public b3k a() {
        b380 b380Var = (b380) this.b;
        m9x0 m9x0Var = (m9x0) this.c;
        cnw cnwVar = (cnw) this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        int i = this.g;
        return new b3k(b380Var, m9x0Var, cnwVar, z, z2, i, this.h && i == 0);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                b380 b380Var = (b380) this.b;
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < b380Var.size(); i++) {
                        jSONArray.put(((f4w) b380Var.get(i)).b());
                    }
                    jSONObject.put("sequences", jSONArray);
                    jSONObject.put("effects", ((cnw) this.d).a());
                    jSONObject.put("transmuxAudio", this.e);
                    jSONObject.put("transmuxVideo", this.f);
                    jSONObject.put("hdrMode", this.g);
                    jSONObject.put("retainHdrFromUltraHdrImage", this.h);
                    break;
                } catch (JSONException e) {
                    oon1.I("JSON conversion failed.", e);
                    jSONObject = new JSONObject();
                }
                return jSONObject.toString();
            default:
                return super.toString();
        }
    }

    public b3k(boolean z, int i, String str, String str2, MediaSessionCompat.Token token, boolean z2, boolean z3) {
        this.e = z;
        this.g = i;
        this.c = str;
        this.d = str2;
        this.b = token;
        this.f = z2;
        this.h = z3;
    }

    public b3k(f4w f4wVar, f4w[] f4wVarArr) {
        v280 v280Var = new v280(4);
        v280Var.c(f4wVar);
        v280Var.d(f4wVarArr);
        bg11 bg11VarG = v280Var.g();
        dm5.n(!bg11VarG.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
        this.b = b380.p(bg11VarG);
        this.c = m9x0.W0;
        this.d = cnw.c;
    }

    public /* synthetic */ b3k() {
    }
}
