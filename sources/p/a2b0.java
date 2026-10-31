package p;

import com.spotify.kidsrequest.v1.ApproveArtistRequestsRequest;
import com.spotify.kidsrequest.v1.ApproveArtistRequestsResponse;
import com.spotify.kidsrequest.v1.CancelRequestRequest;
import com.spotify.kidsrequest.v1.ChildAllowlistSettings;
import com.spotify.kidsrequest.v1.CreateRequestRequest;
import com.spotify.kidsrequest.v1.CreateRequestResponse;
import com.spotify.kidsrequest.v1.GetMyRequestsResponse;
import com.spotify.kidsrequest.v1.GetPendingRequestsResponse;
import com.spotify.kidsrequest.v1.GetRequestStatusRequest;
import com.spotify.kidsrequest.v1.GetRequestStatusResponse;
import com.spotify.kidsrequest.v1.ListChildrenAllowlistSettingsResponse;
import com.spotify.kidsrequest.v1.MyRequest;
import com.spotify.kidsrequest.v1.PendingAllowlistRequest;
import com.spotify.kidsrequest.v1.ResolveRequestRequest;
import com.spotify.kidsrequest.v1.SetChildRequestSettingsRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a2b0 {
    public final b2b0 a;
    public final yqg b;

    public a2b0(b2b0 b2b0Var, yqg yqgVar) {
        this.a = b2b0Var;
        this.b = yqgVar;
    }

    public static gin0 g(MyRequest myRequest) {
        int iO = myRequest.o();
        int i = iO == 0 ? -1 : t1b0.b[l1d.C(iO)];
        if (i == 1) {
            return new gin0(myRequest.p(), myRequest.q().o());
        }
        if (i == 2) {
            return new gin0(myRequest.p(), myRequest.n().n());
        }
        if (i == 3) {
            return null;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, List list, onm onmVar) {
        u1b0 u1b0Var;
        if (onmVar instanceof u1b0) {
            u1b0Var = (u1b0) onmVar;
            int i = u1b0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u1b0Var.c = i - Integer.MIN_VALUE;
            } else {
                u1b0Var = new u1b0(this, onmVar);
            }
        } else {
            u1b0Var = new u1b0(this, onmVar);
        }
        Object objG = u1b0Var.a;
        int i2 = u1b0Var.c;
        if (i2 == 0) {
            hm5.M(objG);
            v16 v16VarO = ApproveArtistRequestsRequest.o();
            v16VarO.r(str);
            v16VarO.q(str2);
            v16VarO.n(list);
            ApproveArtistRequestsRequest approveArtistRequestsRequestBuild = v16VarO.build();
            approveArtistRequestsRequestBuild.getClass();
            u1b0Var.c = 1;
            objG = this.a.g(approveArtistRequestsRequestBuild, u1b0Var);
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
        return ((ApproveArtistRequestsResponse) objG).n();
    }

    public final Object b(String str, hhn0 hhn0Var) {
        chd chdVarN = CancelRequestRequest.n();
        chdVarN.n(str);
        CancelRequestRequest cancelRequestRequestBuild = chdVarN.build();
        cancelRequestRequestBuild.getClass();
        Object objI = this.a.i(str, cancelRequestRequestBuild, hhn0Var);
        return objI == d9n.a ? objI : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum c(String str, onm onmVar) {
        v1b0 v1b0Var;
        if (onmVar instanceof v1b0) {
            v1b0Var = (v1b0) onmVar;
            int i = v1b0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v1b0Var.c = i - Integer.MIN_VALUE;
            } else {
                v1b0Var = new v1b0(this, onmVar);
            }
        } else {
            v1b0Var = new v1b0(this, onmVar);
        }
        Object objA = v1b0Var.a;
        int i2 = v1b0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            sqn sqnVarN = CreateRequestRequest.n();
            sqnVarN.q(str);
            sqnVarN.n(this.b.g().getID());
            CreateRequestRequest createRequestRequestBuild = sqnVarN.build();
            createRequestRequestBuild.getClass();
            v1b0Var.c = 1;
            objA = this.a.a(createRequestRequestBuild, v1b0Var);
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
        switch (((CreateRequestResponse) objA).n().ordinal()) {
            case 0:
            case 8:
                return kza0.a;
            case 1:
                return kza0.b;
            case 2:
                return kza0.c;
            case 3:
                return kza0.d;
            case 4:
                return kza0.e;
            case 5:
                return kza0.f;
            case 6:
                return kza0.g;
            case 7:
                return kza0.h;
            default:
                eg.o();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(onm onmVar) {
        w1b0 w1b0Var;
        if (onmVar instanceof w1b0) {
            w1b0Var = (w1b0) onmVar;
            int i = w1b0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w1b0Var.c = i - Integer.MIN_VALUE;
            } else {
                w1b0Var = new w1b0(this, onmVar);
            }
        } else {
            w1b0Var = new w1b0(this, onmVar);
        }
        Object objB = w1b0Var.a;
        int i2 = w1b0Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            w1b0Var.c = 1;
            objB = this.a.b(w1b0Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        List<ChildAllowlistSettings> childrenList = ((ListChildrenAllowlistSettingsResponse) objB).getChildrenList();
        ArrayList arrayList = new ArrayList(q7h.U(childrenList, 10));
        for (ChildAllowlistSettings childAllowlistSettings : childrenList) {
            String childId = childAllowlistSettings.getChildId();
            String strO = childAllowlistSettings.o();
            String strP = childAllowlistSettings.p();
            if (strP.length() <= 0) {
                strP = null;
            }
            arrayList.add(new a0g(childId, new f2g(strO, strP, childAllowlistSettings.hasColor() ? new Integer(childAllowlistSettings.getColor()) : null), childAllowlistSettings.n()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        x1b0 x1b0Var;
        if (onmVar instanceof x1b0) {
            x1b0Var = (x1b0) onmVar;
            int i = x1b0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x1b0Var.c = i - Integer.MIN_VALUE;
            } else {
                x1b0Var = new x1b0(this, onmVar);
            }
        } else {
            x1b0Var = new x1b0(this, onmVar);
        }
        Object objE = x1b0Var.a;
        int i2 = x1b0Var.c;
        if (i2 == 0) {
            hm5.M(objE);
            x1b0Var.c = 1;
            objE = this.a.e(x1b0Var);
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
        GetMyRequestsResponse getMyRequestsResponse = (GetMyRequestsResponse) objE;
        h290<MyRequest> h290VarO = getMyRequestsResponse.o();
        ArrayList arrayList = new ArrayList();
        for (MyRequest myRequest : h290VarO) {
            myRequest.getClass();
            gin0 gin0VarG = g(myRequest);
            if (gin0VarG != null) {
                arrayList.add(gin0VarG);
            }
        }
        h290<MyRequest> h290VarN = getMyRequestsResponse.n();
        ArrayList arrayList2 = new ArrayList();
        for (MyRequest myRequest2 : h290VarN) {
            myRequest2.getClass();
            gin0 gin0VarG2 = g(myRequest2);
            if (gin0VarG2 != null) {
                arrayList2.add(gin0VarG2);
            }
        }
        return new hin0(arrayList, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, onm onmVar) {
        y1b0 y1b0Var;
        Object dfs0Var;
        if (onmVar instanceof y1b0) {
            y1b0Var = (y1b0) onmVar;
            int i = y1b0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y1b0Var.c = i - Integer.MIN_VALUE;
            } else {
                y1b0Var = new y1b0(this, onmVar);
            }
        } else {
            y1b0Var = new y1b0(this, onmVar);
        }
        Object objJ = y1b0Var.a;
        int i2 = y1b0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            y1b0Var.c = 1;
            objJ = this.a.j(str, y1b0Var);
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
        GetPendingRequestsResponse getPendingRequestsResponse = (GetPendingRequestsResponse) objJ;
        h290<PendingAllowlistRequest> h290VarO = getPendingRequestsResponse.o();
        ArrayList arrayList = new ArrayList();
        for (PendingAllowlistRequest pendingAllowlistRequest : h290VarO) {
            long millis = TimeUnit.SECONDS.toMillis(pendingAllowlistRequest.getCreatedAt().q());
            int iO = pendingAllowlistRequest.o();
            int i3 = iO == 0 ? -1 : t1b0.a[l1d.C(iO)];
            if (i3 == 1) {
                dfs0Var = new dfs0(pendingAllowlistRequest.p(), pendingAllowlistRequest.n().n(), millis);
            } else if (i3 == 2) {
                dfs0Var = new efs0(millis, pendingAllowlistRequest.p(), pendingAllowlistRequest.q().q(), pendingAllowlistRequest.q().n(), pendingAllowlistRequest.q().o());
            } else {
                if (i3 != 3) {
                    eg.o();
                    return null;
                }
                dfs0Var = null;
            }
            if (dfs0Var != null) {
                arrayList.add(dfs0Var);
            }
        }
        String strN = getPendingRequestsResponse.n();
        List listA1 = o7h.a1(arrayList, new cvt((byte) 23));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listA1) {
            if (obj instanceof efs0) {
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList2) {
            String str2 = ((efs0) obj2).c;
            Object objH = linkedHashMap.get(str2);
            if (objH == null) {
                objH = cfm0.h(str2, linkedHashMap);
            }
            ((List) objH).add(obj2);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList3.add(new hfs0((String) entry.getKey(), (List) entry.getValue()));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listA1) {
            if (obj3 instanceof dfs0) {
                arrayList4.add(obj3);
            }
        }
        smc0 smc0VarN = k4p1.n();
        smc0VarN.addAll(arrayList3);
        if (!arrayList4.isEmpty()) {
            smc0VarN.add(new gfs0(arrayList4));
        }
        return new nhs0(strN, o7h.a1(k4p1.k(smc0VarN), new cvt((byte) 24)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum h(String str, onm onmVar) {
        z1b0 z1b0Var;
        if (onmVar instanceof z1b0) {
            z1b0Var = (z1b0) onmVar;
            int i = z1b0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z1b0Var.c = i - Integer.MIN_VALUE;
            } else {
                z1b0Var = new z1b0(this, onmVar);
            }
        } else {
            z1b0Var = new z1b0(this, onmVar);
        }
        Object objC = z1b0Var.a;
        int i2 = z1b0Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            rp40 rp40VarN = GetRequestStatusRequest.n();
            rp40VarN.q(str);
            rp40VarN.n(this.b.g().getID());
            GetRequestStatusRequest getRequestStatusRequestBuild = rp40VarN.build();
            getRequestStatusRequestBuild.getClass();
            z1b0Var.c = 1;
            objC = this.a.c(getRequestStatusRequestBuild, z1b0Var);
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
        int iOrdinal = ((GetRequestStatusResponse) objC).n().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return c2b0.b;
            }
            if (iOrdinal == 2) {
                return c2b0.c;
            }
            if (iOrdinal == 3) {
                return c2b0.d;
            }
            if (iOrdinal == 4) {
                return c2b0.e;
            }
            if (iOrdinal != 5) {
                eg.o();
                return null;
            }
        }
        return c2b0.a;
    }

    public final Object i(String str, int i, p8g0 p8g0Var) {
        io21 io21Var;
        du21 du21VarN = ResolveRequestRequest.n();
        du21VarN.q(str);
        int iC = l1d.C(i);
        if (iC == 0) {
            io21Var = io21.REQUEST_DECISION_APPROVED;
        } else if (iC == 1) {
            io21Var = io21.REQUEST_DECISION_DENIED;
        } else {
            if (iC != 2) {
                eg.o();
                return null;
            }
            io21Var = io21.REQUEST_DECISION_RESET;
        }
        du21VarN.n(io21Var);
        ResolveRequestRequest resolveRequestRequestBuild = du21VarN.build();
        resolveRequestRequestBuild.getClass();
        Object objD = this.a.d(str, resolveRequestRequestBuild, p8g0Var);
        return objD == d9n.a ? objD : rih1.a;
    }

    public final Object j(String str, boolean z, pgg0 pgg0Var) {
        bk61 bk61VarN = SetChildRequestSettingsRequest.n();
        bk61VarN.q(str);
        bk61VarN.n(z);
        SetChildRequestSettingsRequest setChildRequestSettingsRequest = (SetChildRequestSettingsRequest) bk61VarN.build();
        setChildRequestSettingsRequest.getClass();
        Object objH = this.a.h(str, setChildRequestSettingsRequest, pgg0Var);
        return objH == d9n.a ? objH : rih1.a;
    }
}
