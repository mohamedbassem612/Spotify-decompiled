package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n9e implements x8c {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ n9e(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.x8c
    public final ji50 a(ajq0 ajq0Var, ji50 ji50Var) {
        switch (this.a) {
            case 0:
                k3p k3pVar = (k3p) this.b;
                d0r d0rVar = ji50Var.a;
                wzq wzqVar = new wzq(fdg1.m0(k3pVar.a(d0rVar), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), jzd.P0);
                wnb wnbVar = wnb.W0;
                LinkedHashMap linkedHashMap = ji50Var.b;
                linkedHashMap.put(h9e.class, new r3r(wzqVar, wnbVar, (vu30) null));
                linkedHashMap.put(i9e.class, new r3r(new wzq(fdg1.m0(k3pVar.a(d0rVar), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), jzd.Q0), wnb.X0, (vu30) null));
                break;
            case 1:
                i4o i4oVar = new i4o(this, (byte) 4);
                eno enoVar = eno.a1;
                ido idoVar = ido.X;
                ji50Var.b.put(kvo.class, new vw21(enoVar, b7x.a, new fc3(i4oVar, (byte) 5), idoVar, (vu30) null));
                break;
            default:
                jb50 jb50Var = new jb50(this, (byte) 8);
                v160 v160Var = v160.R0;
                oq50 oq50Var = oq50.X;
                ji50Var.b.put(o460.class, new vw21(v160Var, b7x.a, new fc3(jb50Var, (byte) 5), oq50Var, (vu30) null));
                break;
        }
        return ji50Var;
    }
}
