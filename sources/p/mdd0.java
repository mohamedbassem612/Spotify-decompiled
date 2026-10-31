package p;

import com.google.protobuf.Timestamp;
import com.spotify.base.java.logging.Logger;
import com.spotify.listeningactivity.v1.AudienceRequest;
import com.spotify.listeningactivity.v1.AudienceResponse;
import com.spotify.listeningactivity.v1.AudienceUser;
import com.spotify.listeningactivity.v1.AudienceUserRequest;
import com.spotify.listeningactivity.v1.AudienceUserResponse;
import com.spotify.listeningactivity.v1.AudienceUsersRequest;
import com.spotify.listeningactivity.v1.AudienceUsersResponse;
import com.spotify.listeningactivity.v1.FeedActivity;
import com.spotify.listeningactivity.v1.FeedEntityWrapper;
import com.spotify.listeningactivity.v1.GetFeedRequest;
import com.spotify.listeningactivity.v1.GetFeedResponse;
import com.spotify.listeningactivity.v1.GetMyActivityRequest;
import com.spotify.listeningactivity.v1.GetMyActivityResponse;
import com.spotify.listeningactivity.v1.GetUserHiddenStateRequest;
import com.spotify.listeningactivity.v1.GetUserHiddenStateResponse;
import com.spotify.listeningactivity.v1.GroupMember;
import com.spotify.listeningactivity.v1.HideUserActivityRequest;
import com.spotify.listeningactivity.v1.RestrictAudienceUserRequest;
import com.spotify.listeningactivity.v1.UserActivity;
import com.spotify.listeningactivity.v1.UserSubscription;
import com.spotify.listeningactivity.v1.UsersActivityRequest;
import com.spotify.listeningactivity.v1.UsersActivityResponse;
import com.spotify.listeningactivity.v1.c;
import com.spotify.listeningactivity.v1.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mdd0 implements vcd0 {
    public final lmy0 a;
    public final bed0 b;
    public final kly0 c;
    public final nfa0 d;
    public final llm e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final dt71 g = mgo1.e(0, 1, 0, 5);

    public mdd0(lmy0 lmy0Var, bed0 bed0Var, caq caqVar, q8n q8nVar, nfa0 nfa0Var) {
        this.a = lmy0Var;
        this.b = bed0Var;
        this.c = caqVar;
        this.d = nfa0Var;
        this.e = us71.h(q8nVar);
    }

    public static ArrayList a(String str, List list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (String str2 : list2) {
            c cVarN = UserSubscription.n();
            cVarN.q(str2);
            d dVarN = UserSubscription.PusherChannel.n();
            dVarN.n(str);
            cVarN.n((UserSubscription.PusherChannel) dVarN.build());
            arrayList.add((UserSubscription) cVarN.build());
        }
        return arrayList;
    }

    public static int l(rn7 rn7Var) {
        int iOrdinal = rn7Var.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 1 : 3;
        }
        return 2;
    }

    public static eo10 m(FeedActivity feedActivity) {
        return new eo10(feedActivity.hasTimestamp() ? Long.valueOf(q(feedActivity.q())) : null, feedActivity.getEntityUri(), feedActivity.r() ? feedActivity.n() : null, feedActivity.p());
    }

    public static sp10 n(FeedEntityWrapper feedEntityWrapper) {
        if (feedEntityWrapper.s()) {
            return new rp10(feedEntityWrapper.p().getUri(), m(feedEntityWrapper.p().n()));
        }
        if (feedEntityWrapper.q()) {
            return new op10(feedEntityWrapper.n().getUri(), m(feedEntityWrapper.n().n()));
        }
        if (!feedEntityWrapper.r()) {
            return null;
        }
        String name = feedEntityWrapper.o().getName();
        String strN = feedEntityWrapper.o().n();
        h290<GroupMember> h290VarP = feedEntityWrapper.o().p();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
        for (GroupMember groupMember : h290VarP) {
            groupMember.getClass();
            arrayList.add(new pp10(groupMember.getUri(), groupMember.o() ? m(groupMember.n()) : null));
        }
        return new qp10(name, strN, arrayList);
    }

    public static tcd0 o(UserActivity userActivity) {
        if (!userActivity.o()) {
            return null;
        }
        return new tcd0(userActivity.n().hasTimestamp() ? Long.valueOf(q(userActivity.n().q())) : null, userActivity.n().getEntityUri(), userActivity.n().r() ? userActivity.n().n() : null, userActivity.n().p());
    }

    public static ArrayList p(h290 h290Var) {
        ArrayList arrayList = new ArrayList(q7h.U(h290Var, 10));
        Iterator it = h290Var.iterator();
        while (it.hasNext()) {
            UserActivity userActivity = (UserActivity) it.next();
            arrayList.add(new ucd0(userActivity.getUsername(), o(userActivity)));
        }
        return arrayList;
    }

    public static long q(Timestamp timestamp) {
        return (timestamp.q() * 1000) + ((long) (timestamp.p() / 1000000));
    }

    public static ArrayList r(Set set) {
        tp10 tp10Var;
        Set set2 = set;
        ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((eq10) it.next()).ordinal();
            if (iOrdinal == 0) {
                tp10Var = tp10.c;
            } else if (iOrdinal == 1) {
                tp10Var = tp10.d;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                tp10Var = tp10.e;
            }
            arrayList.add(tp10Var);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(onm onmVar) {
        cdd0 cdd0Var;
        if (onmVar instanceof cdd0) {
            cdd0Var = (cdd0) onmVar;
            int i = cdd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cdd0Var.c = i - Integer.MIN_VALUE;
            } else {
                cdd0Var = new cdd0(this, onmVar);
            }
        } else {
            cdd0Var = new cdd0(this, onmVar);
        }
        Object objH = cdd0Var.a;
        int i2 = cdd0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objH);
                bed0 bed0Var = this.b;
                qn7 qn7VarO = AudienceRequest.o();
                qn7VarO.n();
                AudienceRequest audienceRequestBuild = qn7VarO.build();
                cdd0Var.c = 1;
                objH = bed0Var.h(audienceRequestBuild, cdd0Var);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objH);
            }
            h290<AudienceUser> h290VarN = ((AudienceResponse) objH).n();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
            for (AudienceUser audienceUser : h290VarN) {
                arrayList.add(new sn7(audienceUser.getUsername(), l(audienceUser.p()), audienceUser.o()));
            }
            return arrayList;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d(ktd.i("BUZZ: ListeningActivityDataLoader.getAudience failure with exception: ", e2), new Object[0]);
            return z6x.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        ddd0 ddd0Var;
        if (onmVar instanceof ddd0) {
            ddd0Var = (ddd0) onmVar;
            int i = ddd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ddd0Var.c = i - Integer.MIN_VALUE;
            } else {
                ddd0Var = new ddd0(this, onmVar);
            }
        } else {
            ddd0Var = new ddd0(this, onmVar);
        }
        Object objA = ddd0Var.a;
        int i2 = ddd0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                bed0 bed0Var = this.b;
                tn7 tn7VarO = AudienceUserRequest.o();
                tn7VarO.n(str);
                AudienceUserRequest audienceUserRequestBuild = tn7VarO.build();
                ddd0Var.c = 1;
                objA = bed0Var.a(audienceUserRequestBuild, ddd0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            AudienceUserResponse audienceUserResponse = (AudienceUserResponse) objA;
            if (!audienceUserResponse.hasUser()) {
                return null;
            }
            return new sn7(audienceUserResponse.n().getUsername(), l(audienceUserResponse.n().p()), audienceUserResponse.n().o());
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d(ktd.i("BUZZ: ListeningActivityDataLoader.getAudienceUser failure with exception: ", e2), new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(ArrayList arrayList, onm onmVar) throws Exception {
        edd0 edd0Var;
        if (onmVar instanceof edd0) {
            edd0Var = (edd0) onmVar;
            int i = edd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                edd0Var.c = i - Integer.MIN_VALUE;
            } else {
                edd0Var = new edd0(this, onmVar);
            }
        } else {
            edd0Var = new edd0(this, onmVar);
        }
        Object objJ = edd0Var.a;
        int i2 = edd0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                if (arrayList.isEmpty()) {
                    return z6x.a;
                }
                bed0 bed0Var = this.b;
                io7 io7VarP = AudienceUsersRequest.p();
                io7VarP.n(arrayList);
                AudienceUsersRequest audienceUsersRequestBuild = io7VarP.build();
                edd0Var.c = 1;
                objJ = bed0Var.j(audienceUsersRequestBuild, edd0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            h290<AudienceUser> h290VarN = ((AudienceUsersResponse) objJ).n();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
            for (AudienceUser audienceUser : h290VarN) {
                arrayList2.add(new sn7(audienceUser.getUsername(), l(audienceUser.p()), audienceUser.o()));
            }
            return arrayList2;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d(ktd.i("BUZZ: ListeningActivityDataLoader.getAudienceUsers failure with exception: ", e2), new Object[0]);
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable e(Set set, onm onmVar) {
        fdd0 fdd0Var;
        if (onmVar instanceof fdd0) {
            fdd0Var = (fdd0) onmVar;
            int i = fdd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fdd0Var.c = i - Integer.MIN_VALUE;
            } else {
                fdd0Var = new fdd0(this, onmVar);
            }
        } else {
            fdd0Var = new fdd0(this, onmVar);
        }
        Object objC = fdd0Var.a;
        int i2 = fdd0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                hn40 hn40VarP = GetFeedRequest.p();
                hn40VarP.q();
                hn40VarP.n(r(set));
                GetFeedRequest getFeedRequestBuild = hn40VarP.build();
                bed0 bed0Var = this.b;
                getFeedRequestBuild.getClass();
                fdd0Var.c = 1;
                objC = bed0Var.c(getFeedRequestBuild, fdd0Var);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objC);
            }
            h290<FeedEntityWrapper> h290VarN = ((GetFeedResponse) objC).n();
            ArrayList arrayList = new ArrayList();
            for (FeedEntityWrapper feedEntityWrapper : h290VarN) {
                feedEntityWrapper.getClass();
                sp10 sp10VarN = n(feedEntityWrapper);
                if (sp10VarN != null) {
                    arrayList.add(sp10VarN);
                }
            }
            return arrayList;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d(ktd.i("BUZZ: ListeningActivityDataLoader.getFeed failure with exception: ", e2), new Object[0]);
            return new m231(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable f(List list, onm onmVar) {
        gdd0 gdd0Var;
        if (onmVar instanceof gdd0) {
            gdd0Var = (gdd0) onmVar;
            int i = gdd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gdd0Var.c = i - Integer.MIN_VALUE;
            } else {
                gdd0Var = new gdd0(this, onmVar);
            }
        } else {
            gdd0Var = new gdd0(this, onmVar);
        }
        Object objG = gdd0Var.a;
        int i2 = gdd0Var.c;
        z6x z6xVar = z6x.a;
        try {
            if (i2 == 0) {
                hm5.M(objG);
                if (list.isEmpty()) {
                    return z6xVar;
                }
                hki1 hki1VarP = UsersActivityRequest.p();
                hki1VarP.n(list);
                UsersActivityRequest usersActivityRequestBuild = hki1VarP.build();
                bed0 bed0Var = this.b;
                usersActivityRequestBuild.getClass();
                gdd0Var.c = 1;
                objG = bed0Var.g(usersActivityRequestBuild, gdd0Var);
                d9n d9nVar = d9n.a;
                if (objG == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objG);
            }
            h290<UserActivity> h290VarN = ((UsersActivityResponse) objG).n();
            z6x arrayList = new ArrayList(q7h.U(h290VarN, 10));
            for (UserActivity userActivity : h290VarN) {
                arrayList.add(new ucd0(userActivity.getUsername(), o(userActivity)));
            }
            z6xVar = arrayList;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d(ktd.i("BUZZ: ListeningActivityDataLoader.getListeningActivityForUsers failure with exception: ", e2), new Object[0]);
        }
        return (Serializable) z6xVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(onm onmVar) {
        hdd0 hdd0Var;
        if (onmVar instanceof hdd0) {
            hdd0Var = (hdd0) onmVar;
            int i = hdd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hdd0Var.c = i - Integer.MIN_VALUE;
            } else {
                hdd0Var = new hdd0(this, onmVar);
            }
        } else {
            hdd0Var = new hdd0(this, onmVar);
        }
        Object objE = hdd0Var.a;
        int i2 = hdd0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objE);
                lo40 lo40VarO = GetMyActivityRequest.o();
                lo40VarO.n();
                GetMyActivityRequest getMyActivityRequestBuild = lo40VarO.build();
                bed0 bed0Var = this.b;
                getMyActivityRequestBuild.getClass();
                hdd0Var.c = 1;
                objE = bed0Var.e(getMyActivityRequestBuild, hdd0Var);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objE);
            }
            GetMyActivityResponse getMyActivityResponse = (GetMyActivityResponse) objE;
            if (!getMyActivityResponse.o()) {
                return null;
            }
            return new tcd0(getMyActivityResponse.n().hasTimestamp() ? new Long(q(getMyActivityResponse.n().q())) : null, getMyActivityResponse.n().getEntityUri(), getMyActivityResponse.n().r() ? getMyActivityResponse.n().n() : null, getMyActivityResponse.n().p());
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d(ktd.i("BUZZ: ListeningActivityDataLoader.getMyActivity failure with exception: ", e2), new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum h(String str, onm onmVar) {
        idd0 idd0Var;
        if (onmVar instanceof idd0) {
            idd0Var = (idd0) onmVar;
            int i = idd0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                idd0Var.d = i - Integer.MIN_VALUE;
            } else {
                idd0Var = new idd0(this, onmVar);
            }
        } else {
            idd0Var = new idd0(this, onmVar);
        }
        Object objL = idd0Var.b;
        int i2 = idd0Var.d;
        d5i1 d5i1Var = d5i1.c;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                bed0 bed0Var = this.b;
                hr40 hr40VarO = GetUserHiddenStateRequest.o();
                hr40VarO.n(str);
                GetUserHiddenStateRequest getUserHiddenStateRequestBuild = hr40VarO.build();
                idd0Var.a = this;
                idd0Var.d = 1;
                objL = bed0Var.l(getUserHiddenStateRequestBuild, idd0Var);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = idd0Var.a;
                hm5.M(objL);
            }
            j860 j860VarN = ((GetUserHiddenStateResponse) objL).n();
            this.getClass();
            int iOrdinal = j860VarN.ordinal();
            if (iOrdinal != 1) {
                return iOrdinal != 2 ? d5i1Var : d5i1.b;
            }
            return d5i1.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d(ktd.i("BUZZ: ListeningActivityDataLoader.getUserActivityHiddenState failure with exception: ", e2), new Object[0]);
            return d5i1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, onm onmVar, boolean z) throws Exception {
        jdd0 jdd0Var;
        if (onmVar instanceof jdd0) {
            jdd0Var = (jdd0) onmVar;
            int i = jdd0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jdd0Var.e = i - Integer.MIN_VALUE;
            } else {
                jdd0Var = new jdd0(this, onmVar);
            }
        } else {
            jdd0Var = new jdd0(this, onmVar);
        }
        Object obj = jdd0Var.c;
        int i2 = jdd0Var.e;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                bed0 bed0Var = this.b;
                y860 y860VarO = HideUserActivityRequest.o();
                y860VarO.q(str);
                y860VarO.n(z);
                HideUserActivityRequest hideUserActivityRequestBuild = y860VarO.build();
                jdd0Var.a = str;
                jdd0Var.b = z;
                jdd0Var.e = 1;
                Object objD = bed0Var.d(hideUserActivityRequestBuild, jdd0Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = jdd0Var.b;
                str = jdd0Var.a;
                hm5.M(obj);
            }
            if (!z) {
                this.g.a(str);
            }
            return rih1.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d(ktd.i("BUZZ: ListeningActivityDataLoader.hideUserActivity failure with exception: ", e2), new Object[0]);
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, onm onmVar, boolean z) throws Exception {
        kdd0 kdd0Var;
        if (onmVar instanceof kdd0) {
            kdd0Var = (kdd0) onmVar;
            int i = kdd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kdd0Var.c = i - Integer.MIN_VALUE;
            } else {
                kdd0Var = new kdd0(this, onmVar);
            }
        } else {
            kdd0Var = new kdd0(this, onmVar);
        }
        Object obj = kdd0Var.a;
        int i2 = kdd0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                bed0 bed0Var = this.b;
                f031 f031VarO = RestrictAudienceUserRequest.o();
                f031VarO.q(str);
                f031VarO.n(z);
                RestrictAudienceUserRequest restrictAudienceUserRequestBuild = f031VarO.build();
                kdd0Var.c = 1;
                Object objB = bed0Var.b(restrictAudienceUserRequestBuild, kdd0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d(ktd.i("BUZZ: ListeningActivityDataLoader.restrictAudienceUser failure with exception: ", e2), new Object[0]);
            throw e2;
        }
    }

    public final mr20 k(List list) {
        if (list.isEmpty()) {
            return new huz(new e331(z6x.a), (byte) 10);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            byte b = 0;
            if (!it.hasNext()) {
                return new wa3((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 23);
            }
            String str = (String) it.next();
            arrayList.add((mr20) this.f.computeIfAbsent(str, new bdd0(this, str, b)));
        }
    }
}
