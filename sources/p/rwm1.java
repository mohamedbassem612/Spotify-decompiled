package p;

import com.spotify.yourupdates.badgingstate.models.BadgingState;
import j$.util.Base64;
import spotify.your_library.esperanto.proto.TransferProgressResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rwm1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ rwm1(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x015a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        qwm1 qwm1Var;
        swm1 swm1Var;
        twm1 twm1Var;
        uwm1 uwm1Var;
        s1n1 s1n1Var;
        fi81 fi81Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof qwm1) {
                    qwm1Var = (qwm1) lnmVar;
                    int i = qwm1Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        qwm1Var.b = i - Integer.MIN_VALUE;
                    } else {
                        qwm1Var = new qwm1(this, lnmVar);
                    }
                } else {
                    qwm1Var = new qwm1(this, lnmVar);
                }
                Object obj2 = qwm1Var.a;
                int i2 = qwm1Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    byte[] bArr = (byte[]) obj;
                    try {
                        YourLibraryResponse yourLibraryResponseS = YourLibraryResponse.s(bArr);
                        qwm1Var.b = 1;
                        return vr20Var.emit(yourLibraryResponseS, qwm1Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.esperanto.proto.YourLibraryResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                if (lnmVar instanceof swm1) {
                    swm1Var = (swm1) lnmVar;
                    int i3 = swm1Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        swm1Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        swm1Var = new swm1(this, lnmVar);
                    }
                } else {
                    swm1Var = new swm1(this, lnmVar);
                }
                Object obj3 = swm1Var.a;
                int i4 = swm1Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        YourLibraryContainsResponse yourLibraryContainsResponseQ = YourLibraryContainsResponse.q(bArr2);
                        swm1Var.b = 1;
                        return vr20Var.emit(yourLibraryContainsResponseQ, swm1Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e2) {
                        bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.esperanto.proto.YourLibraryContainsResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 2:
                if (lnmVar instanceof twm1) {
                    twm1Var = (twm1) lnmVar;
                    int i5 = twm1Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        twm1Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        twm1Var = new twm1(this, lnmVar);
                    }
                } else {
                    twm1Var = new twm1(this, lnmVar);
                }
                Object obj4 = twm1Var.a;
                int i6 = twm1Var.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    byte[] bArr3 = (byte[]) obj;
                    try {
                        YourLibraryDecorateResponse yourLibraryDecorateResponseQ = YourLibraryDecorateResponse.q(bArr3);
                        twm1Var.b = 1;
                        return vr20Var.emit(yourLibraryDecorateResponseQ, twm1Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e3) {
                        bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.esperanto.proto.YourLibraryDecorateResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                    }
                } else {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 3:
                if (lnmVar instanceof uwm1) {
                    uwm1Var = (uwm1) lnmVar;
                    int i7 = uwm1Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        uwm1Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        uwm1Var = new uwm1(this, lnmVar);
                    }
                } else {
                    uwm1Var = new uwm1(this, lnmVar);
                }
                Object obj5 = uwm1Var.a;
                int i8 = uwm1Var.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    byte[] bArr4 = (byte[]) obj;
                    try {
                        TransferProgressResponse transferProgressResponseP = TransferProgressResponse.p(bArr4);
                        uwm1Var.b = 1;
                        return vr20Var.emit(transferProgressResponseP, uwm1Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e4) {
                        bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.esperanto.proto.TransferProgressResponse: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e4);
                    }
                } else {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                if (lnmVar instanceof s1n1) {
                    s1n1Var = (s1n1) lnmVar;
                    int i9 = s1n1Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        s1n1Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        s1n1Var = new s1n1(this, lnmVar);
                    }
                } else {
                    s1n1Var = new s1n1(this, lnmVar);
                }
                Object obj6 = s1n1Var.a;
                int i10 = s1n1Var.b;
                if (i10 == 0) {
                    hm5.M(obj6);
                    int i11 = r1n1.a[((BadgingState) obj).ordinal()];
                    if (i11 == 1) {
                        fi81Var = fi81.a;
                    } else if (i11 == 2) {
                        fi81Var = fi81.b;
                    } else {
                        eg.o();
                    }
                    s1n1Var.b = 1;
                    return vr20Var.emit(fi81Var, s1n1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
