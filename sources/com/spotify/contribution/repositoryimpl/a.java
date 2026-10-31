package com.spotify.contribution.repositoryimpl;

import com.spotify.campfire.contribution.proto.v1.BatchCreateContributionsRequest;
import com.spotify.campfire.contribution.proto.v1.BatchCreateContributionsResponse;
import com.spotify.campfire.contribution.proto.v1.BatchDeleteContributionsRequest;
import com.spotify.campfire.contribution.proto.v1.BatchDeleteContributionsResponse;
import com.spotify.campfire.contribution.proto.v1.BatchGetContributionCapabilitiesRequest;
import com.spotify.campfire.contribution.proto.v1.BatchGetContributionCapabilitiesResponse;
import com.spotify.campfire.contribution.proto.v1.BatchGetContributionSummariesRequest;
import com.spotify.campfire.contribution.proto.v1.BatchGetContributionSummariesResponse;
import com.spotify.campfire.contribution.proto.v1.BatchGetContributionsRequest;
import com.spotify.campfire.contribution.proto.v1.BatchGetContributionsResponse;
import com.spotify.campfire.contribution.proto.v1.BatchUpdateContributionsRequest;
import com.spotify.campfire.contribution.proto.v1.BatchUpdateContributionsResponse;
import com.spotify.campfire.contribution.proto.v1.Contribution;
import com.spotify.campfire.contribution.proto.v1.ContributionFilters;
import com.spotify.campfire.contribution.proto.v1.ContributionPagination;
import com.spotify.campfire.contribution.proto.v1.ContributionReference;
import com.spotify.campfire.contribution.proto.v1.CreateContributionRequest;
import com.spotify.campfire.contribution.proto.v1.CreateContributionResponse;
import com.spotify.campfire.contribution.proto.v1.DeleteContributionRequest;
import com.spotify.campfire.contribution.proto.v1.DeleteContributionResponse;
import com.spotify.campfire.contribution.proto.v1.GetContributionCapabilitiesRequest;
import com.spotify.campfire.contribution.proto.v1.GetContributionCapabilitiesResponse;
import com.spotify.campfire.contribution.proto.v1.GetContributionFeatureControlRequest;
import com.spotify.campfire.contribution.proto.v1.GetContributionFeatureControlResponse;
import com.spotify.campfire.contribution.proto.v1.GetContributionSummaryRequest;
import com.spotify.campfire.contribution.proto.v1.GetContributionSummaryResponse;
import com.spotify.campfire.contribution.proto.v1.GetContributionsRequest;
import com.spotify.campfire.contribution.proto.v1.GetContributionsResponse;
import com.spotify.campfire.contribution.proto.v1.UpdateContributionRequest;
import com.spotify.campfire.contribution.proto.v1.UpdateContributionResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.a7t;
import p.am40;
import p.apm;
import p.b7t;
import p.bm40;
import p.bpm;
import p.cm40;
import p.cqm;
import p.cvm;
import p.d9n;
import p.dga;
import p.dm40;
import p.eg;
import p.ega;
import p.fga;
import p.gga;
import p.h290;
import p.hm5;
import p.ium;
import p.jqh1;
import p.kqh1;
import p.lha;
import p.lvm;
import p.m231;
import p.mld;
import p.onm;
import p.p7h;
import p.q7h;
import p.rih1;
import p.rum;
import p.tfa;
import p.ufa;
import p.ujn;
import p.vjn;
import p.vom;
import p.wom;
import p.xom;
import p.yah0;
import p.yl40;
import p.yom;
import p.z6x;
import p.zom;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a {
    public final cqm a;

    public a(cqm cqmVar) {
        this.a = cqmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(ArrayList arrayList, onm onmVar) {
        vom vomVar;
        m231 m231Var;
        m231 m231VarA;
        gga ggaVar;
        if (onmVar instanceof vom) {
            vomVar = (vom) onmVar;
            int i = vomVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vomVar.d = i - Integer.MIN_VALUE;
            } else {
                vomVar = new vom(this, onmVar);
            }
        } else {
            vomVar = new vom(this, onmVar);
        }
        Object objA = vomVar.b;
        int i2 = vomVar.d;
        if (i2 == 0) {
            hm5.M(objA);
            tfa tfaVarP = BatchCreateContributionsRequest.p();
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                vjn vjnVar = (vjn) it.next();
                ujn ujnVarN = CreateContributionRequest.n();
                ujnVarN.r(h.h(vjnVar.b()));
                ujnVarN.n(h.g(vjnVar.a()));
                ujnVarN.q(h.i(cvm.a));
                arrayList2.add(ujnVarN.build());
            }
            tfaVarP.n(arrayList2);
            BatchCreateContributionsRequest batchCreateContributionsRequest = (BatchCreateContributionsRequest) tfaVarP.build();
            batchCreateContributionsRequest.getClass();
            vomVar.a = arrayList;
            vomVar.d = 1;
            objA = this.a.a(batchCreateContributionsRequest, vomVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = vomVar.a;
            hm5.M(objA);
        }
        BatchCreateContributionsResponse batchCreateContributionsResponse = (BatchCreateContributionsResponse) objA;
        int iN = batchCreateContributionsResponse.n();
        h290 h290VarO = batchCreateContributionsResponse.o();
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            if (i3 >= iN) {
                ggaVar = new gga(obj, new m231(ContributionApiError.EmptyResponse.a));
            } else {
                CreateContributionResponse createContributionResponse = (CreateContributionResponse) h290VarO.get(i3);
                if (createContributionResponse.p()) {
                    try {
                        m231VarA = h.a(createContributionResponse.n());
                    } catch (ContributionApiError e) {
                        m231Var = new m231(e);
                        m231VarA = m231Var;
                    }
                    ggaVar = new gga(obj, m231VarA);
                } else {
                    m231Var = createContributionResponse.q() ? new m231(b.a(createContributionResponse.o())) : new m231(ContributionApiError.EmptyResponse.a);
                }
                m231VarA = m231Var;
                ggaVar = new gga(obj, m231VarA);
            }
            arrayList3.add(ggaVar);
            i3 = i4;
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(List list, onm onmVar) {
        wom womVar;
        gga ggaVar;
        if (onmVar instanceof wom) {
            womVar = (wom) onmVar;
            int i = womVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                womVar.d = i - Integer.MIN_VALUE;
            } else {
                womVar = new wom(this, onmVar);
            }
        } else {
            womVar = new wom(this, onmVar);
        }
        Object objH = womVar.b;
        int i2 = womVar.d;
        if (i2 == 0) {
            hm5.M(objH);
            ufa ufaVarP = BatchDeleteContributionsRequest.p();
            List<b7t> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (b7t b7tVar : list2) {
                a7t a7tVarN = DeleteContributionRequest.n();
                rum rumVarO = ContributionReference.o();
                rumVarO.n(b7tVar.a());
                a7tVarN.n(rumVarO);
                a7tVarN.q();
                arrayList.add(a7tVarN.build());
            }
            ufaVarP.n(arrayList);
            BatchDeleteContributionsRequest batchDeleteContributionsRequest = (BatchDeleteContributionsRequest) ufaVarP.build();
            batchDeleteContributionsRequest.getClass();
            womVar.a = list;
            womVar.d = 1;
            objH = this.a.h(batchDeleteContributionsRequest, womVar);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = womVar.a;
            hm5.M(objH);
        }
        BatchDeleteContributionsResponse batchDeleteContributionsResponse = (BatchDeleteContributionsResponse) objH;
        int iN = batchDeleteContributionsResponse.n();
        h290 h290VarO = batchDeleteContributionsResponse.o();
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
        int i3 = 0;
        for (Object obj : list3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            if (i3 >= iN) {
                ggaVar = new gga(obj, new m231(ContributionApiError.EmptyResponse.a));
            } else {
                DeleteContributionResponse deleteContributionResponse = (DeleteContributionResponse) h290VarO.get(i3);
                ggaVar = new gga(obj, deleteContributionResponse.p() ? rih1.a : deleteContributionResponse.o() ? new m231(b.a(deleteContributionResponse.n())) : new m231(ContributionApiError.EmptyResponse.a));
            }
            arrayList2.add(ggaVar);
            i3 = i4;
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(ArrayList arrayList, onm onmVar) {
        xom xomVar;
        m231 m231Var;
        gga ggaVar;
        if (onmVar instanceof xom) {
            xomVar = (xom) onmVar;
            int i = xomVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xomVar.d = i - Integer.MIN_VALUE;
            } else {
                xomVar = new xom(this, onmVar);
            }
        } else {
            xomVar = new xom(this, onmVar);
        }
        Object objD = xomVar.b;
        int i2 = xomVar.d;
        if (i2 == 0) {
            hm5.M(objD);
            fga fgaVarQ = BatchGetContributionsRequest.q();
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dm40 dm40Var = (dm40) it.next();
                cm40 cm40VarN = GetContributionsRequest.n();
                cm40VarN.r(h.h(dm40Var.c()));
                ContributionFilters contributionFiltersF = h.f(dm40Var.a());
                if (contributionFiltersF != null) {
                    cm40VarN.n(contributionFiltersF);
                }
                Integer numB = dm40Var.b();
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    ium iumVarN = ContributionPagination.n();
                    iumVarN.n(iIntValue);
                    cm40VarN.q(iumVarN.build());
                }
                arrayList2.add(cm40VarN.build());
            }
            fgaVarQ.n(arrayList2);
            BatchGetContributionsRequest batchGetContributionsRequest = (BatchGetContributionsRequest) fgaVarQ.build();
            batchGetContributionsRequest.getClass();
            xomVar.a = arrayList;
            xomVar.d = 1;
            objD = this.a.d(batchGetContributionsRequest, xomVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = xomVar.a;
            hm5.M(objD);
        }
        BatchGetContributionsResponse batchGetContributionsResponse = (BatchGetContributionsResponse) objD;
        int iO = batchGetContributionsResponse.o();
        h290 h290VarP = batchGetContributionsResponse.p();
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            if (i3 >= iO) {
                ggaVar = new gga(obj, new m231(ContributionApiError.EmptyResponse.a));
            } else {
                GetContributionsResponse getContributionsResponse = (GetContributionsResponse) h290VarP.get(i3);
                if (getContributionsResponse.p()) {
                    try {
                        h290<Contribution> h290VarN = getContributionsResponse.n().n();
                        m231Var = new ArrayList(q7h.U(h290VarN, 10));
                        for (Contribution contribution : h290VarN) {
                            contribution.getClass();
                            m231Var.add(h.a(contribution));
                        }
                    } catch (ContributionApiError e) {
                        m231Var = new m231(e);
                    }
                } else {
                    m231Var = getContributionsResponse.q() ? new m231(b.a(getContributionsResponse.o())) : z6x.a;
                }
                ggaVar = new gga(obj, m231Var);
            }
            arrayList3.add(ggaVar);
            i3 = i4;
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(List list, onm onmVar) {
        yom yomVar;
        gga ggaVar;
        if (onmVar instanceof yom) {
            yomVar = (yom) onmVar;
            int i = yomVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yomVar.d = i - Integer.MIN_VALUE;
            } else {
                yomVar = new yom(this, onmVar);
            }
        } else {
            yomVar = new yom(this, onmVar);
        }
        Object objE = yomVar.b;
        int i2 = yomVar.d;
        if (i2 == 0) {
            hm5.M(objE);
            dga dgaVarP = BatchGetContributionCapabilitiesRequest.p();
            List<mld> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (mld mldVar : list2) {
                yl40 yl40VarN = GetContributionCapabilitiesRequest.n();
                yl40VarN.n(h.e(mldVar));
                arrayList.add(yl40VarN.build());
            }
            dgaVarP.n(arrayList);
            BatchGetContributionCapabilitiesRequest batchGetContributionCapabilitiesRequest = (BatchGetContributionCapabilitiesRequest) dgaVarP.build();
            batchGetContributionCapabilitiesRequest.getClass();
            yomVar.a = list;
            yomVar.d = 1;
            objE = this.a.e(batchGetContributionCapabilitiesRequest, yomVar);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = yomVar.a;
            hm5.M(objE);
        }
        BatchGetContributionCapabilitiesResponse batchGetContributionCapabilitiesResponse = (BatchGetContributionCapabilitiesResponse) objE;
        int iN = batchGetContributionCapabilitiesResponse.n();
        h290 h290VarO = batchGetContributionCapabilitiesResponse.o();
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
        int i3 = 0;
        for (Object obj : list3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            if (i3 >= iN) {
                ggaVar = new gga(obj, new m231(ContributionApiError.EmptyResponse.a));
            } else {
                GetContributionCapabilitiesResponse getContributionCapabilitiesResponse = (GetContributionCapabilitiesResponse) h290VarO.get(i3);
                ggaVar = new gga(obj, getContributionCapabilitiesResponse.hasCapabilities() ? h.d(getContributionCapabilitiesResponse.n()) : getContributionCapabilitiesResponse.p() ? new m231(b.a(getContributionCapabilitiesResponse.o())) : new m231(ContributionApiError.EmptyResponse.a));
            }
            arrayList2.add(ggaVar);
            i3 = i4;
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable e(ArrayList arrayList, onm onmVar) {
        zom zomVar;
        gga ggaVar;
        if (onmVar instanceof zom) {
            zomVar = (zom) onmVar;
            int i = zomVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zomVar.d = i - Integer.MIN_VALUE;
            } else {
                zomVar = new zom(this, onmVar);
            }
        } else {
            zomVar = new zom(this, onmVar);
        }
        Object objF = zomVar.b;
        int i2 = zomVar.d;
        if (i2 == 0) {
            hm5.M(objF);
            ega egaVarO = BatchGetContributionSummariesRequest.o();
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bm40 bm40Var = (bm40) it.next();
                am40 am40VarN = GetContributionSummaryRequest.n();
                am40VarN.q(h.h(new lvm(bm40Var.a())));
                Integer numB = bm40Var.b();
                if (numB != null) {
                    am40VarN.n(numB.intValue());
                }
                arrayList2.add(am40VarN.build());
            }
            egaVarO.n(arrayList2);
            BatchGetContributionSummariesRequest batchGetContributionSummariesRequestBuild = egaVarO.build();
            batchGetContributionSummariesRequestBuild.getClass();
            zomVar.a = arrayList;
            zomVar.d = 1;
            objF = this.a.f(batchGetContributionSummariesRequestBuild, zomVar);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = zomVar.a;
            hm5.M(objF);
        }
        BatchGetContributionSummariesResponse batchGetContributionSummariesResponse = (BatchGetContributionSummariesResponse) objF;
        int iN = batchGetContributionSummariesResponse.n();
        h290 h290VarO = batchGetContributionSummariesResponse.o();
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            if (i3 >= iN) {
                ggaVar = new gga(obj, new m231(ContributionApiError.EmptyResponse.a));
            } else {
                GetContributionSummaryResponse getContributionSummaryResponse = (GetContributionSummaryResponse) h290VarO.get(i3);
                ggaVar = new gga(obj, getContributionSummaryResponse.q() ? h.c(getContributionSummaryResponse.o()) : getContributionSummaryResponse.p() ? new m231(b.a(getContributionSummaryResponse.n())) : new m231(ContributionApiError.EmptyResponse.a));
            }
            arrayList3.add(ggaVar);
            i3 = i4;
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable f(List list, onm onmVar) {
        apm apmVar;
        m231 m231Var;
        m231 m231VarA;
        gga ggaVar;
        if (onmVar instanceof apm) {
            apmVar = (apm) onmVar;
            int i = apmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                apmVar.d = i - Integer.MIN_VALUE;
            } else {
                apmVar = new apm(this, onmVar);
            }
        } else {
            apmVar = new apm(this, onmVar);
        }
        Object objG = apmVar.b;
        int i2 = apmVar.d;
        if (i2 == 0) {
            hm5.M(objG);
            lha lhaVarP = BatchUpdateContributionsRequest.p();
            List<kqh1> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (kqh1 kqh1Var : list2) {
                jqh1 jqh1VarN = UpdateContributionRequest.n();
                rum rumVarO = ContributionReference.o();
                rumVarO.n(kqh1Var.a());
                jqh1VarN.n(rumVarO);
                jqh1VarN.q(h.g(kqh1Var.b()));
                arrayList.add(jqh1VarN.build());
            }
            lhaVarP.n(arrayList);
            BatchUpdateContributionsRequest batchUpdateContributionsRequest = (BatchUpdateContributionsRequest) lhaVarP.build();
            batchUpdateContributionsRequest.getClass();
            apmVar.a = list;
            apmVar.d = 1;
            objG = this.a.g(batchUpdateContributionsRequest, apmVar);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = apmVar.a;
            hm5.M(objG);
        }
        BatchUpdateContributionsResponse batchUpdateContributionsResponse = (BatchUpdateContributionsResponse) objG;
        int iN = batchUpdateContributionsResponse.n();
        h290 h290VarO = batchUpdateContributionsResponse.o();
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
        int i3 = 0;
        for (Object obj : list3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            if (i3 >= iN) {
                ggaVar = new gga(obj, new m231(ContributionApiError.EmptyResponse.a));
            } else {
                UpdateContributionResponse updateContributionResponse = (UpdateContributionResponse) h290VarO.get(i3);
                if (updateContributionResponse.p()) {
                    try {
                        m231VarA = h.a(updateContributionResponse.n());
                    } catch (ContributionApiError e) {
                        m231Var = new m231(e);
                        m231VarA = m231Var;
                    }
                    ggaVar = new gga(obj, m231VarA);
                } else {
                    m231Var = updateContributionResponse.q() ? new m231(b.a(updateContributionResponse.o())) : new m231(ContributionApiError.EmptyResponse.a);
                }
                m231VarA = m231Var;
                ggaVar = new gga(obj, m231VarA);
            }
            arrayList2.add(ggaVar);
            i3 = i4;
        }
        return arrayList2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.contribution.repositoryimpl.ContributionApiError$EmptyResponse */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.contribution.repositoryimpl.ContributionApiError$ServerError */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Boolean g(onm onmVar) throws ContributionApiError.ServerError, ContributionApiError.EmptyResponse {
        bpm bpmVar;
        if (onmVar instanceof bpm) {
            bpmVar = (bpm) onmVar;
            int i = bpmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bpmVar.c = i - Integer.MIN_VALUE;
            } else {
                bpmVar = new bpm(this, onmVar);
            }
        } else {
            bpmVar = new bpm(this, onmVar);
        }
        Object obj = bpmVar.a;
        int i2 = bpmVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            GetContributionFeatureControlRequest.n();
            throw null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        GetContributionFeatureControlResponse getContributionFeatureControlResponse = (GetContributionFeatureControlResponse) obj;
        if (getContributionFeatureControlResponse.q()) {
            return yah0.m(getContributionFeatureControlResponse.o().getEnabled());
        }
        if (getContributionFeatureControlResponse.p()) {
            throw b.a(getContributionFeatureControlResponse.n());
        }
        throw ContributionApiError.EmptyResponse.a;
    }
}
