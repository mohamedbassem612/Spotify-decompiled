package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.ai.creation.v2.GetMessageResponse;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class njp1 implements Function, Predicate {
    public static final njp1 c;
    public static final njp1 d;
    public static final njp1 e;
    public final /* synthetic */ byte a;
    public final String b;

    static {
        byte b = 0;
        c = new njp1("ML_DSA_44", b);
        d = new njp1("ML_DSA_65", b);
        e = new njp1("ML_DSA_87", b);
    }

    public /* synthetic */ njp1(byte b, Object obj, String str) {
        this.a = b;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0115  */
    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = null;
        String str = this.b;
        switch (b) {
            case 1:
                GetMessageResponse getMessageResponse = (GetMessageResponse) obj;
                return new e23(this.b, getMessageResponse.getStatus(), getMessageResponse.hasPlaylist() ? getMessageResponse.getPlaylist() : null, getMessageResponse.getSubmitTimestampMs(), getMessageResponse.getSubmitTimestampMs(), new svi0(o7h.j1(getMessageResponse.getMessagePreferences().getExcludedUrisList()), o7h.j1(getMessageResponse.getMessagePreferences().getIncludedUrisList())), getMessageResponse.getRetryAfterMs());
            case 2:
                return ((uv00) obj).a(zd3.class, str);
            case 3:
                return new mmr0(str, (rwu) obj);
            case 4:
                dxc0 dxc0Var = ((uv00) obj).a(dxc0.class, str).b;
                return Boolean.valueOf(dxc0Var != null && fno1.j(dxc0Var));
            case 5:
                return new nmr0(str, ((u5n) ((mmr0) obj).a).a);
            case 6:
                f7h f7hVar = (f7h) ((Map) obj).get(str);
                return Boolean.valueOf(f7hVar != null ? f7hVar.c : false);
            case 7:
            case 12:
            case 14:
            default:
                return ((uv00) obj).a(ldj1.class, str);
            case 8:
                return bqz.a(str, (EsPrefs.PrefValues) obj);
            case 9:
                return Boolean.valueOf(((List) obj).contains(str));
            case 10:
                uv00 uv00Var = (uv00) obj;
                w281 w281Var = uv00Var.a(w281.class, str).b;
                boolean z = w281Var != null && (w281Var.c ^ true);
                den denVar = uv00Var.a(den.class, str).b;
                return new o640(z, denVar != null ? denVar.b : null);
            case 11:
                for (Object obj3 : (List) obj) {
                    if (u890.j(((eno0) obj3).a, str)) {
                        obj2 = obj3;
                        eno0 eno0Var = (eno0) obj2;
                        return eno0Var != null ? Maybe.e(eno0Var) : MaybeEmpty.a;
                    }
                }
                eno0 eno0Var2 = (eno0) obj2;
                if (eno0Var2 != null) {
                }
            case 13:
                return new mmr0(str, (Boolean) obj);
            case 15:
                List<tv00> listB = ((uv00) obj).b(gh3.class);
                ArrayList arrayList = new ArrayList();
                for (tv00 tv00Var : listB) {
                    ez00 ez00Var = tv00Var.b;
                    mmr0 mmr0Var = ez00Var != null ? new mmr0(tv00Var.a, ez00Var) : null;
                    if (mmr0Var != null) {
                        arrayList.add(mmr0Var);
                    }
                }
                Map mapT = sqg0.T(arrayList);
                ArrayList arrayList2 = new ArrayList(mapT.size());
                for (Map.Entry entry : mapT.entrySet()) {
                    String str2 = ((gh3) entry.getValue()).c.c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList2.add(new y53(((gh3) entry.getValue()).a, ((gh3) entry.getValue()).b, str2, ((gh3) entry.getValue()).e, new e5r(((gh3) entry.getValue()).f.a, ((gh3) entry.getValue()).f.b, ((gh3) entry.getValue()).f.c), ((gh3) entry.getValue()).a.equals(str), ((gh3) entry.getValue()).h));
                }
                return arrayList2;
            case 16:
                return l4o1.R(((uv00) obj).a(zoy0.class, str).b) ? pa81.c : pa81.b;
        }
    }

    public boolean test(Object obj) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 7:
                return str.equals(((l0l) obj).d());
            case 12:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                return u890.j(contextTrack != null ? contextTrack.uri() : null, str) && playerState.playbackId().c();
            default:
                PlayerState playerState2 = (PlayerState) obj;
                String strContextUri = playerState2.contextUri();
                return (strContextUri == null || strContextUri.equals(str) || !playerState2.isPlaying() || playerState2.isPaused()) ? false : true;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ njp1(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}
