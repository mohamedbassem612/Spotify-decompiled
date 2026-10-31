package p;

import com.spotify.musicappplatform.state.idle.api.MusicAppLock;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class so70 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wo70 b;
    public final /* synthetic */ MusicAppLock c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so70(wo70 wo70Var, lnm lnmVar, MusicAppLock musicAppLock, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = wo70Var;
        this.c = musicAppLock;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        MusicAppLock musicAppLock = this.c;
        wo70 wo70Var = this.b;
        switch (b) {
            case 0:
                return new so70(wo70Var, lnmVar, musicAppLock, (byte) 0);
            case 1:
                return new so70(wo70Var, lnmVar, musicAppLock, (byte) 1);
            default:
                return new so70(wo70Var, lnmVar, musicAppLock, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        MusicAppLock musicAppLock = this.c;
        wo70 wo70Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                Iterator it = wo70Var.a.iterator();
                while (it.hasNext()) {
                    ((po70) it.next()).e(musicAppLock);
                }
                break;
            case 1:
                hm5.M(obj);
                Iterator it2 = wo70Var.a.iterator();
                while (it2.hasNext()) {
                    ((po70) it2.next()).a(musicAppLock);
                }
                break;
            default:
                hm5.M(obj);
                Iterator it3 = wo70Var.a.iterator();
                while (it3.hasNext()) {
                    ((po70) it3.next()).h(musicAppLock);
                }
                break;
        }
        return rih1Var;
    }
}
