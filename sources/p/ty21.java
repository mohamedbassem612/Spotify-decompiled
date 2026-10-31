package p;

import com.android.volley.VolleyError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ty21 {
    public final Object a;
    public final opc b;
    public final VolleyError c;
    public boolean d;

    public ty21(Object obj, opc opcVar) {
        this.d = false;
        this.a = obj;
        this.b = opcVar;
        this.c = null;
    }

    public ty21(VolleyError volleyError) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = volleyError;
    }
}
