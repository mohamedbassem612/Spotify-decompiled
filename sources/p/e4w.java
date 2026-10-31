package p;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e4w {
    public final yoh0 a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final int e;
    public final cnw f;
    public final wbx0 g;
    public final b380 h;
    public long i;

    public e4w(d4w d4wVar) {
        boolean z = d4wVar.b;
        wbx0 wbx0Var = d4wVar.g;
        dm5.z((z && d4wVar.c) ? false : true, "Audio and video cannot both be removed");
        if (d(d4wVar.a)) {
            dm5.m(d4wVar.d != -9223372036854775807L);
            dm5.m(!d4wVar.b);
            dm5.m(d4wVar.f.a.isEmpty());
            dm5.m(wbx0Var == wbx0.Q0);
        }
        wbx0Var.getClass();
        this.a = d4wVar.a;
        this.b = d4wVar.b;
        this.c = d4wVar.c;
        this.d = d4wVar.d;
        this.e = d4wVar.e;
        this.f = d4wVar.f;
        this.g = wbx0Var;
        this.h = d4wVar.h;
        this.i = -9223372036854775807L;
    }

    public static boolean d(yoh0 yoh0Var) {
        return Objects.equals(yoh0Var.a, "androidx-media3-GapMediaItem");
    }

    public static JSONObject e(yoh0 yoh0Var) throws JSONException {
        String string;
        int iLastIndexOf;
        JSONObject jSONObject = new JSONObject();
        soh0 soh0Var = yoh0Var.b;
        noh0 noh0Var = yoh0Var.e;
        jSONObject.put("extension", (soh0Var == null || (iLastIndexOf = (string = soh0Var.a.toString()).lastIndexOf(46)) <= 0 || iLastIndexOf >= string.length() + (-1)) ? "UNSET" : string.substring(iLastIndexOf + 1));
        if (noh0Var.equals(moh0.i)) {
            jSONObject.put("clipping", "UNSET");
            return jSONObject;
        }
        long j = noh0Var.c;
        String strValueOf = j == Long.MIN_VALUE ? "END_OF_SOURCE" : String.valueOf(j);
        jSONObject.put("clippingStartMs", noh0Var.a);
        jSONObject.put("clippingEndMs", strValueOf);
        return jSONObject;
    }

    public final d4w a() {
        d4w d4wVar = new d4w();
        d4wVar.a = this.a;
        d4wVar.b = this.b;
        d4wVar.c = this.c;
        d4wVar.d = this.d;
        d4wVar.e = this.e;
        d4wVar.f = this.f;
        d4wVar.g = this.g;
        d4wVar.h = this.h;
        return d4wVar;
    }

    public final long b(long j) {
        long jI;
        boolean z = this.b;
        cnw cnwVar = this.f;
        if (z) {
            jI = -9223372036854775807L;
        } else {
            w280 w280VarR = cnwVar.a.r(0);
            jI = j;
            while (w280VarR.hasNext()) {
                jI = ((f18) w280VarR.next()).i(jI);
            }
        }
        if (this.c) {
            j = -9223372036854775807L;
        } else {
            w280 w280VarR2 = cnwVar.b.r(0);
            while (w280VarR2.hasNext()) {
                ((siw) w280VarR2.next()).getClass();
            }
        }
        return Math.max(jI, j);
    }

    public final long c() {
        long j = this.d;
        dm5.y(j != -9223372036854775807L);
        long j2 = this.i;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        noh0 noh0Var = this.a.e;
        boolean zEquals = noh0Var.equals(moh0.i);
        long j3 = noh0Var.b;
        long j4 = noh0Var.d;
        if (!zEquals) {
            dm5.m(!noh0Var.f);
            if (j4 == Long.MIN_VALUE) {
                j -= j3;
            } else {
                dm5.m(j4 <= j);
                j = j4 - j3;
            }
        }
        this.i = j;
        long jB = b(j);
        this.i = jB;
        return jB;
    }

    public final JSONObject f() {
        long j = this.d;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mediaItem", e(this.a));
            jSONObject.put("effects", this.f.a());
            jSONObject.put("removeAudio", this.b);
            jSONObject.put("removeVideo", this.c);
            jSONObject.put("durationUs", j);
            jSONObject.put("presentationDuration", j != -9223372036854775807L ? Long.valueOf(c()) : "N/A");
            return jSONObject;
        } catch (JSONException e) {
            oon1.I("JSON conversion failed.", e);
            return new JSONObject();
        }
    }

    public final String toString() {
        return f().toString();
    }
}
