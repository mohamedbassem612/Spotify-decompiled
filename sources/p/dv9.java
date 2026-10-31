package p;

import com.spotify.pam.v2.BenefitListItems;
import com.spotify.pam.v2.ClickableSection;
import com.spotify.pam.v2.DenominationCta;
import com.spotify.pam.v2.DenominationItem;
import com.spotify.pam.v2.DenominationSection;
import com.spotify.pam.v2.DescriptiveSection;
import com.spotify.pam.v2.GetAudiobookConsiderationRequest;
import com.spotify.pam.v2.GetAudiobookConsiderationResponse;
import com.spotify.pam.v2.GetDenominationSelectionRequest;
import com.spotify.pam.v2.GetDenominationSelectionResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dv9 {
    public final enr0 a;
    public final enr0 b;

    public dv9(enr0 enr0Var, enr0 enr0Var2, dma1 dma1Var) {
        this.a = enr0Var;
        this.b = enr0Var2;
    }

    public static dat c(DenominationCta denominationCta) {
        String strP;
        String strN;
        String uri;
        String str = "";
        if (denominationCta == null || (strP = denominationCta.p()) == null) {
            strP = "";
        }
        if (denominationCta == null || (strN = denominationCta.n()) == null) {
            strN = "";
        }
        if (denominationCta != null && (uri = denominationCta.getUri()) != null) {
            str = uri;
        }
        return new dat(strP, strN, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object a(ph1 ph1Var, boolean z, onm onmVar) {
        cv9 cv9Var;
        boolean z2;
        GetAudiobookConsiderationResponse getAudiobookConsiderationResponse;
        ph1 ph1Var2 = ph1Var;
        if (onmVar instanceof cv9) {
            cv9Var = (cv9) onmVar;
            int i = cv9Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cv9Var.e = i - Integer.MIN_VALUE;
            } else {
                cv9Var = new cv9(this, onmVar);
            }
        } else {
            cv9Var = new cv9(this, onmVar);
        }
        Object objL = cv9Var.c;
        int i2 = cv9Var.e;
        if (i2 == 0) {
            hm5.M(objL);
            Integer numC0 = nhc1.c0(ph1Var2.a);
            th7 th7VarA = th7.a(numC0 != null ? numC0.intValue() : 0);
            enr0.a.getClass();
            d9n d9nVar = d9n.a;
            if (z) {
                yk40 yk40VarN = GetAudiobookConsiderationRequest.n();
                yk40VarN.q();
                yk40VarN.n(th7VarA);
                GetAudiobookConsiderationRequest getAudiobookConsiderationRequest = (GetAudiobookConsiderationRequest) yk40VarN.build();
                cv9Var.a = ph1Var2;
                cv9Var.b = z;
                cv9Var.e = 1;
                objL = this.b.l(getAudiobookConsiderationRequest, cv9Var);
                if (objL != d9nVar) {
                    z2 = z;
                    getAudiobookConsiderationResponse = (GetAudiobookConsiderationResponse) objL;
                }
            } else {
                yk40 yk40VarN2 = GetAudiobookConsiderationRequest.n();
                yk40VarN2.q();
                yk40VarN2.n(th7VarA);
                GetAudiobookConsiderationRequest getAudiobookConsiderationRequest2 = (GetAudiobookConsiderationRequest) yk40VarN2.build();
                cv9Var.a = ph1Var2;
                cv9Var.b = z;
                cv9Var.e = 2;
                objL = this.a.l(getAudiobookConsiderationRequest2, cv9Var);
                if (objL != d9nVar) {
                    z2 = z;
                    getAudiobookConsiderationResponse = (GetAudiobookConsiderationResponse) objL;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            z2 = cv9Var.b;
            ph1Var2 = cv9Var.a;
            hm5.M(objL);
            getAudiobookConsiderationResponse = (GetAudiobookConsiderationResponse) objL;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = cv9Var.b;
            ph1Var2 = cv9Var.a;
            hm5.M(objL);
            getAudiobookConsiderationResponse = (GetAudiobookConsiderationResponse) objL;
        }
        boolean z3 = z2;
        ph1 ph1Var3 = ph1Var2;
        pw50 pw50Var = new pw50(getAudiobookConsiderationResponse.q().getTitle(), getAudiobookConsiderationResponse.q().q(), getAudiobookConsiderationResponse.q().getSubtitle(), getAudiobookConsiderationResponse.q().getDescription(), getAudiobookConsiderationResponse.q().n(), new a10(getAudiobookConsiderationResponse.q().p().getTitle(), getAudiobookConsiderationResponse.q().p().getUri()));
        String title = getAudiobookConsiderationResponse.n().getTitle();
        h290<BenefitListItems> h290VarN = getAudiobookConsiderationResponse.n().n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (BenefitListItems benefitListItems : h290VarN) {
            arrayList.add(new ija(benefitListItems.n(), benefitListItems.o(), benefitListItems.p(), benefitListItems.getSubtitle()));
        }
        return new o88(pw50Var, new jka(title, arrayList), new kr00(getAudiobookConsiderationResponse.p().getTitle(), getAudiobookConsiderationResponse.p().o()), getAudiobookConsiderationResponse.o(), ph1Var3, z3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object b(String str, String str2, onm onmVar, boolean z) {
        kv9 kv9Var;
        boolean z2;
        GetDenominationSelectionResponse getDenominationSelectionResponse;
        sat ratVar;
        int i;
        if (onmVar instanceof kv9) {
            kv9Var = (kv9) onmVar;
            int i2 = kv9Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kv9Var.d = i2 - Integer.MIN_VALUE;
            } else {
                kv9Var = new kv9(this, onmVar);
            }
        } else {
            kv9Var = new kv9(this, onmVar);
        }
        Object objE = kv9Var.b;
        int i3 = kv9Var.d;
        if (i3 == 0) {
            hm5.M(objE);
            vm40 vm40VarN = GetDenominationSelectionRequest.n();
            vm40VarN.n(str);
            vm40VarN.q(str2);
            GetDenominationSelectionRequest getDenominationSelectionRequest = (GetDenominationSelectionRequest) vm40VarN.build();
            d9n d9nVar = d9n.a;
            if (z) {
                getDenominationSelectionRequest.getClass();
                kv9Var.a = z;
                kv9Var.d = 1;
                objE = this.b.e(getDenominationSelectionRequest, kv9Var);
                if (objE != d9nVar) {
                    z2 = z;
                    getDenominationSelectionResponse = (GetDenominationSelectionResponse) objE;
                }
            } else {
                getDenominationSelectionRequest.getClass();
                kv9Var.a = z;
                kv9Var.d = 2;
                objE = this.a.e(getDenominationSelectionRequest, kv9Var);
                if (objE != d9nVar) {
                    z2 = z;
                    getDenominationSelectionResponse = (GetDenominationSelectionResponse) objE;
                }
            }
            return d9nVar;
        }
        if (i3 == 1) {
            z2 = kv9Var.a;
            hm5.M(objE);
            getDenominationSelectionResponse = (GetDenominationSelectionResponse) objE;
        } else {
            if (i3 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = kv9Var.a;
            hm5.M(objE);
            getDenominationSelectionResponse = (GetDenominationSelectionResponse) objE;
        }
        boolean z3 = z2;
        if (getDenominationSelectionResponse.n() != 1) {
            return new kat((String) null, (String) null, (ArrayList) null, (ArrayList) null, (dat) null, (dat) null, false, 255);
        }
        String title = getDenominationSelectionResponse.o().getTitle();
        String description = getDenominationSelectionResponse.o().getDescription();
        List<DenominationItem> itemsList = getDenominationSelectionResponse.o().getItemsList();
        ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
        for (DenominationItem denominationItem : itemsList) {
            String strO = denominationItem.o();
            String strN = denominationItem.n();
            if (strN == null) {
                strN = "";
            }
            String str3 = strN;
            String strP = denominationItem.p();
            int i4 = jv9.a[denominationItem.r().ordinal()];
            if (i4 == 1 || i4 == 2) {
                i = 1;
            } else if (i4 == 3) {
                i = 2;
            } else {
                if (i4 != 4) {
                    eg.o();
                    return null;
                }
                i = 3;
            }
            arrayList.add(new jat(i, 0, strO, str3, strP, denominationItem.q().getUri(), false));
        }
        h290<DenominationSection> h290VarQ = getDenominationSelectionResponse.o().q();
        ArrayList arrayList2 = new ArrayList();
        for (DenominationSection denominationSection : h290VarQ) {
            int iP = denominationSection.p();
            int i5 = iP == 0 ? -1 : jv9.b[l1d.C(iP)];
            if (i5 == -1) {
                ratVar = null;
            } else if (i5 == 1) {
                DescriptiveSection descriptiveSectionO = denominationSection.o();
                ratVar = new rat(descriptiveSectionO.getTitle(), descriptiveSectionO.getDescription());
            } else if (i5 != 2) {
                if (i5 != 3) {
                    eg.o();
                    return null;
                }
                ratVar = null;
            } else {
                ClickableSection clickableSectionN = denominationSection.n();
                ratVar = new qat(clickableSectionN.getTitle(), clickableSectionN.getDescription(), clickableSectionN.getUri());
            }
            if (ratVar != null) {
                arrayList2.add(ratVar);
            }
        }
        return new kat(title, description, arrayList, arrayList2, c(getDenominationSelectionResponse.o().o()), c(getDenominationSelectionResponse.o().p()), z3, 128);
    }

    public dv9(enr0 enr0Var, enr0 enr0Var2) {
        this.a = enr0Var;
        this.b = enr0Var2;
    }
}
