package com.spotify.contribution.repositoryimpl;

import com.google.protobuf.Timestamp;
import com.spotify.campfire.contribution.proto.v1.CapabilitiesTarget;
import com.spotify.campfire.contribution.proto.v1.ChildSummaries;
import com.spotify.campfire.contribution.proto.v1.CommentPayload;
import com.spotify.campfire.contribution.proto.v1.ContextualTarget;
import com.spotify.campfire.contribution.proto.v1.Contribution;
import com.spotify.campfire.contribution.proto.v1.ContributionCapabilities;
import com.spotify.campfire.contribution.proto.v1.ContributionFilters;
import com.spotify.campfire.contribution.proto.v1.ContributionKindCapabilities;
import com.spotify.campfire.contribution.proto.v1.ContributionPayload;
import com.spotify.campfire.contribution.proto.v1.ContributionReference;
import com.spotify.campfire.contribution.proto.v1.ContributionTarget;
import com.spotify.campfire.contribution.proto.v1.EntityTarget;
import com.spotify.campfire.contribution.proto.v1.ListeningActivityTarget;
import com.spotify.campfire.contribution.proto.v1.NotePayload;
import com.spotify.campfire.contribution.proto.v1.ReactionCount;
import com.spotify.campfire.contribution.proto.v1.ReactionPayload;
import com.spotify.campfire.contribution.proto.v1.TimeFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.chh;
import p.cvm;
import p.dvm;
import p.eg;
import p.ghd0;
import p.h290;
import p.hyz0;
import p.ihc1;
import p.ivm;
import p.jnm;
import p.jvm;
import p.khy0;
import p.kpm;
import p.kqm;
import p.kum;
import p.kvm;
import p.l1d;
import p.lld;
import p.lqm;
import p.lum;
import p.lvm;
import p.m231;
import p.mld;
import p.mum;
import p.mvm;
import p.npm;
import p.nqm;
import p.num;
import p.nvm;
import p.ovm;
import p.oxz0;
import p.ple1;
import p.pum;
import p.pvm;
import p.q7h;
import p.qle1;
import p.rum;
import p.som;
import p.sve1;
import p.u890;
import p.ufh;
import p.uxy;
import p.vho0;
import p.zgo1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class h {
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.contribution.repositoryimpl.ContributionApiError */
    public static final som a(Contribution contribution) throws ContributionApiError {
        nvm lvmVar;
        zgo1 mumVar;
        cvm cvmVar;
        final String contributionUri = contribution.o().getContributionUri();
        contributionUri.getClass();
        if (ihc1.y0(contributionUri)) {
            throw new ContributionApiError(contributionUri) { // from class: com.spotify.contribution.repositoryimpl.ContributionApiError$InvalidUri
                public final String a;
                public final String b;

                {
                    super(0);
                    this.a = "contribution_uri";
                    this.b = contributionUri;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ContributionApiError$InvalidUri)) {
                        return false;
                    }
                    ContributionApiError$InvalidUri contributionApiError$InvalidUri = (ContributionApiError$InvalidUri) obj;
                    return u890.j(this.a, contributionApiError$InvalidUri.a) && u890.j(this.b, contributionApiError$InvalidUri.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }
            };
        }
        ContributionTarget contributionTargetT = contribution.t();
        int iS = contributionTargetT.s();
        int i = iS == 0 ? -1 : khy0.a[l1d.C(iS)];
        if (i != -1) {
            if (i == 1) {
                lvmVar = new lvm(contributionTargetT.q().getEntityUri());
            } else if (i == 2) {
                lvmVar = new jvm(contributionTargetT.n().n(), contributionTargetT.n().r() ? contributionTargetT.n().q() : null, contributionTargetT.n().hasItemId() ? contributionTargetT.n().p() : null);
            } else if (i == 3) {
                lvmVar = new kvm(contributionTargetT.o().getContributionUri());
            } else if (i == 4) {
                lvmVar = new mvm(contributionTargetT.r().p(), contributionTargetT.r().r(), contributionTargetT.r().s() ? contributionTargetT.r().n() : null, contributionTargetT.r().hasTimestamp() ? Long.valueOf(contributionTargetT.r().q().q()) : null);
            } else if (i != 5) {
                eg.o();
                return null;
            }
            ContributionPayload contributionPayloadR = contribution.r();
            int iQ = contributionPayloadR.q();
            int i2 = iQ == 0 ? -1 : khy0.b[l1d.C(iQ)];
            if (i2 != -1) {
                if (i2 == 1) {
                    mumVar = new mum(contributionPayloadR.p().o());
                } else if (i2 == 2) {
                    mumVar = new lum(contributionPayloadR.n().o());
                } else if (i2 == 3) {
                    mumVar = new num(contributionPayloadR.r().o());
                } else if (i2 != 4) {
                    eg.o();
                    return null;
                }
                zgo1 zgo1Var = mumVar;
                String strP = contribution.p();
                if (ihc1.y0(strP)) {
                    strP = null;
                }
                Long lValueOf = contribution.hasCreatedAt() ? Long.valueOf((contribution.getCreatedAt().q() * 1000) + ((long) (contribution.getCreatedAt().p() / 1000000))) : null;
                Long lValueOf2 = contribution.hasModifiedAt() ? Long.valueOf((contribution.getModifiedAt().q() * 1000) + ((long) (contribution.getModifiedAt().p() / 1000000))) : null;
                int iOrdinal = contribution.s().ordinal();
                if (iOrdinal == 0) {
                    cvmVar = cvm.c;
                } else if (iOrdinal == 1) {
                    cvmVar = cvm.a;
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    cvmVar = cvm.c;
                } else {
                    cvmVar = cvm.b;
                }
                return new som(contributionUri, lvmVar, zgo1Var, strP, lValueOf, lValueOf2, cvmVar, contribution.u() ? c(contribution.n()) : null);
            }
            throw new ContributionApiError() { // from class: com.spotify.contribution.repositoryimpl.ContributionApiError$MissingPayload
                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof ContributionApiError$MissingPayload);
                }

                public final int hashCode() {
                    return -404813455;
                }

                public final String toString() {
                    return "MissingPayload";
                }
            };
        }
        throw new ContributionApiError() { // from class: com.spotify.contribution.repositoryimpl.ContributionApiError$MissingTarget
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ContributionApiError$MissingTarget);
            }

            public final int hashCode() {
                return 932528462;
            }

            public final String toString() {
                return "MissingTarget";
            }
        };
    }

    public static final kpm b(ContributionCapabilities contributionCapabilities) {
        return new kpm(contributionCapabilities.u() ? contributionCapabilities.o() : false, contributionCapabilities.v() ? contributionCapabilities.p() : false, contributionCapabilities.w() ? contributionCapabilities.q() : false, contributionCapabilities.x() ? contributionCapabilities.r() : false, contributionCapabilities.t() ? contributionCapabilities.n() : false);
    }

    public static final npm c(ChildSummaries childSummaries) {
        ufh ufhVar;
        som m231Var;
        som m231Var2;
        som m231Var3;
        oxz0 oxz0Var = null;
        if (childSummaries.q() && childSummaries.n().p()) {
            int iN = childSummaries.n().o().n();
            h290<Contribution> h290VarP = childSummaries.n().o().p();
            ArrayList arrayList = new ArrayList();
            for (Contribution contribution : h290VarP) {
                try {
                    contribution.getClass();
                    m231Var3 = a(contribution);
                } catch (Throwable th) {
                    m231Var3 = new m231(th);
                }
                if (m231Var3 instanceof m231) {
                    m231Var3 = null;
                }
                som somVar = m231Var3;
                if (somVar != null) {
                    arrayList.add(somVar);
                }
            }
            ufhVar = new ufh(iN, arrayList);
        } else {
            ufhVar = null;
        }
        if (childSummaries.r() && childSummaries.p().r()) {
            int iN2 = childSummaries.p().p().n();
            h290<ReactionCount> h290VarO = childSummaries.p().o();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
            for (ReactionCount reactionCount : h290VarO) {
                arrayList2.add(new pum(reactionCount.o(), reactionCount.n()));
            }
            h290<Contribution> h290VarQ = childSummaries.p().q();
            ArrayList arrayList3 = new ArrayList();
            for (Contribution contribution2 : h290VarQ) {
                try {
                    contribution2.getClass();
                    m231Var2 = a(contribution2);
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                if (m231Var2 instanceof m231) {
                    m231Var2 = null;
                }
                som somVar2 = m231Var2;
                if (somVar2 != null) {
                    arrayList3.add(somVar2);
                }
            }
            h290<Contribution> h290VarP2 = childSummaries.p().p().p();
            ArrayList arrayList4 = new ArrayList();
            for (Contribution contribution3 : h290VarP2) {
                try {
                    contribution3.getClass();
                    m231Var = a(contribution3);
                } catch (Throwable th3) {
                    m231Var = new m231(th3);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                som somVar3 = m231Var;
                if (somVar3 != null) {
                    arrayList4.add(somVar3);
                }
            }
            oxz0Var = new oxz0(iN2, arrayList2, arrayList3, arrayList4);
        }
        return new npm(ufhVar, oxz0Var);
    }

    public static final nqm d(ContributionKindCapabilities contributionKindCapabilities) {
        return new nqm(contributionKindCapabilities.s() ? b(contributionKindCapabilities.p()) : null, contributionKindCapabilities.t() ? b(contributionKindCapabilities.q()) : null, contributionKindCapabilities.r() ? b(contributionKindCapabilities.n()) : null);
    }

    public static final CapabilitiesTarget e(mld mldVar) {
        lld lldVarN = CapabilitiesTarget.n();
        uxy uxyVarO = EntityTarget.o();
        uxyVarO.n(mldVar.a);
        lldVarN.n(uxyVarO);
        return (CapabilitiesTarget) lldVarN.build();
    }

    public static final ContributionFilters f(lqm lqmVar) {
        pvm pvmVar;
        qle1 qle1Var = lqmVar.c;
        List list = lqmVar.b;
        List list2 = lqmVar.a;
        if (list2.isEmpty() && list.isEmpty() && qle1Var == null) {
            return null;
        }
        kqm kqmVarP = ContributionFilters.p();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((ovm) it.next()).ordinal();
            if (iOrdinal == 0) {
                pvmVar = pvm.CONTRIBUTION_TYPE_NOTE;
            } else if (iOrdinal == 1) {
                pvmVar = pvm.CONTRIBUTION_TYPE_COMMENT;
            } else if (iOrdinal == 2) {
                pvmVar = pvm.CONTRIBUTION_TYPE_REACTION;
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
                pvmVar = pvm.CONTRIBUTION_TYPE_UNSPECIFIED;
            }
            kqmVarP.q(pvmVar);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            kqmVarP.n(i((cvm) it2.next()));
        }
        if (qle1Var != null) {
            ple1 ple1VarN = TimeFilter.n();
            long jLongValue = qle1Var.a.longValue();
            sve1 sve1VarR = Timestamp.r();
            sve1VarR.q(jLongValue);
            ple1VarN.q(sve1VarR);
            long jLongValue2 = qle1Var.b.longValue();
            sve1 sve1VarR2 = Timestamp.r();
            sve1VarR2.q(jLongValue2);
            ple1VarN.n(sve1VarR2);
            kqmVarP.r(ple1VarN);
        }
        return (ContributionFilters) kqmVarP.build();
    }

    public static final ContributionPayload g(zgo1 zgo1Var) {
        if (zgo1Var instanceof mum) {
            kum kumVarS = ContributionPayload.s();
            vho0 vho0VarP = NotePayload.p();
            vho0VarP.n(((mum) zgo1Var).c);
            kumVarS.q(vho0VarP);
            return (ContributionPayload) kumVarS.build();
        }
        if (zgo1Var instanceof lum) {
            kum kumVarS2 = ContributionPayload.s();
            chh chhVarP = CommentPayload.p();
            chhVarP.n(((lum) zgo1Var).c);
            kumVarS2.n(chhVarP);
            return (ContributionPayload) kumVarS2.build();
        }
        if (!(zgo1Var instanceof num)) {
            eg.o();
            return null;
        }
        kum kumVarS3 = ContributionPayload.s();
        hyz0 hyz0VarP = ReactionPayload.p();
        hyz0VarP.n(((num) zgo1Var).c);
        kumVarS3.r(hyz0VarP);
        return (ContributionPayload) kumVarS3.build();
    }

    public static final ContributionTarget h(nvm nvmVar) {
        if (nvmVar instanceof lvm) {
            ivm ivmVarT = ContributionTarget.t();
            uxy uxyVarO = EntityTarget.o();
            uxyVarO.n(((lvm) nvmVar).a);
            ivmVarT.r(uxyVarO);
            return (ContributionTarget) ivmVarT.build();
        }
        if (nvmVar instanceof jvm) {
            jnm jnmVarS = ContextualTarget.s();
            jvm jvmVar = (jvm) nvmVar;
            jnmVarS.n(jvmVar.a);
            String str = jvmVar.b;
            if (str != null) {
                jnmVarS.r(str);
            }
            String str2 = jvmVar.c;
            if (str2 != null) {
                jnmVarS.q(str2);
            }
            ivm ivmVarT2 = ContributionTarget.t();
            ivmVarT2.n(jnmVarS);
            com.google.protobuf.h hVarBuild = ivmVarT2.build();
            hVarBuild.getClass();
            return (ContributionTarget) hVarBuild;
        }
        if (nvmVar instanceof kvm) {
            ivm ivmVarT3 = ContributionTarget.t();
            rum rumVarO = ContributionReference.o();
            rumVarO.n(((kvm) nvmVar).a);
            ivmVarT3.q(rumVarO);
            return (ContributionTarget) ivmVarT3.build();
        }
        if (!(nvmVar instanceof mvm)) {
            eg.o();
            return null;
        }
        ghd0 ghd0VarT = ListeningActivityTarget.t();
        mvm mvmVar = (mvm) nvmVar;
        ghd0VarT.q(mvmVar.a);
        ghd0VarT.s(mvmVar.b);
        String str3 = mvmVar.c;
        if (str3 != null) {
            ghd0VarT.n(str3);
        }
        Long l = mvmVar.d;
        if (l != null) {
            long jLongValue = l.longValue();
            sve1 sve1VarR = Timestamp.r();
            sve1VarR.q(jLongValue);
            ghd0VarT.r(sve1VarR);
        }
        ivm ivmVarT4 = ContributionTarget.t();
        ivmVarT4.s(ghd0VarT);
        com.google.protobuf.h hVarBuild2 = ivmVarT4.build();
        hVarBuild2.getClass();
        return (ContributionTarget) hVarBuild2;
    }

    public static final dvm i(cvm cvmVar) {
        int iOrdinal = cvmVar.ordinal();
        if (iOrdinal == 0) {
            return dvm.CONTRIBUTION_SOURCE_USER;
        }
        if (iOrdinal == 1) {
            return dvm.CONTRIBUTION_SOURCE_EDITORIAL;
        }
        if (iOrdinal == 2) {
            return dvm.CONTRIBUTION_SOURCE_UNSPECIFIED;
        }
        eg.o();
        return null;
    }
}
