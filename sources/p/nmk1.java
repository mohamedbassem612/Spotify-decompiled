package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.idj.v1.GetPermissionRequest;
import com.spotify.idj.v1.GetPermissionResponse;
import com.spotify.idj.v1.MicPermissionPageRequest;
import com.spotify.idj.v1.MicPermissionPageResponse;
import com.spotify.idj.v1.SetPermissionRequest;
import com.spotify.idj.v1.SetPermissionResponse;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nmk1 {
    public final jmk1 a;

    public nmk1(jmk1 jmk1Var) {
        this.a = jmk1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(gms0 gms0Var, brj0 brj0Var, onm onmVar) throws Exception {
        kmk1 kmk1Var;
        jrj0 jrj0Var;
        ckl cklVar;
        if (onmVar instanceof kmk1) {
            kmk1Var = (kmk1) onmVar;
            int i = kmk1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kmk1Var.c = i - Integer.MIN_VALUE;
            } else {
                kmk1Var = new kmk1(this, onmVar);
            }
        } else {
            kmk1Var = new kmk1(this, onmVar);
        }
        Object objB = kmk1Var.a;
        int i2 = kmk1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                jmk1 jmk1Var = this.a;
                frj0 frj0VarN = MicPermissionPageRequest.n();
                frj0VarN.r();
                int iOrdinal = gms0Var.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("GRANTED permission state should not be passed to toMicPermissionState()");
                }
                if (iOrdinal == 1) {
                    jrj0Var = jrj0.PERMISSION_NEVER_SEEN;
                } else if (iOrdinal == 2) {
                    jrj0Var = jrj0.PERMISSION_TEMPORARILY_DENIED;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jrj0Var = jrj0.PERMISSION_PERMANENTLY_DENIED;
                }
                frj0VarN.q(jrj0Var);
                int iOrdinal2 = brj0Var.ordinal();
                if (iOrdinal2 == 0) {
                    cklVar = ckl.CONSUMER_UNSPECIFIED;
                } else if (iOrdinal2 == 1) {
                    cklVar = ckl.CONSUMER_DJ;
                } else if (iOrdinal2 == 2) {
                    cklVar = ckl.CONSUMER_AGENT;
                } else {
                    if (iOrdinal2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cklVar = ckl.CONSUMER_AUDIO_RECOGNITION;
                }
                frj0VarN.n(cklVar);
                MicPermissionPageRequest micPermissionPageRequest = (MicPermissionPageRequest) frj0VarN.build();
                kmk1Var.c = 1;
                objB = jmk1Var.b(micPermissionPageRequest, kmk1Var);
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
            return (MicPermissionPageResponse) objB;
        } catch (Exception e) {
            Logger.d("Failed to get mic permission page from idj-state-manager", new Object[]{e});
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(onm onmVar) {
        lmk1 lmk1Var;
        if (onmVar instanceof lmk1) {
            lmk1Var = (lmk1) onmVar;
            int i = lmk1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lmk1Var.c = i - Integer.MIN_VALUE;
            } else {
                lmk1Var = new lmk1(this, onmVar);
            }
        } else {
            lmk1Var = new lmk1(this, onmVar);
        }
        Object objA = lmk1Var.a;
        int i2 = lmk1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                qo40 qo40VarN = GetPermissionRequest.n();
                qo40VarN.n();
                GetPermissionRequest getPermissionRequestBuild = qo40VarN.build();
                jmk1 jmk1Var = this.a;
                getPermissionRequestBuild.getClass();
                lmk1Var.c = 1;
                objA = jmk1Var.a(getPermissionRequestBuild, lmk1Var);
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
            GetPermissionResponse getPermissionResponse = (GetPermissionResponse) objA;
            if (getPermissionResponse.o() == zls0.SUCCESS) {
                return Boolean.valueOf(getPermissionResponse.n());
            }
            Logger.d("Failed to get voice data permission from idj-state-manager: " + getPermissionResponse.o(), new Object[0]);
            return new m231(new Exception("Failed to get voice data permission: " + getPermissionResponse.o()));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d("Failed to get voice data permission from idj-state-manager", new Object[]{e2});
            return new m231(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(boolean z, onm onmVar) {
        mmk1 mmk1Var;
        if (onmVar instanceof mmk1) {
            mmk1Var = (mmk1) onmVar;
            int i = mmk1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mmk1Var.d = i - Integer.MIN_VALUE;
            } else {
                mmk1Var = new mmk1(this, onmVar);
            }
        } else {
            mmk1Var = new mmk1(this, onmVar);
        }
        Object objC = mmk1Var.b;
        int i2 = mmk1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                bl61 bl61VarN = SetPermissionRequest.n();
                bl61VarN.n();
                bl61VarN.q(z);
                SetPermissionRequest setPermissionRequestBuild = bl61VarN.build();
                jmk1 jmk1Var = this.a;
                setPermissionRequestBuild.getClass();
                mmk1Var.a = z;
                mmk1Var.d = 1;
                objC = jmk1Var.c(setPermissionRequestBuild, mmk1Var);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = mmk1Var.a;
                hm5.M(objC);
            }
            SetPermissionResponse setPermissionResponse = (SetPermissionResponse) objC;
            if (setPermissionResponse.n() == zls0.SUCCESS) {
                return Boolean.valueOf(z);
            }
            Logger.d("Failed to set voice data storage permission in idj-state-manager: " + setPermissionResponse.n(), new Object[0]);
            return new m231(new Exception("Failed to set voice data permission: " + setPermissionResponse.n()));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d("Failed to set voice data storage permission in idj-state-manager", new Object[]{e2});
            return new m231(e2);
        }
    }
}
