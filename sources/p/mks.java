package p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.spotify.accessory.categorizer.BluetoothCategorizer;
import com.spotify.accessory.categorizer.CategorizerResponse;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mks {
    public final Context a;
    public final a84 b;
    public final o4o0 c;
    public final BluetoothCategorizer d;
    public final q8n e;

    public mks(Context context, a84 a84Var, o4o0 o4o0Var, BluetoothCategorizer bluetoothCategorizer, q8n q8nVar) {
        this.a = context;
        this.b = a84Var;
        this.c = o4o0Var;
        this.d = bluetoothCategorizer;
        this.e = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0066 -> B:25:0x0087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:24:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.kks
            if (r0 == 0) goto L13
            r0 = r9
            p.kks r0 = (p.kks) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            p.kks r0 = new p.kks
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f
            int r1 = r0.h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L34
            int r8 = r0.e
            int r1 = r0.d
            java.util.Collection r4 = r0.c
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r0.b
            java.util.Collection r6 = r0.a
            java.util.Collection r6 = (java.util.Collection) r6
            p.hm5.M(r9)
            goto L85
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r3
        L3a:
            p.hm5.M(r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r1 = 10
            int r1 = p.q7h.U(r8, r1)
            r9.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
            r1 = 0
            r5 = r8
            r4 = r9
            r8 = r1
        L52:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L8c
            java.lang.Object r9 = r5.next()
            p.ikb r9 = (p.ikb) r9
            p.vuh0 r6 = r9.a
            boolean r6 = p.jmo1.n(r6)
            if (r6 == 0) goto L6c
            p.z5e r9 = r7.d(r9, r3)
            r6 = r4
            goto L87
        L6c:
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            r0.a = r6
            r0.b = r5
            r0.c = r6
            r0.d = r1
            r0.e = r8
            r0.h = r2
            java.lang.Object r9 = r7.c(r9, r0)
            p.d9n r6 = p.d9n.a
            if (r9 != r6) goto L84
            return r6
        L84:
            r6 = r4
        L85:
            p.z5e r9 = (p.z5e) r9
        L87:
            r4.add(r9)
            r4 = r6
            goto L52
        L8c:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mks.b(java.util.List, p.onm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (p.xpn1.H(r0) == r5) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(p.ikb r7, p.onm r8) throws kotlinx.coroutines.flow.internal.AbortFlowException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.lks
            if (r0 == 0) goto L13
            r0 = r8
            p.lks r0 = (p.lks) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.lks r0 = new p.lks
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L43
            if (r1 == r4) goto L39
            if (r1 != r3) goto L33
            com.spotify.accessory.categorizer.CategorizerResponse r7 = r0.b
            p.ikb r0 = r0.a
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L31
            r8 = r7
            r7 = r0
            goto L6a
        L31:
            r7 = move-exception
            goto L6f
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L39:
            p.ikb r7 = r0.a
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L3f
            goto L5b
        L3f:
            r8 = move-exception
            r0 = r7
            r7 = r8
            goto L6f
        L43:
            p.hm5.M(r8)
            com.spotify.accessory.categorizer.BluetoothCategorizer r8 = r6.d     // Catch: java.lang.Exception -> L3f
            p.vuh0 r1 = r7.a     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = r1.b     // Catch: java.lang.Exception -> L3f
            p.mr20 r8 = r8.categorizeAndUpdateCaches(r1)     // Catch: java.lang.Exception -> L3f
            r0.a = r7     // Catch: java.lang.Exception -> L3f
            r0.e = r4     // Catch: java.lang.Exception -> L3f
            java.lang.Object r8 = p.b5p1.i(r8, r0)     // Catch: java.lang.Exception -> L3f
            if (r8 != r5) goto L5b
            goto L69
        L5b:
            com.spotify.accessory.categorizer.CategorizerResponse r8 = (com.spotify.accessory.categorizer.CategorizerResponse) r8     // Catch: java.lang.Exception -> L3f
            r0.a = r7     // Catch: java.lang.Exception -> L3f
            r0.b = r8     // Catch: java.lang.Exception -> L3f
            r0.e = r3     // Catch: java.lang.Exception -> L3f
            java.lang.Object r0 = p.xpn1.H(r0)     // Catch: java.lang.Exception -> L3f
            if (r0 != r5) goto L6a
        L69:
            return r5
        L6a:
            p.z5e r6 = r6.d(r7, r8)     // Catch: java.lang.Exception -> L3f
            return r6
        L6f:
            p.vuh0 r8 = r0.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to categorize route: "
            r1.<init>(r3)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.spotify.base.java.logging.Logger.e(r7, r8, r1)
            p.z5e r6 = r6.d(r0, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mks.c(p.ikb, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:93:0x0116  */
    public final z5e d(ikb ikbVar, CategorizerResponse categorizerResponse) {
        zfb zfbVar;
        int i;
        BluetoothDevice bluetoothDevice;
        String category;
        int i2;
        vuh0 vuh0Var = ikbVar.a;
        int i3 = vuh0Var.d;
        boolean zN = jmo1.n(vuh0Var);
        f0u f0uVar = f0u.d;
        f0u f0uVar2 = f0u.c;
        Context context = this.a;
        if (zN) {
            if (xoi1.b(context)) {
                f0uVar = f0uVar2;
            }
            return new z5e(ikbVar, f0uVar, 7, (String) null);
        }
        String str = vuh0Var.a;
        if ((i3 == 26 || i3 == 8) && this.c.a()) {
            int length = str.length();
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i4 = -1;
                    break;
                }
                if (str.charAt(i4) == ':') {
                    break;
                }
                i4++;
            }
            String strSubstring = str.substring(i4 + 1);
            BluetoothAdapter bluetoothAdapter = this.b.a;
            if (bluetoothAdapter == null || !BluetoothAdapter.checkBluetoothAddress(strSubstring)) {
                zfbVar = null;
            } else {
                zfbVar = new zfb(bluetoothAdapter.getRemoteDevice(strSubstring));
            }
        } else {
            zfbVar = null;
        }
        int i5 = 4;
        f0u f0uVar3 = f0u.a;
        if (i3 == 0 || i3 == 26) {
            f0uVar = f0uVar3;
        } else {
            f0u f0uVar4 = f0u.e;
            if (i3 == 2000) {
                f0uVar = f0uVar4;
            } else if (i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 8) {
                    f0uVar = f0uVar3;
                } else {
                    f0u f0uVar5 = f0u.f;
                    if (i3 == 9) {
                        f0uVar = f0uVar5;
                    } else if (i3 != 22 && i3 != 23) {
                        switch (i3) {
                            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            case grn1.d /* 12 */:
                                f0uVar = f0uVar3;
                                break;
                            case 13:
                                f0uVar = f0uVar4;
                                break;
                            default:
                                switch (i3) {
                                    case 1001:
                                        f0uVar = f0uVar5;
                                        break;
                                    case 1002:
                                        f0uVar = f0uVar4;
                                        break;
                                    case 1003:
                                        f0uVar = f0u.g;
                                        break;
                                    default:
                                        f0uVar = f0uVar3;
                                        break;
                                }
                                break;
                        }
                    } else {
                        f0uVar = f0uVar3;
                    }
                }
            } else if (xoi1.b(context)) {
                f0uVar = f0uVar2;
            }
        }
        if (i3 == 3 || i3 == 4) {
            i = 3;
        } else if (i3 == 8) {
            i = 4;
        } else if (i3 == 26) {
            i = 3;
        } else if (i3 == 1002) {
            i = 4;
        } else if (i3 == 11 || i3 == 12 || i3 == 22 || i3 == 23) {
            i = 3;
        } else {
            i = 7;
        }
        if (categorizerResponse == null || (category = categorizerResponse.getCategory()) == null) {
            i5 = 0;
        } else {
            if (category.equals("app")) {
                i2 = 1;
            } else if (category.equals("car")) {
                i2 = 2;
            } else if (category.equals("headphones")) {
                i2 = 3;
            } else if (category.equals("speaker")) {
                i2 = 4;
            } else if (category.equals("wearable")) {
                i2 = 5;
            } else {
                i2 = category.equals("face_wearable") ? 6 : 7;
            }
            int iC = l1d.C(i2);
            if (iC == 1) {
                i5 = 2;
            } else if (iC == 2) {
                i5 = 3;
            } else if (iC != 3) {
                i5 = 0;
            }
        }
        if (i5 != 0) {
            i = i5;
        }
        return new z5e(ikbVar, f0uVar, i, (zfbVar == null || (bluetoothDevice = zfbVar.a) == null) ? null : bluetoothDevice.getAlias());
    }
}
