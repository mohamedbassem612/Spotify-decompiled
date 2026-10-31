package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ixw extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nxw b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ixw(nxw nxwVar, String str, byte b) {
        super(1);
        this.a = b;
        this.b = nxwVar;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        String str = this.c;
        nxw nxwVar = this.b;
        switch (b) {
            case 0:
                int i = ((syw) obj).d;
                return i == 20 ? Next.i(nxw.a(nxwVar, new cyw(str, i), false, false, 14), Effects.a(new vww[]{new tww(str)})) : Next.h(nxw.a(nxwVar, new cyw(str, i), false, false, 14));
            default:
                return Next.h(nxw.a(nxwVar, new fyw(str, ((ryw) obj).d), false, false, 14));
        }
    }
}
