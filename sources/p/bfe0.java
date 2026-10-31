package p;

import android.content.Intent;
import android.net.Uri;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bfe0 implements qhv0 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;

    public bfe0(Intent intent, String str, iyc0 iyc0Var) {
        this.b = str;
        this.c = iyc0Var;
        Set set = s4b1.f;
        q4b1 q4b1VarQ = uic.x(intent.getDataString()).q();
        hhc mmr0Var = null;
        if (q4b1VarQ != null) {
            String str2 = q4b1VarQ.a;
            String str3 = q4b1VarQ.b;
            mmr0Var = new mmr0(str2, str3 != null ? phc.m(str3) : null);
        }
        this.d = mmr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public final Object a(lnm lnmVar) {
        afe0 afe0Var;
        rm81 rm81Var;
        Map m231Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof afe0) {
                    afe0Var = (afe0) lnmVar;
                    int i = afe0Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        afe0Var.c = i - Integer.MIN_VALUE;
                    } else {
                        afe0Var = new afe0(this, (onm) lnmVar);
                    }
                } else {
                    afe0Var = new afe0(this, (onm) lnmVar);
                }
                Object objP = afe0Var.a;
                int i2 = afe0Var.c;
                try {
                    if (i2 == 0) {
                        hm5.M(objP);
                        long j = cfe0.a;
                        yee0 yee0Var = new yee0(this, null, (byte) 1);
                        afe0Var.c = 1;
                        objP = rc2.P(j, yee0Var, afe0Var);
                        if (objP == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (i2 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objP);
                    }
                    return rih1Var;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                    return rih1Var;
                }
            default:
                String str = (String) this.b;
                mmr0 mmr0Var = (mmr0) this.d;
                if (lnmVar instanceof rm81) {
                    rm81Var = (rm81) lnmVar;
                    int i3 = rm81Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        rm81Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        rm81Var = new rm81(this, (onm) lnmVar);
                    }
                } else {
                    rm81Var = new rm81(this, (onm) lnmVar);
                }
                Object objS = rm81Var.a;
                int i4 = rm81Var.c;
                try {
                    if (i4 == 0) {
                        hm5.M(objS);
                        if (mmr0Var == null) {
                            return rih1Var;
                        }
                        xyc0 xyc0Var = (iyc0) this.c;
                        List listSingletonList = Collections.singletonList(new ayc0((String) mmr0Var.a, (phc) mmr0Var.b, null, true, null, 20));
                        rm81Var.c = 1;
                        objS = xyc0Var.s(str, listSingletonList, z6x.a, rm81Var);
                        if (objS == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (i4 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objS);
                    }
                    m231Var = (Map) ((py21) objS).d();
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA == null) {
                    return rih1Var;
                }
                Logger.e(thA, "SignalingPreLoader: Failed to send signal " + mmr0Var.a + " for " + str, new Object[0]);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable b(onm onmVar) {
        xee0 xee0Var;
        Boolean m231Var;
        if (onmVar instanceof xee0) {
            xee0Var = (xee0) onmVar;
            int i = xee0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xee0Var.c = i - Integer.MIN_VALUE;
            } else {
                xee0Var = new xee0(this, onmVar);
            }
        } else {
            xee0Var = new xee0(this, onmVar);
        }
        Object objP = xee0Var.a;
        int i2 = xee0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                long j = cfe0.b;
                yee0 yee0Var = new yee0(this, null, (byte) 0);
                xee0Var.c = 1;
                objP = rc2.P(j, yee0Var, xee0Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objP);
            }
            m231Var = (Boolean) objP;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object c(onm onmVar) {
        zee0 zee0Var;
        eee0 eee0Var;
        Empty emptyBuild;
        LocalFilesFeature localFilesFeature = (LocalFilesFeature) this.c;
        if (onmVar instanceof zee0) {
            zee0Var = (zee0) onmVar;
            int i = zee0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zee0Var.c = i - Integer.MIN_VALUE;
            } else {
                zee0Var = new zee0(this, onmVar);
            }
        } else {
            zee0Var = new zee0(this, onmVar);
        }
        Object objB = zee0Var.a;
        int i2 = zee0Var.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            String dataString = ((Intent) this.b).getDataString();
            if (dataString != null) {
                localFilesFeature.registerTemporaryFile(Uri.parse(dataString));
                zee0Var.c = 1;
                objB = b(zee0Var);
                if (objB != d9nVar) {
                }
                return d9nVar;
            }
            return rih1Var;
        }
        if (i2 == 1) {
            hm5.M(objB);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(objB);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        eee0Var = (xde0) this.d;
        emptyBuild = Empty.o().build();
        zee0Var.c = 3;
        if (eee0Var.c(emptyBuild, zee0Var) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
        if (u890.j(objB, Boolean.FALSE)) {
            zee0Var.c = 2;
            if (localFilesFeature.setEnabled(true, zee0Var) != d9nVar) {
                eee0Var = (xde0) this.d;
                emptyBuild = Empty.o().build();
                zee0Var.c = 3;
                if (eee0Var.c(emptyBuild, zee0Var) == d9nVar) {
                    return rih1Var;
                }
            }
        } else {
            eee0Var = (xde0) this.d;
            emptyBuild = Empty.o().build();
            zee0Var.c = 3;
            if (eee0Var.c(emptyBuild, zee0Var) == d9nVar) {
                return rih1Var;
            }
        }
        return d9nVar;
    }

    public bfe0(Intent intent, LocalFilesFeature localFilesFeature, xde0 xde0Var) {
        this.b = intent;
        this.c = localFilesFeature;
        this.d = xde0Var;
    }
}
