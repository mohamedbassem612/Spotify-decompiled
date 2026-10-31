package p;

import com.spotify.agentgateway.v1.AvailablePersona;
import com.spotify.agentgateway.v1.CreateConversationRequest;
import com.spotify.agentgateway.v1.CreateConversationResponse;
import com.spotify.agentgateway.v1.CreatePlaylistFromListRequest;
import com.spotify.agentgateway.v1.CreatePlaylistFromListResponse;
import com.spotify.agentgateway.v1.DeleteConversationRequest;
import com.spotify.agentgateway.v1.GetAvailablePersonasRequest;
import com.spotify.agentgateway.v1.GetAvailablePersonasResponse;
import com.spotify.agentgateway.v1.GetConversationListRequest;
import com.spotify.agentgateway.v1.GetConversationListResponse;
import com.spotify.agentgateway.v1.GetConversationRequest;
import com.spotify.agentgateway.v1.GetConversationResponse;
import com.spotify.agentgateway.v1.GetConversationStartersRequest;
import com.spotify.agentgateway.v1.GetConversationStartersResponse;
import com.spotify.agentgateway.v1.GetProgressStagesRequest;
import com.spotify.agentgateway.v1.GetProgressStagesResponse;
import com.spotify.agentgateway.v1.RecordEventInConversationRequest;
import com.spotify.agentgateway.v1.SendMessageInConversationRequest;
import com.spotify.agentgateway.v1.SendMessageResponse;
import com.spotify.agentgateway.v1.SendMessageWithImageRequest;
import com.spotify.agentgateway.v1.StopGenerationRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wr2 implements jr2 {
    public static final ArrayList b = dug.E(mt2.a());
    public final vt2 a;

    public wr2(vt2 vt2Var) {
        this.a = vt2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(tt2 tt2Var, String str, boolean z, String str2, dt2 dt2Var, us2 us2Var, String str3, onm onmVar) {
        kr2 kr2Var;
        if (onmVar instanceof kr2) {
            kr2Var = (kr2) onmVar;
            int i = kr2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kr2Var.c = i - Integer.MIN_VALUE;
            } else {
                kr2Var = new kr2(this, onmVar);
            }
        } else {
            kr2Var = new kr2(this, onmVar);
        }
        Object objH = kr2Var.a;
        int i2 = kr2Var.c;
        if (i2 == 0) {
            hm5.M(objH);
            wjn wjnVarP = CreateConversationRequest.p();
            wjnVarP.s(str);
            wjnVarP.u(dug.D(tt2Var));
            wjnVarP.n(b);
            wjnVarP.t(z);
            if (str2 != null) {
                wjnVarP.y(str2);
            }
            bs2.a(wjnVarP, dt2Var);
            if (us2Var != null) {
                wjnVarP.w(bs2.f(us2Var));
            }
            if (str3 != null) {
                wjnVarP.q(str3);
            }
            CreateConversationRequest createConversationRequestBuild = wjnVarP.build();
            kr2Var.c = 1;
            objH = this.a.h(createConversationRequestBuild, kr2Var);
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
        return dug.u((CreateConversationResponse) objH);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        lr2 lr2Var;
        if (onmVar instanceof lr2) {
            lr2Var = (lr2) onmVar;
            int i = lr2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lr2Var.c = i - Integer.MIN_VALUE;
            } else {
                lr2Var = new lr2(this, onmVar);
            }
        } else {
            lr2Var = new lr2(this, onmVar);
        }
        Object objM = lr2Var.a;
        int i2 = lr2Var.c;
        if (i2 == 0) {
            hm5.M(objM);
            ipn ipnVarO = CreatePlaylistFromListRequest.o();
            ipnVarO.n(str);
            CreatePlaylistFromListRequest createPlaylistFromListRequestBuild = ipnVarO.build();
            createPlaylistFromListRequestBuild.getClass();
            lr2Var.c = 1;
            objM = this.a.m(createPlaylistFromListRequestBuild, lr2Var);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objM);
        }
        return new ms2(((CreatePlaylistFromListResponse) objM).getPlaylistUri());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar) {
        mr2 mr2Var;
        if (onmVar instanceof mr2) {
            mr2Var = (mr2) onmVar;
            int i = mr2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mr2Var.c = i - Integer.MIN_VALUE;
            } else {
                mr2Var = new mr2(this, onmVar);
            }
        } else {
            mr2Var = new mr2(this, onmVar);
        }
        Object objB = mr2Var.a;
        int i2 = mr2Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            c7t c7tVarO = DeleteConversationRequest.o();
            c7tVarO.n(str);
            DeleteConversationRequest deleteConversationRequestBuild = c7tVarO.build();
            deleteConversationRequestBuild.getClass();
            mr2Var.c = 1;
            objB = this.a.b(deleteConversationRequestBuild, mr2Var);
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
        sy21 sy21Var = (sy21) objB;
        if (sy21Var.a.Q0) {
            return rih1.a;
        }
        throw new HttpException(sy21Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable e(String str, onm onmVar) {
        nr2 nr2Var;
        if (onmVar instanceof nr2) {
            nr2Var = (nr2) onmVar;
            int i = nr2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nr2Var.c = i - Integer.MIN_VALUE;
            } else {
                nr2Var = new nr2(this, onmVar);
            }
        } else {
            nr2Var = new nr2(this, onmVar);
        }
        Object objI = nr2Var.a;
        int i2 = nr2Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            el40 el40VarN = GetAvailablePersonasRequest.n();
            el40VarN.n(str);
            GetAvailablePersonasRequest getAvailablePersonasRequestBuild = el40VarN.build();
            getAvailablePersonasRequestBuild.getClass();
            nr2Var.c = 1;
            objI = this.a.i(getAvailablePersonasRequestBuild, nr2Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        h290<AvailablePersona> h290VarN = ((GetAvailablePersonasResponse) objI).n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (AvailablePersona availablePersona : h290VarN) {
            availablePersona.getClass();
            arrayList.add(dug.t(availablePersona));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, String str2, onm onmVar) {
        or2 or2Var;
        if (onmVar instanceof or2) {
            or2Var = (or2) onmVar;
            int i = or2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                or2Var.c = i - Integer.MIN_VALUE;
            } else {
                or2Var = new or2(this, onmVar);
            }
        } else {
            or2Var = new or2(this, onmVar);
        }
        Object objL = or2Var.a;
        int i2 = or2Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            gm40 gm40VarO = GetConversationRequest.o();
            gm40VarO.n(str);
            if (str2 != null) {
                gm40VarO.q(str2);
            }
            GetConversationRequest getConversationRequestBuild = gm40VarO.build();
            or2Var.c = 1;
            objL = this.a.l(getConversationRequestBuild, or2Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        return dug.w((GetConversationResponse) objL);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, onm onmVar) {
        pr2 pr2Var;
        if (onmVar instanceof pr2) {
            pr2Var = (pr2) onmVar;
            int i = pr2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pr2Var.c = i - Integer.MIN_VALUE;
            } else {
                pr2Var = new pr2(this, onmVar);
            }
        } else {
            pr2Var = new pr2(this, onmVar);
        }
        Object objC = pr2Var.a;
        int i2 = pr2Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            fm40 fm40VarN = GetConversationListRequest.n();
            if (str != null) {
                fm40VarN.n(str);
            }
            sn21 sn21VarE = bs2.e(fm40VarN.build());
            pr2Var.c = 1;
            objC = this.a.c(sn21VarE, pr2Var);
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
        return dug.v((GetConversationListResponse) objC);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ot2 ot2Var, String str, String str2, boolean z, dt2 dt2Var, onm onmVar) {
        qr2 qr2Var;
        if (onmVar instanceof qr2) {
            qr2Var = (qr2) onmVar;
            int i = qr2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qr2Var.c = i - Integer.MIN_VALUE;
            } else {
                qr2Var = new qr2(this, onmVar);
            }
        } else {
            qr2Var = new qr2(this, onmVar);
        }
        Object objD = qr2Var.a;
        int i2 = qr2Var.c;
        if (i2 == 0) {
            hm5.M(objD);
            hm40 hm40VarO = GetConversationStartersRequest.o();
            if (ot2Var != null) {
                hm40VarO.u(dug.C(ot2Var));
            }
            if (str != null) {
                hm40VarO.q(str);
            }
            if (str2 != null) {
                hm40VarO.v(str2);
            }
            hm40VarO.r(z);
            bs2.b(hm40VarO, dt2Var);
            GetConversationStartersRequest getConversationStartersRequestBuild = hm40VarO.build();
            qr2Var.c = 1;
            objD = this.a.d(getConversationStartersRequestBuild, qr2Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        return dug.x((GetConversationStartersResponse) objD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(tt2 tt2Var, String str, String str2, onm onmVar) {
        rr2 rr2Var;
        if (onmVar instanceof rr2) {
            rr2Var = (rr2) onmVar;
            int i = rr2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rr2Var.c = i - Integer.MIN_VALUE;
            } else {
                rr2Var = new rr2(this, onmVar);
            }
        } else {
            rr2Var = new rr2(this, onmVar);
        }
        Object objF = rr2Var.a;
        int i2 = rr2Var.c;
        if (i2 == 0) {
            hm5.M(objF);
            yo40 yo40VarO = GetProgressStagesRequest.o();
            yo40VarO.r(dug.D(tt2Var));
            yo40VarO.q(str);
            if (str2 != null) {
                yo40VarO.n(str2);
            }
            GetProgressStagesRequest getProgressStagesRequestBuild = yo40VarO.build();
            rr2Var.c = 1;
            objF = this.a.f(getProgressStagesRequestBuild, rr2Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        return dug.y((GetProgressStagesResponse) objF);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, upf upfVar, onm onmVar) {
        sr2 sr2Var;
        if (onmVar instanceof sr2) {
            sr2Var = (sr2) onmVar;
            int i = sr2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sr2Var.c = i - Integer.MIN_VALUE;
            } else {
                sr2Var = new sr2(this, onmVar);
            }
        } else {
            sr2Var = new sr2(this, onmVar);
        }
        Object objJ = sr2Var.a;
        int i2 = sr2Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            r311 r311VarN = RecordEventInConversationRequest.n();
            r311VarN.n(str);
            r311VarN.q(dug.A(upfVar));
            RecordEventInConversationRequest recordEventInConversationRequestBuild = r311VarN.build();
            recordEventInConversationRequestBuild.getClass();
            sr2Var.c = 1;
            objJ = this.a.j(recordEventInConversationRequestBuild, sr2Var);
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
        sy21 sy21Var = (sy21) objJ;
        if (sy21Var.a.Q0) {
            return rih1.a;
        }
        throw new HttpException(sy21Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, tt2 tt2Var, String str2, String str3, dt2 dt2Var, us2 us2Var, onm onmVar) {
        tr2 tr2Var;
        if (onmVar instanceof tr2) {
            tr2Var = (tr2) onmVar;
            int i = tr2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tr2Var.c = i - Integer.MIN_VALUE;
            } else {
                tr2Var = new tr2(this, onmVar);
            }
        } else {
            tr2Var = new tr2(this, onmVar);
        }
        Object objA = tr2Var.a;
        int i2 = tr2Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            h461 h461VarP = SendMessageInConversationRequest.p();
            h461VarP.q(str);
            h461VarP.v(dug.D(tt2Var));
            h461VarP.s(str2);
            h461VarP.n(b);
            if (str3 != null) {
                h461VarP.x(str3);
            }
            bs2.c(h461VarP, dt2Var);
            if (us2Var != null) {
                h461VarP.u(bs2.f(us2Var));
            }
            SendMessageInConversationRequest sendMessageInConversationRequestBuild = h461VarP.build();
            tr2Var.c = 1;
            objA = this.a.a(sendMessageInConversationRequestBuild, tr2Var);
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
        return dug.z((SendMessageResponse) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, tt2 tt2Var, List list, String str2, String str3, dt2 dt2Var, onm onmVar) {
        ur2 ur2Var;
        if (onmVar instanceof ur2) {
            ur2Var = (ur2) onmVar;
            int i = ur2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ur2Var.c = i - Integer.MIN_VALUE;
            } else {
                ur2Var = new ur2(this, onmVar);
            }
        } else {
            ur2Var = new ur2(this, onmVar);
        }
        Object objK = ur2Var.a;
        int i2 = ur2Var.c;
        if (i2 == 0) {
            hm5.M(objK);
            if (list.isEmpty()) {
                hhg1.n("imageAttachments must not be empty");
                return null;
            }
            k461 k461VarQ = SendMessageWithImageRequest.q();
            k461VarQ.r(str);
            k461VarQ.v(dug.D(tt2Var));
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(dug.B((ts2) it.next()));
            }
            k461VarQ.n(arrayList);
            k461VarQ.t(str2);
            k461VarQ.q(b);
            if (str3 != null) {
                k461VarQ.x(str3);
            }
            bs2.d(k461VarQ, dt2Var);
            SendMessageWithImageRequest sendMessageWithImageRequestBuild = k461VarQ.build();
            ur2Var.c = 1;
            objK = this.a.k(sendMessageWithImageRequestBuild, ur2Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        return dug.z((SendMessageResponse) objK);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, onm onmVar) {
        vr2 vr2Var;
        if (onmVar instanceof vr2) {
            vr2Var = (vr2) onmVar;
            int i = vr2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vr2Var.c = i - Integer.MIN_VALUE;
            } else {
                vr2Var = new vr2(this, onmVar);
            }
        } else {
            vr2Var = new vr2(this, onmVar);
        }
        Object objE = vr2Var.a;
        int i2 = vr2Var.c;
        if (i2 == 0) {
            hm5.M(objE);
            vzb1 vzb1VarN = StopGenerationRequest.n();
            vzb1VarN.n(str);
            StopGenerationRequest stopGenerationRequestBuild = vzb1VarN.build();
            stopGenerationRequestBuild.getClass();
            vr2Var.c = 1;
            objE = this.a.e(stopGenerationRequestBuild, vr2Var);
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
        sy21 sy21Var = (sy21) objE;
        if (sy21Var.a.Q0) {
            return rih1.a;
        }
        throw new HttpException(sy21Var);
    }
}
