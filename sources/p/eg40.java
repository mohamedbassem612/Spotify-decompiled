package p;

import android.os.Parcelable;
import com.google.protobuf.Timestamp;
import com.spotify.bluejay.data.api.GenerationServiceException;
import com.spotify.personalizedepisodes.contentservice.v1.ConfirmGenerationRequest;
import com.spotify.personalizedepisodes.contentservice.v1.ConfirmGenerationResponse;
import com.spotify.personalizedepisodes.contentservice.v1.CreateGenerationRequest;
import com.spotify.personalizedepisodes.contentservice.v1.CreateGenerationResponse;
import com.spotify.personalizedepisodes.contentservice.v1.CreateOrUpdatePendingShowRequest;
import com.spotify.personalizedepisodes.contentservice.v1.CreateOrUpdatePendingShowResponse;
import com.spotify.personalizedepisodes.contentservice.v1.EpisodeStatus;
import com.spotify.personalizedepisodes.contentservice.v1.GenerationProgress;
import com.spotify.personalizedepisodes.contentservice.v1.ListEpisodeStatusResponse;
import com.spotify.personalizedepisodes.contentservice.v1.ListShowStatusResponse;
import com.spotify.personalizedepisodes.contentservice.v1.Placeholder;
import com.spotify.personalizedepisodes.contentservice.v1.Preview;
import com.spotify.personalizedepisodes.contentservice.v1.RecommendedTool;
import com.spotify.personalizedepisodes.contentservice.v1.Show;
import com.spotify.personalizedepisodes.contentservice.v1.ShowItem;
import com.spotify.personalizedepisodes.contentservice.v1.ShowStatus;
import com.spotify.personalizedepisodes.contentservice.v1.StepAnswer;
import com.spotify.personalizedepisodes.contentservice.v1.ToolSelection;
import com.spotify.personalizedepisodes.contentservice.v1.ValidateStepAnswerRequest;
import com.spotify.personalizedepisodes.contentservice.v1.ValidateStepAnswerResponse;
import j$.time.Instant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eg40 {
    public final mh40 a;

    public eg40(mh40 mh40Var) {
        this.a = mh40Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    public static gcz g(EpisodeStatus episodeStatus) {
        ah40 ah40VarH = h(episodeStatus.p());
        Timestamp timestampQ = episodeStatus.q();
        Instant instantOfEpochSecond = Instant.ofEpochSecond(timestampQ.q(), timestampQ.p());
        String strO = episodeStatus.o();
        if (episodeStatus.r()) {
            strO.getClass();
            if (strO.length() <= 0) {
                strO = null;
            }
        } else {
            strO = null;
        }
        return new gcz(ah40VarH, instantOfEpochSecond, strO);
    }

    public static ah40 h(GenerationProgress generationProgress) {
        dh40 dh40Var;
        String strO = generationProgress.o();
        switch (generationProgress.q()) {
            case GENERATION_STATUS_UNSPECIFIED:
            case UNRECOGNIZED:
                dh40Var = dh40.a;
                break;
            case GENERATION_STATUS_GENERATING:
                dh40Var = dh40.b;
                break;
            case GENERATION_STATUS_GENERATED:
                dh40Var = dh40.c;
                break;
            case GENERATION_STATUS_READY:
                dh40Var = dh40.d;
                break;
            case GENERATION_STATUS_FAILED:
                dh40Var = dh40.e;
                break;
            case GENERATION_STATUS_NO_CREDITS:
                dh40Var = dh40.f;
                break;
            default:
                eg.o();
                return null;
        }
        Timestamp timestampP = generationProgress.p();
        return new ah40(strO, dh40Var, Instant.ofEpochSecond(timestampP.q(), timestampP.p()));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.data.api.GenerationServiceException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ozk ozkVar, onm onmVar) throws GenerationServiceException {
        xf40 xf40Var;
        ShowItem showItem;
        twt0 twt0Var;
        String strN;
        if (onmVar instanceof xf40) {
            xf40Var = (xf40) onmVar;
            int i = xf40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xf40Var.c = i - Integer.MIN_VALUE;
            } else {
                xf40Var = new xf40(this, onmVar);
            }
        } else {
            xf40Var = new xf40(this, onmVar);
        }
        Object objD = xf40Var.a;
        int i2 = xf40Var.c;
        String str = null;
        if (i2 == 0) {
            hm5.M(objD);
            nzk nzkVarN = ConfirmGenerationRequest.n();
            nzkVarN.q(ozkVar.a);
            nzkVarN.t(cpn1.D(ozkVar.b));
            z681 z681Var = ozkVar.c;
            if (z681Var instanceof y681) {
                w681 w681VarQ = ShowItem.q();
                c281 c281VarP = Show.p();
                c281VarP.n(((y681) z681Var).a);
                w681VarQ.q(c281VarP.build());
                showItem = (ShowItem) w681VarQ.build();
            } else {
                if (!(z681Var instanceof x681)) {
                    eg.o();
                    return null;
                }
                w681 w681VarQ2 = ShowItem.q();
                w5t0 w5t0VarR = Placeholder.r();
                x681 x681Var = (x681) z681Var;
                w5t0VarR.r(x681Var.a);
                w5t0VarR.s(x681Var.b);
                w5t0VarR.q(x681Var.c);
                w5t0VarR.n(x681Var.d);
                w681VarQ2.n((Placeholder) w5t0VarR.build());
                showItem = (ShowItem) w681VarQ2.build();
            }
            nzkVarN.u(showItem);
            String str2 = ozkVar.d;
            if (str2 != null) {
                nzkVarN.w(str2);
            }
            u1f1 u1f1Var = ozkVar.e;
            if (u1f1Var != null) {
                t1f1 t1f1VarQ = ToolSelection.q();
                t1f1VarQ.n(u1f1Var.a);
                nzkVarN.v((ToolSelection) t1f1VarQ.build());
            }
            r591 r591Var = ozkVar.f;
            if (r591Var != null) {
                int iOrdinal = r591Var.ordinal();
                if (iOrdinal == 0) {
                    twt0Var = twt0.PLAYBACK_CONTROL_DEFAULT;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    twt0Var = twt0.PLAYBACK_CONTROL_CHAPTER_SKIP;
                }
                nzkVarN.s(twt0Var);
            }
            if (ozkVar.g) {
                nzkVarN.n();
            }
            String str3 = ozkVar.h;
            if (str3 != null) {
                nzkVarN.r(str3);
            }
            ConfirmGenerationRequest confirmGenerationRequestBuild = nzkVarN.build();
            xf40Var.c = 1;
            objD = this.a.d(confirmGenerationRequestBuild, xf40Var);
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
        sy21 sy21Var = (sy21) objD;
        if (!sy21Var.a.Q0) {
            throw ryn1.A(sy21Var);
        }
        ConfirmGenerationResponse confirmGenerationResponse = (ConfirmGenerationResponse) sy21Var.b;
        if (confirmGenerationResponse != null && (strN = confirmGenerationResponse.n()) != null && strN.length() > 0) {
            str = strN;
        }
        return new pzk(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(dkn dknVar, onm onmVar) {
        yf40 yf40Var;
        Parcelable y681Var;
        if (onmVar instanceof yf40) {
            yf40Var = (yf40) onmVar;
            int i = yf40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yf40Var.c = i - Integer.MIN_VALUE;
            } else {
                yf40Var = new yf40(this, onmVar);
            }
        } else {
            yf40Var = new yf40(this, onmVar);
        }
        Object objA = yf40Var.a;
        int i2 = yf40Var.c;
        r591 r591Var = null;
        if (i2 == 0) {
            hm5.M(objA);
            ckn cknVarP = CreateGenerationRequest.p();
            cknVarP.r(dknVar.a);
            cknVarP.t(dknVar.b);
            cknVarP.n(dknVar.c);
            List<zub1> list = dknVar.e;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (zub1 zub1Var : list) {
                xub1 xub1VarP = StepAnswer.p();
                xub1VarP.r(zub1Var.a);
                xub1VarP.n(zub1Var.b);
                xub1VarP.q(zub1Var.c);
                arrayList.add(xub1VarP.build());
            }
            cknVarP.q(arrayList);
            xk41 xk41Var = dknVar.d;
            if (xk41Var != null) {
                cknVarP.s(cpn1.D(xk41Var));
            }
            CreateGenerationRequest createGenerationRequestBuild = cknVarP.build();
            yf40Var.c = 1;
            objA = this.a.a(createGenerationRequestBuild, yf40Var);
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
        sy21 sy21Var = (sy21) objA;
        if (!sy21Var.a.Q0) {
            throw ryn1.A(sy21Var);
        }
        Object obj = sy21Var.b;
        if (obj == null) {
            hhg1.n("Response body is null for successful create generation response");
            return null;
        }
        CreateGenerationResponse createGenerationResponse = (CreateGenerationResponse) obj;
        String strO = createGenerationResponse.o();
        Preview previewP = createGenerationResponse.p();
        jaw0 jaw0Var = new jaw0(previewP.getDescription(), previewP.n());
        h290<ShowItem> h290VarU = createGenerationResponse.u();
        ArrayList arrayList2 = new ArrayList();
        for (ShowItem showItem : h290VarU) {
            showItem.getClass();
            int iN = showItem.n();
            int i3 = iN == 0 ? -1 : wf40.a[l1d.C(iN)];
            if (i3 == 1) {
                y681Var = new y681(showItem.p().o());
            } else if (i3 != 2) {
                y681Var = null;
            } else {
                y681Var = new x681(showItem.o().getId(), showItem.o().p(), showItem.o().getTitle(), showItem.o().o());
            }
            if (y681Var != null) {
                arrayList2.add(y681Var);
            }
        }
        zlk1 zlk1Var = new zlk1(createGenerationResponse.v().getId(), createGenerationResponse.v().getName(), createGenerationResponse.v().getDescription(), createGenerationResponse.v().o());
        xk41 xk41Var2 = (!createGenerationResponse.w() || createGenerationResponse.r().q() == dm41.b || createGenerationResponse.r().q() == dm41.c) ? new xk41(1, null) : cpn1.C(createGenerationResponse.r());
        boolean zT = createGenerationResponse.t();
        h290<RecommendedTool> h290VarS = createGenerationResponse.s();
        ArrayList arrayList3 = new ArrayList(q7h.U(h290VarS, 10));
        for (RecommendedTool recommendedTool : h290VarS) {
            recommendedTool.getClass();
            arrayList3.add(new e311(recommendedTool.getId(), recommendedTool.q(), recommendedTool.getName(), recommendedTool.p(), recommendedTool.n(), recommendedTool.o()));
        }
        String strN = createGenerationResponse.n();
        int iOrdinal = createGenerationResponse.q().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                r591Var = r591.c;
            } else if (iOrdinal == 2) {
                r591Var = r591.b;
            } else if (iOrdinal != 3) {
                eg.o();
                return null;
            }
        }
        return new ekn(strO, jaw0Var, arrayList2, zlk1Var, xk41Var2, zT, arrayList3, strN, r591Var, createGenerationResponse.getPrompt());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.data.api.GenerationServiceException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ron ronVar, onm onmVar) throws GenerationServiceException {
        zf40 zf40Var;
        if (onmVar instanceof zf40) {
            zf40Var = (zf40) onmVar;
            int i = zf40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zf40Var.c = i - Integer.MIN_VALUE;
            } else {
                zf40Var = new zf40(this, onmVar);
            }
        } else {
            zf40Var = new zf40(this, onmVar);
        }
        Object objC = zf40Var.a;
        int i2 = zf40Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            jon jonVarN = CreateOrUpdatePendingShowRequest.n();
            jonVarN.n(ronVar.a);
            jonVarN.q(ronVar.b);
            CreateOrUpdatePendingShowRequest createOrUpdatePendingShowRequestBuild = jonVarN.build();
            zf40Var.c = 1;
            objC = this.a.c(createOrUpdatePendingShowRequestBuild, zf40Var);
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
        sy21 sy21Var = (sy21) objC;
        if (!sy21Var.a.Q0) {
            throw ryn1.A(sy21Var);
        }
        Object obj = sy21Var.b;
        if (obj != null) {
            CreateOrUpdatePendingShowResponse createOrUpdatePendingShowResponse = (CreateOrUpdatePendingShowResponse) obj;
            return new son(createOrUpdatePendingShowResponse.n().getId(), createOrUpdatePendingShowResponse.n().getTitle(), createOrUpdatePendingShowResponse.n().o(), createOrUpdatePendingShowResponse.n().p());
        }
        hhg1.n("Response body is null for successful createOrUpdatePendingShow response");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(String str, onm onmVar) {
        ag40 ag40Var;
        if (onmVar instanceof ag40) {
            ag40Var = (ag40) onmVar;
            int i = ag40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ag40Var.c = i - Integer.MIN_VALUE;
            } else {
                ag40Var = new ag40(this, onmVar);
            }
        } else {
            ag40Var = new ag40(this, onmVar);
        }
        Object objG = ag40Var.a;
        int i2 = ag40Var.c;
        if (i2 == 0) {
            hm5.M(objG);
            ag40Var.c = 1;
            objG = this.a.g(str, null, ag40Var);
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
        sy21 sy21Var = (sy21) objG;
        if (!sy21Var.a.Q0) {
            throw ryn1.A(sy21Var);
        }
        Object obj = sy21Var.b;
        if (obj == null) {
            hhg1.n("Response body is null for successful get episode statuses response");
            return null;
        }
        h290<EpisodeStatus> h290VarN = ((ListEpisodeStatusResponse) obj).n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (EpisodeStatus episodeStatus : h290VarN) {
            episodeStatus.getClass();
            arrayList.add(g(episodeStatus));
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.data.api.GenerationServiceException */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable e(List list, Instant instant, onm onmVar) throws GenerationServiceException {
        bg40 bg40Var;
        bh40 bh40Var;
        String str;
        if (onmVar instanceof bg40) {
            bg40Var = (bg40) onmVar;
            int i = bg40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bg40Var.c = i - Integer.MIN_VALUE;
            } else {
                bg40Var = new bg40(this, onmVar);
            }
        } else {
            bg40Var = new bg40(this, onmVar);
        }
        Object objF = bg40Var.a;
        int i2 = bg40Var.c;
        if (i2 == 0) {
            hm5.M(objF);
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                int iOrdinal = ((dh40) it.next()).ordinal();
                if (iOrdinal == 0) {
                    bh40Var = bh40.GENERATION_STATUS_UNSPECIFIED;
                } else if (iOrdinal == 1) {
                    bh40Var = bh40.GENERATION_STATUS_GENERATING;
                } else if (iOrdinal == 2) {
                    bh40Var = bh40.GENERATION_STATUS_GENERATED;
                } else if (iOrdinal == 3) {
                    bh40Var = bh40.GENERATION_STATUS_READY;
                } else if (iOrdinal == 4) {
                    bh40Var = bh40.GENERATION_STATUS_FAILED;
                } else {
                    if (iOrdinal != 5) {
                        eg.o();
                        return null;
                    }
                    bh40Var = bh40.GENERATION_STATUS_NO_CREDITS;
                }
                arrayList.add(bh40Var.name());
            }
            String string = instant != null ? instant.toString() : null;
            bg40Var.c = 1;
            objF = this.a.f(arrayList, string, bg40Var);
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
        sy21 sy21Var = (sy21) objF;
        if (!sy21Var.a.Q0) {
            throw ryn1.A(sy21Var);
        }
        Object obj = sy21Var.b;
        if (obj == null) {
            hhg1.n("Response body is null for successful get show statuses response");
            return null;
        }
        h290<ShowStatus> h290VarN = ((ListShowStatusResponse) obj).n();
        ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
        for (ShowStatus showStatus : h290VarN) {
            showStatus.getClass();
            String title = showStatus.getTitle();
            String strN = showStatus.n();
            strN.getClass();
            String str2 = strN.length() > 0 ? strN : null;
            String strR = showStatus.r();
            if (showStatus.t()) {
                strR.getClass();
                if (strR.length() > 0) {
                    str = strR;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            ah40 ah40VarH = h(showStatus.p());
            Timestamp timestampQ = showStatus.q();
            Instant instantOfEpochSecond = Instant.ofEpochSecond(timestampQ.q(), timestampQ.p());
            EpisodeStatus episodeStatusO = showStatus.o();
            if (!showStatus.s()) {
                episodeStatusO = null;
            }
            arrayList2.add(new na81(title, str2, str, ah40VarH, instantOfEpochSecond, episodeStatusO != null ? g(episodeStatusO) : null));
        }
        return arrayList2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.data.api.GenerationServiceException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, lnm lnmVar) throws GenerationServiceException {
        cg40 cg40Var;
        if (lnmVar instanceof cg40) {
            cg40Var = (cg40) lnmVar;
            int i = cg40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cg40Var.c = i - Integer.MIN_VALUE;
            } else {
                cg40Var = new cg40(this, lnmVar);
            }
        } else {
            cg40Var = new cg40(this, lnmVar);
        }
        Object objE = cg40Var.a;
        int i2 = cg40Var.c;
        if (i2 == 0) {
            hm5.M(objE);
            cg40Var.c = 1;
            objE = this.a.e(str, cg40Var);
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
        throw ryn1.A(sy21Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.data.api.GenerationServiceException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(mri1 mri1Var, onm onmVar) throws GenerationServiceException {
        dg40 dg40Var;
        if (onmVar instanceof dg40) {
            dg40Var = (dg40) onmVar;
            int i = dg40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dg40Var.c = i - Integer.MIN_VALUE;
            } else {
                dg40Var = new dg40(this, onmVar);
            }
        } else {
            dg40Var = new dg40(this, onmVar);
        }
        Object objB = dg40Var.a;
        int i2 = dg40Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            lri1 lri1VarN = ValidateStepAnswerRequest.n();
            lri1VarN.q(mri1Var.a);
            lri1VarN.n(mri1Var.b);
            ValidateStepAnswerRequest validateStepAnswerRequestBuild = lri1VarN.build();
            dg40Var.c = 1;
            objB = this.a.b(validateStepAnswerRequestBuild, dg40Var);
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
        if (!sy21Var.a.Q0) {
            throw ryn1.A(sy21Var);
        }
        Object obj = sy21Var.b;
        if (obj != null) {
            ValidateStepAnswerResponse validateStepAnswerResponse = (ValidateStepAnswerResponse) obj;
            return new nri1(validateStepAnswerResponse.n(), validateStepAnswerResponse.p() ? validateStepAnswerResponse.o() : null);
        }
        hhg1.n("Response body is null for successful validate step answer response");
        return null;
    }
}
