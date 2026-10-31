package p;

import com.spotify.kidsview.v2.proto.AccountControls;
import com.spotify.kidsview.v2.proto.AddOn;
import com.spotify.kidsview.v2.proto.DateOfBirth;
import com.spotify.kidsview.v2.proto.GetManagedAccountDetailsViewResponse;
import com.spotify.kidsview.v2.proto.ManagedAccountIdentifier;
import com.spotify.kidsview.v2.proto.SetManagedAccountSettingsRequest;
import com.spotify.kidsview.v2.proto.SetManagedAccountSettingsResponse;
import com.spotify.kidsview.v2.proto.VideoControls;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n2b0 {
    public final p2b0 a;

    public n2b0(p2b0 p2b0Var) {
        this.a = p2b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, ibg0 ibg0Var, onm onmVar) {
        l2b0 l2b0Var;
        String childId;
        f6r f6rVar;
        int i;
        if (onmVar instanceof l2b0) {
            l2b0Var = (l2b0) onmVar;
            int i2 = l2b0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l2b0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                l2b0Var = new l2b0(this, onmVar);
            }
        } else {
            l2b0Var = new l2b0(this, onmVar);
        }
        Object objA = l2b0Var.a;
        int i3 = l2b0Var.c;
        int i4 = 1;
        if (i3 == 0) {
            hm5.M(objA);
            String str2 = ibg0Var.a;
            l2b0Var.c = 1;
            objA = this.a.a(str, str2, l2b0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        GetManagedAccountDetailsViewResponse getManagedAccountDetailsViewResponse = (GetManagedAccountDetailsViewResponse) objA;
        int iX5 = yon1.x5(getManagedAccountDetailsViewResponse.getAccountType());
        ManagedAccountIdentifier managedAccountIdentifierN = getManagedAccountDetailsViewResponse.n();
        int iO = managedAccountIdentifierN.o();
        int i5 = iO == 0 ? -1 : gdg0.a[l1d.C(iO)];
        if (i5 == 1) {
            childId = managedAccountIdentifierN.getChildId();
        } else {
            if (i5 != 2) {
                eg.m("ManagedAccountIdentifier must have either child_id or teen_id set");
                return null;
            }
            childId = managedAccountIdentifierN.p();
        }
        String str3 = childId;
        cww0 cww0VarC5 = yon1.C5(getManagedAccountDetailsViewResponse.getProfile());
        if (getManagedAccountDetailsViewResponse.hasDateOfBirth()) {
            DateOfBirth dateOfBirthQ = getManagedAccountDetailsViewResponse.q();
            f6rVar = new f6r(dateOfBirthQ.n(), dateOfBirthQ.p());
        } else {
            f6rVar = null;
        }
        boolean zV = getManagedAccountDetailsViewResponse.v();
        j7g0 j7g0Var = getManagedAccountDetailsViewResponse.x() ? new j7g0(getManagedAccountDetailsViewResponse.r().getHasAudiobooksAvailable()) : null;
        boolean zU = getManagedAccountDetailsViewResponse.u();
        tk tkVarV = getManagedAccountDetailsViewResponse.t() ? zpn1.v(getManagedAccountDetailsViewResponse.o()) : null;
        i9t0 i9t0VarB5 = getManagedAccountDetailsViewResponse.hasPlanMembership() ? yon1.B5(getManagedAccountDetailsViewResponse.getPlanMembership()) : null;
        l6t l6tVarY5 = getManagedAccountDetailsViewResponse.hasDeleteAction() ? yon1.y5(getManagedAccountDetailsViewResponse.getDeleteAction()) : null;
        if (getManagedAccountDetailsViewResponse.y()) {
            int iOrdinal = getManagedAccountDetailsViewResponse.s().o().ordinal();
            if (iOrdinal == 0) {
                i4 = 0;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    i4 = 0;
                } else {
                    i4 = 2;
                }
            }
            i = i4;
        } else {
            i = 0;
        }
        e850 e850Var = getManagedAccountDetailsViewResponse.hasGraduationBanner() ? new e850(getManagedAccountDetailsViewResponse.getGraduationBanner().getMinGraduationAge()) : null;
        int pendingRequestCount = getManagedAccountDetailsViewResponse.getPendingRequestCount();
        h290 h290VarP = getManagedAccountDetailsViewResponse.p();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
        Iterator it = h290VarP.iterator();
        while (it.hasNext()) {
            arrayList.add(((AddOn) it.next()).getDisplayName());
        }
        return new jbg0(iX5, str3, cww0VarC5, f6rVar, zV, j7g0Var, zU, tkVarV, i9t0VarB5, l6tVarY5, i, e850Var, pendingRequestCount, arrayList, getManagedAccountDetailsViewResponse.w());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, ibg0 ibg0Var, tk tkVar, onm onmVar) {
        m2b0 m2b0Var;
        ManagedAccountIdentifier managedAccountIdentifier;
        if (onmVar instanceof m2b0) {
            m2b0Var = (m2b0) onmVar;
            int i = m2b0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m2b0Var.c = i - Integer.MIN_VALUE;
            } else {
                m2b0Var = new m2b0(this, onmVar);
            }
        } else {
            m2b0Var = new m2b0(this, onmVar);
        }
        Object objC = m2b0Var.a;
        int i2 = m2b0Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            int iOrdinal = ibg0Var.ordinal();
            if (iOrdinal == 0) {
                ldg0 ldg0VarQ = ManagedAccountIdentifier.q();
                ldg0VarQ.n(str);
                managedAccountIdentifier = (ManagedAccountIdentifier) ldg0VarQ.build();
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                ldg0 ldg0VarQ2 = ManagedAccountIdentifier.q();
                ldg0VarQ2.q(str);
                managedAccountIdentifier = (ManagedAccountIdentifier) ldg0VarQ2.build();
            }
            sk61 sk61VarN = SetManagedAccountSettingsRequest.n();
            sk61VarN.n(managedAccountIdentifier);
            sk skVarA = AccountControls.A();
            Boolean bool = tkVar.a;
            if (bool != null) {
                skVarA.q(bool.booleanValue());
            }
            Boolean bool2 = tkVar.b;
            if (bool2 != null) {
                skVarA.u(bool2.booleanValue());
            }
            gjj1 gjj1Var = tkVar.c;
            if (gjj1Var != null) {
                fjj1 fjj1VarU = VideoControls.u();
                Boolean bool3 = gjj1Var.a;
                if (bool3 != null) {
                    fjj1VarU.q(bool3.booleanValue());
                }
                Boolean bool4 = gjj1Var.b;
                if (bool4 != null) {
                    fjj1VarU.n(bool4.booleanValue());
                }
                Boolean bool5 = gjj1Var.c;
                if (bool5 != null) {
                    fjj1VarU.r(bool5.booleanValue());
                }
                skVarA.v(fjj1VarU.build());
            }
            Boolean bool6 = tkVar.d;
            if (bool6 != null) {
                skVarA.t(bool6.booleanValue());
            }
            Boolean bool7 = tkVar.e;
            if (bool7 != null) {
                skVarA.n(bool7.booleanValue());
            }
            Boolean bool8 = tkVar.f;
            if (bool8 != null) {
                skVarA.s(bool8.booleanValue());
            }
            Boolean bool9 = tkVar.g;
            if (bool9 != null) {
                skVarA.r(bool9.booleanValue());
            }
            sk61VarN.q((AccountControls) skVarA.build());
            SetManagedAccountSettingsRequest setManagedAccountSettingsRequest = (SetManagedAccountSettingsRequest) sk61VarN.build();
            String str2 = ibg0Var.a;
            setManagedAccountSettingsRequest.getClass();
            m2b0Var.c = 1;
            objC = this.a.c(str, str2, setManagedAccountSettingsRequest, m2b0Var);
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
        return zpn1.v(((SetManagedAccountSettingsResponse) objC).n());
    }
}
