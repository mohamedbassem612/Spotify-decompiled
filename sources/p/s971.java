package p;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.campfire.datasource.impl.proto.CreateGroupOptions;
import com.spotify.campfire.sharelist.impl.proto.ShareListRequest;
import com.spotify.campfire.sharelist.impl.proto.SharelistItem;
import com.spotify.campfire.sharelist.impl.proto.SharelistResponse;
import com.spotify.campfire.sharelist.impl.proto.SharelistUser;
import com.spotify.campfire.sharelist.impl.proto.a;
import com.spotify.campfire.sharelist.impl.proto.b;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s971 implements h971, f961 {
    public final j971 a;
    public final Observable b;
    public final ipq c;
    public final ipq d;
    public final m971 e;
    public final Context f;
    public final add g;
    public final ipq h;
    public final ipq i;

    public s971(j971 j971Var, Observable observable, ipq ipqVar, ipq ipqVar2, m971 m971Var, Context context, add addVar, ipq ipqVar3, ipq ipqVar4) {
        this.a = j971Var;
        this.b = observable;
        this.c = ipqVar;
        this.d = ipqVar2;
        this.e = m971Var;
        this.f = context;
        this.g = addVar;
        this.h = ipqVar3;
        this.i = ipqVar4;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r12 == r5) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.h290 r10, boolean r11, p.onm r12) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.s971.b(p.h290, boolean, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        o971 o971Var;
        w4i1 w4i1Var;
        boolean zP;
        Object objA;
        boolean z;
        w4i1 w4i1Var2;
        SharelistResponse sharelistResponse;
        h290 h290VarO;
        Object objB;
        h290 h290Var;
        w4i1 w4i1Var3;
        int iN;
        if (onmVar instanceof o971) {
            o971Var = (o971) onmVar;
            int i = o971Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                o971Var.i = i - Integer.MIN_VALUE;
            } else {
                o971Var = new o971(this, onmVar);
            }
        } else {
            o971Var = new o971(this, onmVar);
        }
        Object objL = o971Var.g;
        int i2 = o971Var.i;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objL);
            o971Var.a = str;
            o971Var.i = 1;
            objL = fc11.l(this.b, 1, (Object) null, o971Var);
            if (objL != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = o971Var.a;
            hm5.M(objL);
        } else {
            if (i2 == 2) {
                str = o971Var.a;
                hm5.M(objL);
                w4i1Var = (w4i1) objL;
                zP = this.g.p();
                a aVarN = ShareListRequest.n();
                aVarN.q(str);
                ShareListRequest shareListRequest = (ShareListRequest) aVarN.build();
                o971Var.a = null;
                o971Var.b = w4i1Var;
                o971Var.f = zP;
                o971Var.i = 3;
                objA = this.a.a(shareListRequest, o971Var);
                if (objA != obj) {
                    objL = objA;
                    z = zP;
                    w4i1Var2 = w4i1Var;
                    sharelistResponse = (SharelistResponse) objL;
                    h290VarO = sharelistResponse.o();
                    h290 h290VarO2 = sharelistResponse.o();
                    o971Var.a = null;
                    o971Var.b = w4i1Var2;
                    o971Var.c = sharelistResponse;
                    o971Var.d = h290VarO;
                    o971Var.e = w4i1Var2;
                    o971Var.f = z;
                    o971Var.i = 4;
                    objB = b(h290VarO2, z, o971Var);
                    if (objB != obj) {
                        h290Var = h290VarO;
                        objL = objB;
                        w4i1Var3 = w4i1Var2;
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                z = o971Var.f;
                w4i1Var2 = o971Var.b;
                hm5.M(objL);
                sharelistResponse = (SharelistResponse) objL;
                h290VarO = sharelistResponse.o();
                h290 h290VarO3 = sharelistResponse.o();
                o971Var.a = null;
                o971Var.b = w4i1Var2;
                o971Var.c = sharelistResponse;
                o971Var.d = h290VarO;
                o971Var.e = w4i1Var2;
                o971Var.f = z;
                o971Var.i = 4;
                objB = b(h290VarO3, z, o971Var);
                if (objB != obj) {
                    h290Var = h290VarO;
                    objL = objB;
                    w4i1Var3 = w4i1Var2;
                }
                return obj;
            }
            if (i2 != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = o971Var.f;
            w4i1Var2 = o971Var.e;
            h290Var = o971Var.d;
            sharelistResponse = o971Var.c;
            w4i1Var3 = o971Var.b;
            hm5.M(objL);
        }
        ArrayList arrayListB = l971.b(h290Var, w4i1Var2, (Map) objL, this.f.getResources(), z);
        boolean zP2 = sharelistResponse.p();
        if (sharelistResponse.q() || sharelistResponse.n() <= 2) {
            iN = 10;
        } else {
            iN = sharelistResponse.n();
        }
        return new i971(arrayListB, zP2, iN, w4i1Var3);
        o971Var.a = str;
        o971Var.i = 2;
        objL = f((String) objL, o971Var);
        if (objL != obj) {
            w4i1Var = (w4i1) objL;
            zP = this.g.p();
            a aVarN2 = ShareListRequest.n();
            aVarN2.q(str);
            ShareListRequest shareListRequest2 = (ShareListRequest) aVarN2.build();
            o971Var.a = null;
            o971Var.b = w4i1Var;
            o971Var.f = zP;
            o971Var.i = 3;
            objA = this.a.a(shareListRequest2, o971Var);
            if (objA != obj) {
                objL = objA;
                z = zP;
                w4i1Var2 = w4i1Var;
                sharelistResponse = (SharelistResponse) objL;
                h290VarO = sharelistResponse.o();
                h290 h290VarO4 = sharelistResponse.o();
                o971Var.a = null;
                o971Var.b = w4i1Var2;
                o971Var.c = sharelistResponse;
                o971Var.d = h290VarO;
                o971Var.e = w4i1Var2;
                o971Var.f = z;
                o971Var.i = 4;
                objB = b(h290VarO4, z, o971Var);
                if (objB != obj) {
                    h290Var = h290VarO;
                    objL = objB;
                    w4i1Var3 = w4i1Var2;
                    ArrayList arrayListB2 = l971.b(h290Var, w4i1Var2, (Map) objL, this.f.getResources(), z);
                    boolean zP3 = sharelistResponse.p();
                    if (sharelistResponse.q()) {
                        iN = 10;
                    } else {
                        iN = 10;
                    }
                    return new i971(arrayListB2, zP3, iN, w4i1Var3);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        p971 p971Var;
        w4i1 w4i1Var;
        boolean zP;
        Object objB;
        w4i1 w4i1Var2;
        SharelistResponse sharelistResponse;
        h290 h290VarO;
        Object objB2;
        w4i1 w4i1Var3;
        h290 h290Var;
        w4i1 w4i1Var4;
        CreateGroupOptions createGroupOptions;
        int iN;
        String hierarchyId;
        if (onmVar instanceof p971) {
            p971Var = (p971) onmVar;
            int i = p971Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                p971Var.h = i - Integer.MIN_VALUE;
            } else {
                p971Var = new p971(this, onmVar);
            }
        } else {
            p971Var = new p971(this, onmVar);
        }
        Object objL = p971Var.f;
        int i2 = p971Var.h;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objL);
            p971Var.h = 1;
            objL = fc11.l(this.b, 1, (Object) null, p971Var);
            if (objL != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            hm5.M(objL);
        } else {
            if (i2 == 2) {
                hm5.M(objL);
                w4i1Var = (w4i1) objL;
                zP = this.g.p();
                ShareListRequest shareListRequest = (ShareListRequest) ShareListRequest.n().build();
                p971Var.a = w4i1Var;
                p971Var.e = zP;
                p971Var.h = 3;
                objB = this.a.b(shareListRequest, p971Var);
                if (objB != obj) {
                    w4i1Var2 = w4i1Var;
                    objL = objB;
                    sharelistResponse = (SharelistResponse) objL;
                    h290VarO = sharelistResponse.o();
                    h290 h290VarO2 = sharelistResponse.o();
                    p971Var.a = w4i1Var2;
                    p971Var.b = sharelistResponse;
                    p971Var.c = h290VarO;
                    p971Var.d = w4i1Var2;
                    p971Var.e = zP;
                    p971Var.h = 4;
                    objB2 = b(h290VarO2, zP, p971Var);
                    if (objB2 != obj) {
                        w4i1Var3 = w4i1Var2;
                        h290Var = h290VarO;
                        objL = objB2;
                        w4i1Var4 = w4i1Var3;
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                zP = p971Var.e;
                w4i1Var2 = p971Var.a;
                hm5.M(objL);
                sharelistResponse = (SharelistResponse) objL;
                h290VarO = sharelistResponse.o();
                h290 h290VarO3 = sharelistResponse.o();
                p971Var.a = w4i1Var2;
                p971Var.b = sharelistResponse;
                p971Var.c = h290VarO;
                p971Var.d = w4i1Var2;
                p971Var.e = zP;
                p971Var.h = 4;
                objB2 = b(h290VarO3, zP, p971Var);
                if (objB2 != obj) {
                    w4i1Var3 = w4i1Var2;
                    h290Var = h290VarO;
                    objL = objB2;
                    w4i1Var4 = w4i1Var3;
                }
                return obj;
            }
            if (i2 != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zP = p971Var.e;
            w4i1Var3 = p971Var.d;
            h290Var = p971Var.c;
            sharelistResponse = p971Var.b;
            w4i1Var4 = p971Var.a;
            hm5.M(objL);
        }
        ArrayList arrayListB = l971.b(h290Var, w4i1Var3, (Map) objL, this.f.getResources(), zP);
        if (sharelistResponse.hasCreateGroupOptions()) {
            createGroupOptions = sharelistResponse.getCreateGroupOptions();
        } else {
            createGroupOptions = null;
        }
        boolean zP2 = sharelistResponse.p();
        if (sharelistResponse.q() || sharelistResponse.n() <= 2) {
            iN = 10;
        } else {
            iN = sharelistResponse.n();
        }
        i971 i971Var = new i971(arrayListB, zP2, iN, w4i1Var4);
        if (createGroupOptions != null) {
            hierarchyId = createGroupOptions.getHierarchyId();
        } else {
            hierarchyId = null;
        }
        return new uln(hierarchyId, createGroupOptions != null ? createGroupOptions.getRequestToken() : null, i971Var);
        p971Var.h = 2;
        objL = f((String) objL, p971Var);
        if (objL != obj) {
            w4i1Var = (w4i1) objL;
            zP = this.g.p();
            ShareListRequest shareListRequest2 = (ShareListRequest) ShareListRequest.n().build();
            p971Var.a = w4i1Var;
            p971Var.e = zP;
            p971Var.h = 3;
            objB = this.a.b(shareListRequest2, p971Var);
            if (objB != obj) {
                w4i1Var2 = w4i1Var;
                objL = objB;
                sharelistResponse = (SharelistResponse) objL;
                h290VarO = sharelistResponse.o();
                h290 h290VarO4 = sharelistResponse.o();
                p971Var.a = w4i1Var2;
                p971Var.b = sharelistResponse;
                p971Var.c = h290VarO;
                p971Var.d = w4i1Var2;
                p971Var.e = zP;
                p971Var.h = 4;
                objB2 = b(h290VarO4, zP, p971Var);
                if (objB2 != obj) {
                    w4i1Var3 = w4i1Var2;
                    h290Var = h290VarO;
                    objL = objB2;
                    w4i1Var4 = w4i1Var3;
                    ArrayList arrayListB2 = l971.b(h290Var, w4i1Var3, (Map) objL, this.f.getResources(), zP);
                    if (sharelistResponse.hasCreateGroupOptions()) {
                        createGroupOptions = sharelistResponse.getCreateGroupOptions();
                    } else {
                        createGroupOptions = null;
                    }
                    boolean zP3 = sharelistResponse.p();
                    if (sharelistResponse.q()) {
                        iN = 10;
                    } else {
                        iN = 10;
                    }
                    i971 i971Var2 = new i971(arrayListB2, zP3, iN, w4i1Var4);
                    if (createGroupOptions != null) {
                        hierarchyId = createGroupOptions.getHierarchyId();
                    } else {
                        hierarchyId = null;
                    }
                    return new uln(hierarchyId, createGroupOptions != null ? createGroupOptions.getRequestToken() : null, i971Var2);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x0165 A[PHI: r1 r2 r4 r6 r7 r8 r11 r12
      0x0165: PHI (r1v15 boolean) = (r1v14 boolean), (r1v40 boolean) binds: [B:44:0x0162, B:19:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r2v15 p.m971) = (r2v14 p.m971), (r2v23 p.m971) binds: [B:44:0x0162, B:19:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r4v6 java.lang.String) = (r4v5 java.lang.String), (r4v23 java.lang.String) binds: [B:44:0x0162, B:19:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r6v8 java.lang.Object) = (r6v7 java.lang.Object), (r6v18 java.lang.Object) binds: [B:44:0x0162, B:19:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r7v5 int) = (r7v4 int), (r7v14 int) binds: [B:44:0x0162, B:19:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r8v7 p.f6q0) = (r8v6 p.f6q0), (r8v14 p.f6q0) binds: [B:44:0x0162, B:19:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r11v12 p.s4b1) = (r11v11 p.s4b1), (r11v18 p.s4b1) binds: [B:44:0x0162, B:19:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r12v6 p.d9n) = (r12v5 p.d9n), (r12v16 p.d9n) binds: [B:44:0x0162, B:19:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x0224  */
    /* JADX WARN: Code duplicated, block: B:68:0x0236  */
    /* JADX WARN: Code duplicated, block: B:70:0x0244  */
    /* JADX WARN: Code duplicated, block: B:72:0x0256  */
    /* JADX WARN: Code duplicated, block: B:74:0x0289  */
    /* JADX WARN: Code duplicated, block: B:77:0x0291  */
    /* JADX WARN: Code duplicated, block: B:79:0x0299  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:87:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:89:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:91:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x0300  */
    /* JADX WARN: Code duplicated, block: B:95:0x032a  */
    /* JADX WARN: Code duplicated, block: B:98:0x034e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0350  */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x02a2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [p.s971] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public final Object e(s4b1 s4b1Var, int i, boolean z, String str, onm onmVar) {
        q971 q971Var;
        String str2;
        int i2;
        f6q0 i6q0Var;
        s4b1 s4b1Var2;
        int i3;
        boolean z2;
        Object objI;
        s4b1 s4b1Var3;
        Object obj;
        boolean z3;
        Object objF;
        w4i1 w4i1Var;
        boolean zP;
        Object objC;
        boolean z4;
        boolean z5;
        f6q0 f6q0Var;
        w4i1 w4i1Var2;
        int i4;
        SharelistResponse sharelistResponse;
        h290 h290VarO;
        Object objB;
        w4i1 w4i1Var3;
        f6q0 f6q0Var2;
        h290<SharelistItem> h290Var;
        Map map;
        Resources resources;
        smc0 arrayList;
        boolean z6;
        smc0 smc0VarN;
        ?? r5;
        smc0 smc0VarN2;
        boolean z7;
        Object objE;
        w4i1 w4i1Var4;
        Object h6q0Var;
        SharelistUser sharelistUserO;
        String strH;
        String str3 = str;
        if (onmVar instanceof q971) {
            q971Var = (q971) onmVar;
            int i5 = q971Var.Y;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                q971Var.Y = i5 - Integer.MIN_VALUE;
            } else {
                q971Var = new q971(this, onmVar);
            }
        } else {
            q971Var = new q971(this, onmVar);
        }
        Object obj2 = q971Var.t;
        int i6 = q971Var.Y;
        boolean z8 = false;
        m971 m971Var = this.e;
        d9n d9nVar = d9n.a;
        if (i6 == 0) {
            hm5.M(obj2);
            if (str3 == null) {
                str2 = null;
                i2 = 1;
                i6q0Var = null;
            } else {
                if (!((pki1) this.h.get()).a(str3)) {
                    str3 = null;
                }
                if (str3 != null) {
                    Set set = s4b1.f;
                    s4b1 s4b1VarX = uic.x(str3);
                    m971Var.getClass();
                    Set set2 = pcf.a;
                    String strM = l1d.m("spotify:internal:users-nearby?entityUri=", Uri.encode(s4b1VarX.z()));
                    str2 = null;
                    i2 = 1;
                    i6q0Var = new i6q0(2131231503, 2131959383, 3, strM, true);
                } else {
                    str2 = null;
                    i2 = 1;
                    i6q0Var = null;
                }
            }
            s4b1Var2 = s4b1Var;
            q971Var.a = s4b1Var2;
            q971Var.b = i6q0Var;
            i3 = i;
            q971Var.g = i3;
            z2 = z;
            q971Var.h = z2;
            q971Var.Y = i2;
            objI = b5p1.i(((kbd) this.i.get()).b(), q971Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i6 == 1) {
            boolean z9 = q971Var.h;
            int i7 = q971Var.g;
            f6q0 f6q0Var3 = q971Var.b;
            s4b1Var2 = q971Var.a;
            hm5.M(obj2);
            objI = obj2;
            m971Var = m971Var;
            i3 = i7;
            str2 = null;
            i6q0Var = f6q0Var3;
            d9nVar = d9nVar;
            z2 = z9;
            i2 = 1;
        } else {
            if (i6 == 2) {
                z3 = q971Var.h;
                int i8 = q971Var.g;
                f6q0 f6q0Var4 = q971Var.b;
                s4b1Var3 = q971Var.a;
                hm5.M(obj2);
                obj = obj2;
                m971Var = m971Var;
                i3 = i8;
                str2 = null;
                i6q0Var = f6q0Var4;
                d9nVar = d9nVar;
                q971Var.a = s4b1Var3;
                q971Var.b = i6q0Var;
                q971Var.g = i3;
                q971Var.h = z3;
                q971Var.Y = 3;
                objF = f((String) obj, q971Var);
                if (objF != d9nVar) {
                    w4i1Var = (w4i1) objF;
                    zP = this.g.p();
                    a aVarN = ShareListRequest.n();
                    b bVarN = ShareListRequest.ShareListFilter.n();
                    bVarN.n(z3);
                    aVarN.n((ShareListRequest.ShareListFilter) bVarN.build());
                    ShareListRequest shareListRequest = (ShareListRequest) aVarN.build();
                    shareListRequest.getClass();
                    q971Var.a = s4b1Var3;
                    q971Var.b = i6q0Var;
                    q971Var.c = w4i1Var;
                    q971Var.g = i3;
                    q971Var.h = z3;
                    q971Var.i = zP;
                    q971Var.Y = 4;
                    objC = this.a.c(shareListRequest, q971Var);
                    if (objC != d9nVar) {
                        int i9 = i3;
                        z4 = z3;
                        z5 = zP;
                        f6q0Var = i6q0Var;
                        w4i1Var2 = w4i1Var;
                        i4 = i9;
                        sharelistResponse = (SharelistResponse) objC;
                        h290VarO = sharelistResponse.o();
                        h290 h290VarO2 = sharelistResponse.o();
                        q971Var.a = s4b1Var3;
                        q971Var.b = f6q0Var;
                        q971Var.c = w4i1Var2;
                        q971Var.d = sharelistResponse;
                        q971Var.e = h290VarO;
                        q971Var.f = w4i1Var2;
                        q971Var.g = i4;
                        q971Var.h = z4;
                        q971Var.i = z5;
                        q971Var.Y = 5;
                        objB = b(h290VarO2, z5, q971Var);
                        if (objB != d9nVar) {
                            w4i1Var3 = w4i1Var2;
                            f6q0Var2 = f6q0Var;
                            h290Var = h290VarO;
                        }
                    }
                }
                return d9nVar;
            }
            if (i6 == 3) {
                z3 = q971Var.h;
                int i10 = q971Var.g;
                f6q0 f6q0Var5 = q971Var.b;
                s4b1Var3 = q971Var.a;
                hm5.M(obj2);
                objF = obj2;
                m971Var = m971Var;
                i3 = i10;
                str2 = null;
                i6q0Var = f6q0Var5;
                d9nVar = d9nVar;
                w4i1Var = (w4i1) objF;
                zP = this.g.p();
                a aVarN2 = ShareListRequest.n();
                b bVarN2 = ShareListRequest.ShareListFilter.n();
                bVarN2.n(z3);
                aVarN2.n((ShareListRequest.ShareListFilter) bVarN2.build());
                ShareListRequest shareListRequest2 = (ShareListRequest) aVarN2.build();
                shareListRequest2.getClass();
                q971Var.a = s4b1Var3;
                q971Var.b = i6q0Var;
                q971Var.c = w4i1Var;
                q971Var.g = i3;
                q971Var.h = z3;
                q971Var.i = zP;
                q971Var.Y = 4;
                objC = this.a.c(shareListRequest2, q971Var);
                if (objC != d9nVar) {
                    int i11 = i3;
                    z4 = z3;
                    z5 = zP;
                    f6q0Var = i6q0Var;
                    w4i1Var2 = w4i1Var;
                    i4 = i11;
                    sharelistResponse = (SharelistResponse) objC;
                    h290VarO = sharelistResponse.o();
                    h290 h290VarO3 = sharelistResponse.o();
                    q971Var.a = s4b1Var3;
                    q971Var.b = f6q0Var;
                    q971Var.c = w4i1Var2;
                    q971Var.d = sharelistResponse;
                    q971Var.e = h290VarO;
                    q971Var.f = w4i1Var2;
                    q971Var.g = i4;
                    q971Var.h = z4;
                    q971Var.i = z5;
                    q971Var.Y = 5;
                    objB = b(h290VarO3, z5, q971Var);
                    if (objB != d9nVar) {
                        w4i1Var3 = w4i1Var2;
                        f6q0Var2 = f6q0Var;
                        h290Var = h290VarO;
                    }
                }
                return d9nVar;
            }
            if (i6 == 4) {
                z5 = q971Var.i;
                boolean z10 = q971Var.h;
                i4 = q971Var.g;
                w4i1 w4i1Var5 = q971Var.c;
                f6q0 f6q0Var6 = q971Var.b;
                s4b1 s4b1Var4 = q971Var.a;
                hm5.M(obj2);
                d9nVar = d9nVar;
                f6q0Var = f6q0Var6;
                objC = obj2;
                m971Var = m971Var;
                z4 = z10;
                str2 = null;
                w4i1Var2 = w4i1Var5;
                s4b1Var3 = s4b1Var4;
                sharelistResponse = (SharelistResponse) objC;
                h290VarO = sharelistResponse.o();
                h290 h290VarO4 = sharelistResponse.o();
                q971Var.a = s4b1Var3;
                q971Var.b = f6q0Var;
                q971Var.c = w4i1Var2;
                q971Var.d = sharelistResponse;
                q971Var.e = h290VarO;
                q971Var.f = w4i1Var2;
                q971Var.g = i4;
                q971Var.h = z4;
                q971Var.i = z5;
                q971Var.Y = 5;
                objB = b(h290VarO4, z5, q971Var);
                if (objB != d9nVar) {
                    w4i1Var3 = w4i1Var2;
                    f6q0Var2 = f6q0Var;
                    h290Var = h290VarO;
                }
                return d9nVar;
            }
            if (i6 != 5) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z5 = q971Var.i;
            int i12 = q971Var.g;
            w4i1 w4i1Var6 = q971Var.f;
            h290Var = q971Var.e;
            SharelistResponse sharelistResponse2 = q971Var.d;
            w4i1Var3 = q971Var.c;
            f6q0 f6q0Var7 = q971Var.b;
            s4b1 s4b1Var5 = q971Var.a;
            hm5.M(obj2);
            objB = obj2;
            m971Var = m971Var;
            f6q0Var2 = f6q0Var7;
            sharelistResponse = sharelistResponse2;
            s4b1Var3 = s4b1Var5;
            i4 = i12;
            str2 = null;
            w4i1Var2 = w4i1Var6;
        }
        map = (Map) objB;
        resources = this.f.getResources();
        arrayList = new ArrayList();
        for (SharelistItem sharelistItem : h290Var) {
            if (sharelistItem.hasUser()) {
                if (z5 || !sharelistItem.o().u()) {
                    w4i1Var4 = (w4i1) map.get(sharelistItem.o().getUsername());
                    if (w4i1Var4 != null) {
                        sharelistUserO = sharelistItem.o();
                        if (sharelistUserO.o().o()) {
                            strH = pcf.d(6, sharelistUserO.o().getHierarchyId(), str2);
                        } else {
                            String hierarchyId = sharelistUserO.o().getHierarchyId();
                            String username = sharelistUserO.getUsername();
                            Set set3 = pcf.a;
                            strH = gvg.h("spotify:chat:", hierarchyId, "?username=", Uri.encode(username));
                        }
                        h6q0Var = new h6q0(w4i1Var4, strH, sharelistUserO.p(), l971.f(sharelistUserO), l971.c(sharelistUserO), l971.d(sharelistUserO));
                    } else {
                        z5 = z5;
                        h6q0Var = null;
                    }
                } else {
                    w4i1 w4i1Var7 = (w4i1) map.get(sharelistItem.o().getAgentUri());
                    if (w4i1Var7 != null) {
                        z5 = z5;
                        h6q0Var = l971.a(sharelistItem.o(), w4i1Var7);
                    } else {
                        z5 = z5;
                        h6q0Var = str2;
                    }
                }
                objE = h6q0Var;
            } else {
                z5 = z5;
                if (sharelistItem.hasGroup()) {
                    objE = l971.e(sharelistItem.n(), w4i1Var2, map, resources);
                } else {
                    z7 = false;
                    Logger.d("Unknown ShareListItem type: " + sharelistItem, new Object[0]);
                    objE = null;
                }
                if (objE != null) {
                    arrayList.add(objE);
                }
                z5 = z5;
                z8 = z7;
                str2 = null;
            }
            z7 = false;
            if (objE != null) {
                arrayList.add(objE);
            }
            z5 = z5;
            z8 = z7;
            str2 = null;
        }
        z6 = z8;
        if (i4 != -1) {
            if (arrayList.isEmpty()) {
                smc0VarN2 = k4p1.n();
                m971Var.getClass();
                smc0VarN2.add(new e6q0(2131232430, 2131959382, 3, pcf.f(s4b1Var3), true));
                if (f6q0Var2 != null) {
                    smc0VarN2.add(f6q0Var2);
                }
                arrayList = k4p1.k(smc0VarN2);
            } else {
                smc0VarN = k4p1.n();
                m971Var.getClass();
                smc0VarN.add(new g6q0(2131232556, 2131959384, 3, pcf.f(s4b1Var3), true));
                if (f6q0Var2 != null) {
                    smc0VarN.add(f6q0Var2);
                }
                smc0VarN.add(new c6q0(2131231940, 2131959381, 3, pcf.e(s4b1Var3), true));
                if (i4 < 0) {
                    r5 = z6;
                } else {
                    r5 = i4;
                }
                smc0VarN.addAll(o7h.d1(arrayList, (int) r5));
                arrayList = k4p1.k(smc0VarN);
            }
        }
        return new i971(arrayList, sharelistResponse.p(), w4i1Var3);
        if (!((Boolean) objI).booleanValue()) {
            return new i971(p7h.N(i6q0Var), z8, w4i1.f);
        }
        q971Var.a = s4b1Var2;
        q971Var.b = i6q0Var;
        q971Var.g = i3;
        q971Var.h = z2;
        q971Var.Y = 2;
        Object objL = fc11.l(this.b, i2, str2, q971Var);
        if (objL != d9nVar) {
            s4b1Var3 = s4b1Var2;
            obj = objL;
            z3 = z2;
            q971Var.a = s4b1Var3;
            q971Var.b = i6q0Var;
            q971Var.g = i3;
            q971Var.h = z3;
            q971Var.Y = 3;
            objF = f((String) obj, q971Var);
            if (objF != d9nVar) {
                w4i1Var = (w4i1) objF;
                zP = this.g.p();
                a aVarN3 = ShareListRequest.n();
                b bVarN3 = ShareListRequest.ShareListFilter.n();
                bVarN3.n(z3);
                aVarN3.n((ShareListRequest.ShareListFilter) bVarN3.build());
                ShareListRequest shareListRequest3 = (ShareListRequest) aVarN3.build();
                shareListRequest3.getClass();
                q971Var.a = s4b1Var3;
                q971Var.b = i6q0Var;
                q971Var.c = w4i1Var;
                q971Var.g = i3;
                q971Var.h = z3;
                q971Var.i = zP;
                q971Var.Y = 4;
                objC = this.a.c(shareListRequest3, q971Var);
                if (objC != d9nVar) {
                    int i13 = i3;
                    z4 = z3;
                    z5 = zP;
                    f6q0Var = i6q0Var;
                    w4i1Var2 = w4i1Var;
                    i4 = i13;
                    sharelistResponse = (SharelistResponse) objC;
                    h290VarO = sharelistResponse.o();
                    h290 h290VarO5 = sharelistResponse.o();
                    q971Var.a = s4b1Var3;
                    q971Var.b = f6q0Var;
                    q971Var.c = w4i1Var2;
                    q971Var.d = sharelistResponse;
                    q971Var.e = h290VarO;
                    q971Var.f = w4i1Var2;
                    q971Var.g = i4;
                    q971Var.h = z4;
                    q971Var.i = z5;
                    q971Var.Y = 5;
                    objB = b(h290VarO5, z5, q971Var);
                    if (objB != d9nVar) {
                        w4i1Var3 = w4i1Var2;
                        f6q0Var2 = f6q0Var;
                        h290Var = h290VarO;
                        map = (Map) objB;
                        resources = this.f.getResources();
                        arrayList = new ArrayList();
                        while (r10.hasNext()) {
                            if (sharelistItem.hasUser()) {
                                if (z5) {
                                    w4i1Var4 = (w4i1) map.get(sharelistItem.o().getUsername());
                                    if (w4i1Var4 != null) {
                                        sharelistUserO = sharelistItem.o();
                                        if (sharelistUserO.o().o()) {
                                            strH = pcf.d(6, sharelistUserO.o().getHierarchyId(), str2);
                                        } else {
                                            String hierarchyId2 = sharelistUserO.o().getHierarchyId();
                                            String username2 = sharelistUserO.getUsername();
                                            Set set4 = pcf.a;
                                            strH = gvg.h("spotify:chat:", hierarchyId2, "?username=", Uri.encode(username2));
                                        }
                                        h6q0Var = new h6q0(w4i1Var4, strH, sharelistUserO.p(), l971.f(sharelistUserO), l971.c(sharelistUserO), l971.d(sharelistUserO));
                                    } else {
                                        z5 = z5;
                                        h6q0Var = null;
                                    }
                                } else {
                                    w4i1Var4 = (w4i1) map.get(sharelistItem.o().getUsername());
                                    if (w4i1Var4 != null) {
                                        sharelistUserO = sharelistItem.o();
                                        if (sharelistUserO.o().o()) {
                                            strH = pcf.d(6, sharelistUserO.o().getHierarchyId(), str2);
                                        } else {
                                            String hierarchyId3 = sharelistUserO.o().getHierarchyId();
                                            String username3 = sharelistUserO.getUsername();
                                            Set set5 = pcf.a;
                                            strH = gvg.h("spotify:chat:", hierarchyId3, "?username=", Uri.encode(username3));
                                        }
                                        h6q0Var = new h6q0(w4i1Var4, strH, sharelistUserO.p(), l971.f(sharelistUserO), l971.c(sharelistUserO), l971.d(sharelistUserO));
                                    } else {
                                        z5 = z5;
                                        h6q0Var = null;
                                    }
                                }
                                objE = h6q0Var;
                            } else {
                                z5 = z5;
                                if (sharelistItem.hasGroup()) {
                                    objE = l971.e(sharelistItem.n(), w4i1Var2, map, resources);
                                } else {
                                    z7 = false;
                                    Logger.d("Unknown ShareListItem type: " + sharelistItem, new Object[0]);
                                    objE = null;
                                }
                                if (objE != null) {
                                    arrayList.add(objE);
                                }
                                z5 = z5;
                                z8 = z7;
                                str2 = null;
                            }
                            z7 = false;
                            if (objE != null) {
                                arrayList.add(objE);
                            }
                            z5 = z5;
                            z8 = z7;
                            str2 = null;
                        }
                        z6 = z8;
                        if (i4 != -1) {
                            if (arrayList.isEmpty()) {
                                smc0VarN2 = k4p1.n();
                                m971Var.getClass();
                                smc0VarN2.add(new e6q0(2131232430, 2131959382, 3, pcf.f(s4b1Var3), true));
                                if (f6q0Var2 != null) {
                                    smc0VarN2.add(f6q0Var2);
                                }
                                arrayList = k4p1.k(smc0VarN2);
                            } else {
                                smc0VarN = k4p1.n();
                                m971Var.getClass();
                                smc0VarN.add(new g6q0(2131232556, 2131959384, 3, pcf.f(s4b1Var3), true));
                                if (f6q0Var2 != null) {
                                    smc0VarN.add(f6q0Var2);
                                }
                                smc0VarN.add(new c6q0(2131231940, 2131959381, 3, pcf.e(s4b1Var3), true));
                                if (i4 < 0) {
                                    r5 = z6;
                                } else {
                                    r5 = i4;
                                }
                                smc0VarN.addAll(o7h.d1(arrayList, (int) r5));
                                arrayList = k4p1.k(smc0VarN);
                            }
                        }
                        return new i971(arrayList, sharelistResponse.p(), w4i1Var3);
                    }
                }
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, onm onmVar) {
        r971 r971Var;
        if (onmVar instanceof r971) {
            r971Var = (r971) onmVar;
            int i = r971Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                r971Var.d = i - Integer.MIN_VALUE;
            } else {
                r971Var = new r971(this, onmVar);
            }
        } else {
            r971Var = new r971(this, onmVar);
        }
        Object objA = r971Var.b;
        int i2 = r971Var.d;
        if (i2 == 0) {
            hm5.M(objA);
            cex0 cex0Var = (cex0) this.c.get();
            List listSingletonList = Collections.singletonList(str);
            r971Var.a = str;
            r971Var.d = 1;
            objA = cex0Var.a(listSingletonList, r971Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = r971Var.a;
            hm5.M(objA);
        }
        w4i1 w4i1Var = (w4i1) ((Map) objA).get(str);
        return w4i1Var == null ? w4i1.f : w4i1Var;
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
