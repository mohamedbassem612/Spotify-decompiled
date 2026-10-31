package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 D2\u00020\u0001:\u0001TJG\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0013\u001a\u00020\u00122\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u0014\u0010\u0015JY\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0013\u001a\u00020\u001c2\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\n0\t2\b\b\u0001\u0010 \u001a\u00020\u001f2\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\"\u0010#J,\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\n2\b\b\u0001\u0010 \u001a\u00020$2\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b&\u0010'J1\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\n0\t2\b\b\u0001\u0010 \u001a\u00020(2\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b*\u0010+J1\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\n0\t2\b\b\u0001\u0010 \u001a\u00020,2\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b.\u0010/J1\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\n0\t2\b\b\u0001\u0010 \u001a\u0002002\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b2\u00103J'\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\n0\t2\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b5\u00106J%\u00109\u001a\u0002082\b\b\u0001\u00107\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u0002082\b\b\u0001\u00107\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b;\u0010:J5\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0001\u00107\u001a\u00020\u00022\b\b\u0001\u0010<\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b=\u0010\u0011J+\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0001\u0010>\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b?\u0010\u000fJ+\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0001\u00107\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b@\u0010\u000fJ+\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0001\u0010A\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\bB\u0010\u000fJ+\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\bD\u0010\u000fJ5\u0010H\u001a\b\u0012\u0004\u0012\u00020)0\t2\b\b\u0001\u0010F\u001a\u00020E2\b\b\u0001\u0010G\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\bH\u0010IJ1\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\n0\t2\b\b\u0001\u0010K\u001a\u00020J2\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\bM\u0010NJ1\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\n0\t2\b\b\u0001\u0010P\u001a\u00020O2\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\bR\u0010Sø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006UÀ\u0006\u0001"}, d2 = {"Lp/rca;", "", "", "localDeviceId", "", "activate", "type", "Lp/fq21;", "requiresRegional", "Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "Lp/ga61;", "h", "(Ljava/lang/String;ZLjava/lang/String;Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "P", "(Ljava/lang/String;Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "d", "(Ljava/lang/String;Ljava/lang/String;Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "Lp/mqi1;", "body", "u", "(Lp/mqi1;Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "joinToken", "playbackControl", "joinType", "joinAttemptId", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "Lp/jqi1;", "B", "(Lp/jqi1;Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "Lp/n47;", "request", "Lp/q47;", "i", "(Lp/n47;Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "Lp/t47;", "Lp/w47;", "N", "(Lp/t47;Lp/fq21;Lp/lnm;)Ljava/lang/Object;", "Lp/hgd;", "Lp/rih1;", "H", "(Lp/hgd;Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "Lp/hb;", "Lp/kb;", "v", "(Lp/hb;Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "Lp/wj11;", "Lp/zj11;", "p", "(Lp/wj11;Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "Lp/tj11;", "O", "(Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "sessionId", "Lio/reactivex/rxjava3/core/Completable;", "l", "(Ljava/lang/String;Lp/fq21;)Lio/reactivex/rxjava3/core/Completable;", "m", "memberId", "x", "volumeControlEnabled", "j", "K", "permissionsRestrictionEnabled", "M", "Lp/f5a0;", "a", "Lp/jk61;", "deviceBroadcastRequest", "interactionId", "k", "(Lp/jk61;Ljava/lang/String;Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "Lp/ou21;", "tokensRequest", "Lp/ru21;", "y", "(Lp/ou21;Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "Lp/y6f0;", "lookupRequest", "Lp/b7f0;", "s", "(Lp/y6f0;Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "p/qca", "src_main_java_com_spotify_jam_internal_socialconnect_endpoints_api-api"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface rca {
    public static final qca a = qca.a;
    public static final String b = "control";
    public static final String c = "listen_and_control";
    public static final String d = "enabled";
    public static final String e = "disabled";

    static /* synthetic */ Single A(rca rcaVar, String str, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: updateParticipantVolumeControl");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.j(str, fq21Var);
    }

    static /* synthetic */ Single C(rca rcaVar, hgd hgdVar, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: cancelJoinRequest");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.H(hgdVar, fq21Var);
    }

    static /* synthetic */ Single D(rca rcaVar, y6f0 y6f0Var, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: lookupTokens");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.s(y6f0Var, fq21Var);
    }

    static /* synthetic */ Single E(rca rcaVar, ou21 ou21Var, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: resolveTokens");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.y(ou21Var, fq21Var);
    }

    static /* synthetic */ Single F(rca rcaVar, String str, String str2, String str3, String str4, String str5, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: joinSession");
            return null;
        }
        if ((i & 32) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.b(str, str2, str3, str4, str5, fq21Var);
    }

    static /* synthetic */ Object G(rca rcaVar, t47 t47Var, fq21 fq21Var, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: askToUpgrade");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.N(t47Var, fq21Var, lnmVar);
    }

    static /* synthetic */ Single I(rca rcaVar, wj11 wj11Var, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: rejectJoinRequest");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.p(wj11Var, fq21Var);
    }

    static /* synthetic */ Completable J(rca rcaVar, String str, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: leaveSession");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.l(str, fq21Var);
    }

    static /* synthetic */ Single L(rca rcaVar, String str, String str2, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: newSession");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.d(str, str2, fq21Var);
    }

    static /* synthetic */ Single Q(rca rcaVar, String str, boolean z, String str2, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getCurrentOrNewSession");
            return null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.h(str, z, str2, fq21Var);
    }

    static /* synthetic */ Single R(rca rcaVar, String str, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: kickAllParticipants");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.K(str, fq21Var);
    }

    static /* synthetic */ Single c(rca rcaVar, jk61 jk61Var, String str, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: setBroadcastStatus");
            return null;
        }
        if ((i & 4) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.k(jk61Var, str, fq21Var);
    }

    static /* synthetic */ Single e(rca rcaVar, jqi1 jqi1Var, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: v3joinSession");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.B(jqi1Var, fq21Var);
    }

    static /* synthetic */ Single f(rca rcaVar, String str, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getJamStatus");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.a(str, fq21Var);
    }

    static /* synthetic */ Single g(rca rcaVar, mqi1 mqi1Var, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: v3newSession");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.u(mqi1Var, fq21Var);
    }

    static /* synthetic */ Single n(rca rcaVar, String str, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getCurrentSession");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.P(str, fq21Var);
    }

    static /* synthetic */ Single o(rca rcaVar, hb hbVar, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: acceptJoinRequest");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.v(hbVar, fq21Var);
    }

    static /* synthetic */ Single q(rca rcaVar, String str, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: updatePermissionsRestrictionControl");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.M(str, fq21Var);
    }

    static /* synthetic */ Single r(rca rcaVar, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: rejectAllJoinRequests");
            return null;
        }
        if ((i & 1) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.O(fq21Var);
    }

    static /* synthetic */ Single t(rca rcaVar, String str, String str2, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: kickMember");
            return null;
        }
        if ((i & 4) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.x(str, str2, fq21Var);
    }

    static /* synthetic */ Completable w(rca rcaVar, String str, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: deleteSession");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.m(str, fq21Var);
    }

    static /* synthetic */ Single z(rca rcaVar, n47 n47Var, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: askToJoin");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return rcaVar.i(n47Var, fq21Var);
    }

    @wyq0("social-connect/v3/sessions/join")
    Single<sy21<ga61>> B(@elb jqi1 body, @rod1 fq21 requiresRegional);

    @wyq0("social-connect/v2/sessions/approval_request/cancel")
    Single<sy21<rih1>> H(@elb hgd request, @rod1 fq21 requiresRegional);

    @wyq0("social-connect/v3/sessions/{sessionId}/participant/all/kick")
    Single<ga61> K(@t8s0("sessionId") String sessionId, @rod1 fq21 requiresRegional);

    @yyq0("social-connect/v2/sessions/current/queue_only_mode/{enabled}")
    Single<ga61> M(@t8s0(d) String permissionsRestrictionEnabled, @rod1 fq21 requiresRegional);

    @wyq0("social-connect/v2/sessions/approval_request/upgrade")
    Object N(@elb t47 t47Var, @rod1 fq21 fq21Var, lnm<? super sy21<w47>> lnmVar);

    @wyq0("social-connect/v2/sessions/approval_request/reject_all")
    Single<sy21<tj11>> O(@rod1 fq21 requiresRegional);

    @ay30("social-connect/v2/sessions/current")
    Single<sy21<ga61>> P(@u0z0("local_device_id") String localDeviceId, @rod1 fq21 requiresRegional);

    @ay30("social-connect/v2/devices/{device_id}/jam_status")
    Single<f5a0> a(@t8s0("device_id") String localDeviceId, @rod1 fq21 requiresRegional);

    @wyq0("social-connect/v2/sessions/join/{joinToken}")
    Single<sy21<ga61>> b(@t8s0("joinToken") String joinToken, @u0z0("playback_control") String playbackControl, @u0z0("local_device_id") String localDeviceId, @u0z0("join_type") String joinType, @u0z0("join_attempt_id") String joinAttemptId, @rod1 fq21 requiresRegional);

    @ay30("social-connect/v2/sessions/new")
    Single<sy21<ga61>> d(@u0z0("local_device_id") String localDeviceId, @u0z0("type") String type, @rod1 fq21 requiresRegional);

    @ay30("social-connect/v2/sessions/current_or_new")
    Single<sy21<ga61>> h(@u0z0("local_device_id") String localDeviceId, @u0z0("activate") boolean activate, @u0z0("type") String type, @rod1 fq21 requiresRegional);

    @wyq0("social-connect/v2/sessions/approval_request/join")
    Single<sy21<q47>> i(@elb n47 request, @rod1 fq21 requiresRegional);

    @yyq0("social-connect/v2/sessions/current/volume_control/{enabled}")
    Single<ga61> j(@t8s0(d) String volumeControlEnabled, @rod1 fq21 requiresRegional);

    @wyq0("social-connect/v2/devices/set_broadcast_status")
    Single<rih1> k(@elb jk61 deviceBroadcastRequest, @u0z0("interaction_id") String interactionId, @rod1 fq21 requiresRegional);

    @wyq0("social-connect/v3/sessions/{sessionId}/leave")
    Completable l(@t8s0("sessionId") String sessionId, @rod1 fq21 requiresRegional);

    @juo("social-connect/v3/sessions/{sessionId}")
    Completable m(@t8s0("sessionId") String sessionId, @rod1 fq21 requiresRegional);

    @wyq0("social-connect/v2/sessions/approval_request/reject")
    Single<sy21<zj11>> p(@elb wj11 request, @rod1 fq21 requiresRegional);

    @wyq0("social-connect/v1/tokens/lookup")
    Single<sy21<b7f0>> s(@elb y6f0 lookupRequest, @rod1 fq21 requiresRegional);

    @wyq0("social-connect/v3/sessions/new")
    Single<sy21<ga61>> u(@elb mqi1 body, @rod1 fq21 requiresRegional);

    @wyq0("social-connect/v2/sessions/approval_request/accept")
    Single<sy21<kb>> v(@elb hb request, @rod1 fq21 requiresRegional);

    @wyq0("social-connect/v3/sessions/{sessionId}/member/{memberId}/kick")
    Single<ga61> x(@t8s0("sessionId") String sessionId, @t8s0("memberId") String memberId, @rod1 fq21 requiresRegional);

    @u360({"Accept: application/json", "Content-Encoding: irrelevant"})
    @wyq0("social-connect/v1/token/resolve")
    Single<sy21<ru21>> y(@elb ou21 tokensRequest, @rod1 fq21 requiresRegional);
}
