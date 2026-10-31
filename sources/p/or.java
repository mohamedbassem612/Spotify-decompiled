package p;

import com.spotify.identity.proto.v3.Identity;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class or implements Function, nq {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public or(sq sqVar) {
        this.a = (byte) 2;
        this.b = sqVar;
        this.c = xqu.b(new hwo(this, 1));
        this.d = xqu.b(new hwo(this, 0));
    }

    public jq a() {
        return (jq) ((jly0) this.d).get();
    }

    public Object apply(Object obj) {
        Object next;
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                zv zvVar = (bw) obj;
                cs csVar = (cs) obj4;
                if (zvVar instanceof zv) {
                    return zvVar.b.a.a() ? csVar.b((mlb1) null).flatMap(new mr(csVar, (yg8) obj3, (byte) 0)).doOnSuccess(new nr(csVar, (String) obj2)) : Single.just(Boolean.FALSE);
                }
                if (zvVar instanceof aw) {
                    return Single.just(Boolean.FALSE);
                }
                eg.o();
                return null;
            default:
                Identity.UserProfile userProfile = (Identity.UserProfile) obj;
                Iterator it = userProfile.p().iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int iO = ((Identity.Image) next).o();
                        do {
                            Object next2 = it.next();
                            int iO2 = ((Identity.Image) next2).o();
                            if (iO > iO2) {
                                next = next2;
                                iO = iO2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Identity.Image image = (Identity.Image) next;
                return new i5w0(new lw((di8) obj2, image != null ? image.getUrl() : null, userProfile.s().getValue(), Integer.valueOf(userProfile.getColor().getValue()), !userProfile.q().getValue(), Long.valueOf(((cs) obj4).c.b()), ((lw) obj3).g));
        }
    }

    public oq b() {
        return (oq) ((jly0) this.d).get();
    }

    public /* synthetic */ or(cs csVar, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = csVar;
        this.c = obj;
        this.d = obj2;
    }
}
