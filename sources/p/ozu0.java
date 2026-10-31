package p;

import android.R;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.connectivity.pubsub.esperanto.proto.EsIdentFilter;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.localfiles.localfilescore.NucleusLocalFilesServiceInstallerKt;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.serviceapi.android.quasarworker.QuasarWorker;
import io.reactivex.rxjava3.subjects.Subject;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ozu0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ozu0(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:107:0x0230  */
    /* JADX WARN: Code duplicated, block: B:108:0x0235  */
    /* JADX WARN: Code duplicated, block: B:110:0x023f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0249  */
    /* JADX WARN: Code duplicated, block: B:113:0x024d  */
    /* JADX WARN: Code duplicated, block: B:115:0x025a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0273  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:123:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:129:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:130:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:132:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:133:0x031b  */
    /* JADX WARN: Code duplicated, block: B:135:0x031f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0329 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x032b  */
    /* JADX WARN: Code duplicated, block: B:139:0x033c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0341  */
    /* JADX WARN: Code duplicated, block: B:144:0x0355 A[Catch: Exception -> 0x0377, TryCatch #0 {Exception -> 0x0377, blocks: (B:142:0x034a, B:144:0x0355, B:151:0x0368, B:147:0x0360), top: B:209:0x034a }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0360 A[Catch: Exception -> 0x0377, LOOP:1: B:143:0x0353->B:147:0x0360, LOOP_END, TryCatch #0 {Exception -> 0x0377, blocks: (B:142:0x034a, B:144:0x0355, B:151:0x0368, B:147:0x0360), top: B:209:0x034a }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0366  */
    /* JADX WARN: Code duplicated, block: B:154:0x0383  */
    /* JADX WARN: Code duplicated, block: B:155:0x038f  */
    /* JADX WARN: Code duplicated, block: B:156:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:158:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:160:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:161:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:163:0x040a  */
    /* JADX WARN: Code duplicated, block: B:164:0x040c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0415  */
    /* JADX WARN: Code duplicated, block: B:168:0x0419  */
    /* JADX WARN: Code duplicated, block: B:169:0x0442  */
    /* JADX WARN: Code duplicated, block: B:171:0x0446  */
    /* JADX WARN: Code duplicated, block: B:173:0x047f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0481  */
    /* JADX WARN: Code duplicated, block: B:176:0x048a  */
    /* JADX WARN: Code duplicated, block: B:178:0x048e  */
    /* JADX WARN: Code duplicated, block: B:181:0x049d  */
    /* JADX WARN: Code duplicated, block: B:183:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:199:0x0527  */
    /* JADX WARN: Code duplicated, block: B:200:0x0531  */
    /* JADX WARN: Code duplicated, block: B:201:0x0535  */
    /* JADX WARN: Code duplicated, block: B:203:0x0539  */
    /* JADX WARN: Code duplicated, block: B:207:0x0576  */
    /* JADX WARN: Code duplicated, block: B:216:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122  */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:69:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x017f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0181  */
    /* JADX WARN: Code duplicated, block: B:91:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0189  */
    /* JADX WARN: Code duplicated, block: B:94:0x0194  */
    /* JADX WARN: Code duplicated, block: B:95:0x0199  */
    /* JADX WARN: Code duplicated, block: B:97:0x019d  */
    /* JADX WARN: Code duplicated, block: B:99:0x01db  */
    private final Object a(Object obj) {
        ynb0 ynb0Var;
        ConcurrentHashMap concurrentHashMap;
        String str;
        ConcurrentHashMap concurrentHashMap2;
        fi9 fi9Var;
        String str2;
        mmr0 mmr0Var;
        boolean z;
        int i;
        mmr0 mmr0Var2;
        int i2;
        fi9 fi9Var2;
        String str3;
        ConcurrentHashMap concurrentHashMap3;
        String str4;
        String str5;
        ai9 ai9Var;
        BluetoothGattService bluetoothGattServiceB;
        fi9 fi9Var3;
        fi9 fi9Var4;
        cf9 cf9Var;
        UUID uuid;
        int i3;
        String str6;
        fi9 fi9Var5;
        fi9 fi9Var6;
        df9 df9Var;
        UUID uuid2;
        byte[] bArr;
        String str7;
        long j;
        fi9[] fi9VarArrValues;
        int length;
        fi9 fi9Var7;
        fi9 fi9Var8;
        of9 of9Var;
        ai9 ai9Var2;
        BluetoothGattService bluetoothGattServiceB2;
        String str8;
        int i4;
        int i5;
        it8 it8Var;
        String str9;
        String str10;
        String str11;
        UUID uuid3;
        edz0 edz0Var;
        cdz0 cdz0Var;
        int i6;
        boolean z2;
        df9 df9Var2 = (pf9) obj;
        ndz0 ndz0Var = (ndz0) this.b;
        String str12 = (String) this.c;
        Object obj2 = this.d;
        if (ndz0Var.p.get(str12) == obj2) {
            boolean z3 = df9Var2 instanceof hf9;
            if (z3) {
                synchronized (obj2) {
                    z2 = ndz0Var.p.get(str12) == obj2 && ndz0Var.o(str12);
                }
                if (z2 && ndz0Var.p.get(str12) == obj2) {
                    ndz0Var.l(str12);
                    ((lh9) ndz0Var.e.get()).c(df9Var2);
                }
            } else {
                ynb0 ynb0Var2 = ndz0Var.e;
                ni9 ni9Var = ndz0Var.a;
                ConcurrentHashMap concurrentHashMap4 = ndz0Var.h;
                ConcurrentHashMap concurrentHashMap5 = ndz0Var.l;
                fi9 fi9Var9 = fi9.b;
                ConcurrentHashMap concurrentHashMap6 = ndz0Var.o;
                ConcurrentHashMap concurrentHashMap7 = ndz0Var.g;
                Subject subject = ndz0Var.k;
                ConcurrentHashMap concurrentHashMap8 = ndz0Var.m;
                ConcurrentHashMap concurrentHashMap9 = ndz0Var.n;
                boolean z4 = df9Var2 instanceof ff9;
                if (z4) {
                    ff9 ff9Var = (ff9) df9Var2;
                    ynb0Var = ynb0Var2;
                    concurrentHashMap = concurrentHashMap4;
                    mmr0Var = new mmr0(ff9Var.a, ff9Var.b);
                } else {
                    ynb0Var = ynb0Var2;
                    concurrentHashMap = concurrentHashMap4;
                    if (df9Var2 instanceof ef9) {
                        ef9 ef9Var = (ef9) df9Var2;
                        mmr0Var = new mmr0(ef9Var.a, ef9Var.b);
                    } else {
                        str = "failureReason=";
                        concurrentHashMap2 = concurrentHashMap5;
                        fi9Var = fi9Var9;
                        str2 = "characteristic=";
                    }
                    z = df9Var2 instanceof df9;
                    if (z) {
                        df9 df9Var3 = df9Var2;
                        mmr0Var2 = new mmr0(df9Var3.a, df9Var3.b);
                    } else {
                        if (df9Var2 instanceof cf9) {
                            cf9 cf9Var2 = (cf9) df9Var2;
                            mmr0Var2 = new mmr0(cf9Var2.a, cf9Var2.b);
                        } else {
                            i = 0;
                        }
                        i2 = 1;
                        if (i2 != 0) {
                            if (z3) {
                                str11 = ((hf9) df9Var2).a;
                                if (ndz0Var.o(str11)) {
                                    ndz0Var.l(str11);
                                }
                            } else if (df9Var2 instanceof gf9) {
                                gf9 gf9Var = (gf9) df9Var2;
                                str10 = gf9Var.a;
                                concurrentHashMap9.remove(str10);
                                concurrentHashMap6.remove(str10);
                                it8.m(ndz0Var.i, str10, "connection_failed", (Integer) concurrentHashMap8.get(str10), (String) null, f4i1.c(gf9Var.b, "status="), (String) null, 40);
                                subject.onNext(new dg9(str10));
                                if (concurrentHashMap.keySet().contains(str10)) {
                                    ndz0Var.h(str10);
                                } else if (concurrentHashMap7.keySet().contains(str10)) {
                                    ndz0Var.k(new yg9(str10));
                                }
                            } else if (df9Var2 instanceof if9) {
                                str9 = ((if9) df9Var2).a;
                                concurrentHashMap9.remove(str9);
                                concurrentHashMap6.remove(str9);
                                it8.m(ndz0Var.i, str9, "disconnected", (Integer) concurrentHashMap8.get(str9), (String) null, (String) null, (String) null, 56);
                                subject.onNext(new dg9(str9));
                                if (concurrentHashMap.keySet().contains(str9)) {
                                    ndz0Var.h(str9);
                                } else if (concurrentHashMap7.keySet().contains(str9)) {
                                    ndz0Var.k(new yg9(str9));
                                }
                            } else if (df9Var2 instanceof jf9) {
                                jf9 jf9Var = (jf9) df9Var2;
                                str8 = jf9Var.a;
                                i4 = jf9Var.b;
                                i5 = jf9Var.c;
                                it8Var = ndz0Var.i;
                                if (i5 == 0) {
                                    it8.m(it8Var, str8, "mtu_changed", (Integer) concurrentHashMap8.get(str8), (String) null, (String) null, f4i1.c(i4, "negotiatedMtu="), 24);
                                } else {
                                    it8.m(it8Var, str8, "mtu_request_failed", (Integer) concurrentHashMap8.get(str8), (String) null, f4i1.c(i5, "status="), f4i1.c(i4, "mtu="), 8);
                                }
                                ndz0Var.j.b(((Number) ni9Var.b.b()).intValue(), i4, i5, str8);
                                ndz0Var.k(new ch9(str8));
                            } else if (df9Var2 instanceof of9) {
                                of9Var = (of9) df9Var2;
                                String str13 = of9Var.a;
                                it8.m(ndz0Var.i, str13, "services_discovered", (Integer) concurrentHashMap8.get(str13), (String) null, (String) null, (String) null, 56);
                                ai9Var2 = (ai9) concurrentHashMap7.get(str13);
                                if (ai9Var2 != null) {
                                    bluetoothGattServiceB2 = ai9Var2.b();
                                    if (bluetoothGattServiceB2 != null || bluetoothGattServiceB2.getCharacteristics().isEmpty()) {
                                        ndz0Var.j(of9Var.a);
                                    } else {
                                        ndz0Var.k(new fh9(str13));
                                        ndz0Var.k(new gh9(str13));
                                    }
                                }
                            } else if (df9Var2 instanceof nf9) {
                                nf9 nf9Var = (nf9) df9Var2;
                                it8 it8Var2 = ndz0Var.i;
                                String str14 = nf9Var.a;
                                it8.m(it8Var2, str14, "services_discovery_failed", (Integer) concurrentHashMap8.get(str14), (String) null, (String) null, (String) null, 56);
                                ndz0Var.j(nf9Var.a);
                            } else if (df9Var2 instanceof mf9) {
                                ndz0Var.j(((mf9) df9Var2).a);
                            } else if (z) {
                                df9Var = df9Var2;
                                uuid2 = df9Var.b;
                                bArr = df9Var.c;
                                str7 = df9Var.a;
                                if (uuid2.equals(pe9.b)) {
                                    it8 it8Var3 = ndz0Var.i;
                                    String str15 = df9Var.a;
                                    it8.m(it8Var3, str15, "read_success", (Integer) concurrentHashMap8.get(str15), (String) null, (String) null, eqq.m(str2, uuid2), 24);
                                    subject.onNext(new xf9(str7, uuid2, bArr));
                                } else if (bArr.length == 8) {
                                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                    try {
                                        j = byteBufferWrap.getLong();
                                        fi9VarArrValues = fi9.values();
                                        length = fi9VarArrValues.length;
                                        while (true) {
                                            if (i < length) {
                                                fi9Var7 = null;
                                                break;
                                            }
                                            fi9Var8 = fi9VarArrValues[i];
                                            if (fi9Var8.a == j) {
                                                fi9Var7 = fi9Var8;
                                                break;
                                            }
                                            i++;
                                        }
                                        if (fi9Var7 == null) {
                                            fi9Var7 = fi9Var;
                                        }
                                        concurrentHashMap2.put(str7, fi9Var7);
                                        subject.onNext(new fg9(str7, fi9Var7));
                                    } catch (Exception unused) {
                                        subject.onNext(new fg9(str7, fi9Var));
                                    }
                                } else {
                                    subject.onNext(new fg9(str7, fi9Var));
                                }
                            } else {
                                fi9Var2 = fi9Var;
                                str3 = str2;
                                concurrentHashMap3 = concurrentHashMap2;
                                if (df9Var2 instanceof cf9) {
                                    cf9Var = (cf9) df9Var2;
                                    uuid = cf9Var.b;
                                    i3 = cf9Var.c;
                                    str6 = cf9Var.a;
                                    if (uuid.equals(pe9.b)) {
                                        subject.onNext(new fg9(str6, fi9Var2));
                                    } else {
                                        it8 it8Var4 = ndz0Var.i;
                                        String str16 = cf9Var.a;
                                        it8.m(it8Var4, str16, "read_failure", (Integer) concurrentHashMap8.get(str16), (String) null, f4i1.c(i3, str), eqq.m(str3, uuid), 8);
                                        jg9 jg9Var = new jg9(i3);
                                        fi9Var5 = (fi9) concurrentHashMap3.get(str6);
                                        if (fi9Var5 == null) {
                                            fi9Var6 = fi9Var2;
                                        } else {
                                            fi9Var6 = fi9Var5;
                                        }
                                        subject.onNext(new wf9(str6, uuid, jg9Var, fi9Var6));
                                    }
                                } else {
                                    str4 = str;
                                    if (z4) {
                                        ff9 ff9Var2 = (ff9) df9Var2;
                                        it8 it8Var5 = ndz0Var.i;
                                        String str17 = ff9Var2.a;
                                        Integer num = (Integer) concurrentHashMap8.get(str17);
                                        UUID uuid4 = ff9Var2.b;
                                        it8.m(it8Var5, str17, "write_success", num, (String) null, (String) null, eqq.m(str3, uuid4), 24);
                                        subject.onNext(new ag9(ff9Var2.a, uuid4));
                                    } else if (df9Var2 instanceof ef9) {
                                        ef9 ef9Var2 = (ef9) df9Var2;
                                        it8 it8Var6 = ndz0Var.i;
                                        String str18 = ef9Var2.a;
                                        Integer num2 = (Integer) concurrentHashMap8.get(str18);
                                        int i7 = ef9Var2.c;
                                        String strC = f4i1.c(i7, str4);
                                        UUID uuid5 = ef9Var2.b;
                                        it8.m(it8Var6, str18, "write_failure", num2, (String) null, strC, eqq.m(str3, uuid5), 8);
                                        jg9 jg9Var2 = new jg9(i7);
                                        String str19 = ef9Var2.a;
                                        fi9Var3 = (fi9) concurrentHashMap3.get(str19);
                                        if (fi9Var3 == null) {
                                            fi9Var4 = fi9Var2;
                                        } else {
                                            fi9Var4 = fi9Var3;
                                        }
                                        subject.onNext(new yf9(str19, uuid5, jg9Var2, fi9Var4));
                                    } else if (df9Var2 instanceof lf9) {
                                        lf9 lf9Var = (lf9) df9Var2;
                                        str5 = lf9Var.a;
                                        ai9Var = (ai9) concurrentHashMap7.get(str5);
                                        if (ai9Var != null) {
                                            bluetoothGattServiceB = ai9Var.b();
                                            if (bluetoothGattServiceB != null || bluetoothGattServiceB.getCharacteristics().isEmpty()) {
                                                ndz0Var.j(str5);
                                            } else {
                                                int i8 = lf9Var.b;
                                                if (i8 < 0) {
                                                    concurrentHashMap8.put(str5, Integer.valueOf(i8));
                                                    String str20 = lf9Var.a;
                                                    int i9 = lf9Var.b;
                                                    long jB = ndz0Var.b.b();
                                                    List<BluetoothGattCharacteristic> characteristics = bluetoothGattServiceB.getCharacteristics();
                                                    ArrayList arrayList = new ArrayList(q7h.U(characteristics, 10));
                                                    Iterator<T> it = characteristics.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(((BluetoothGattCharacteristic) it.next()).getUuid());
                                                    }
                                                    subject.onNext(new pg9(str20, i9, jB, o7h.p1(arrayList)));
                                                    Integer num3 = (Integer) ndz0Var.q.merge(str5, 1, kdz0.b);
                                                    if ((num3 != null ? num3.intValue() : 1) < ((Number) ni9Var.e.b()).intValue()) {
                                                        ndz0Var.k(new gh9(str5));
                                                    } else {
                                                        ((lh9) ynb0Var.get()).a(str5);
                                                    }
                                                } else {
                                                    ((lh9) ynb0Var.get()).a(str5);
                                                }
                                            }
                                        }
                                    } else {
                                        if (df9Var2 instanceof kf9) {
                                            eg.o();
                                            return null;
                                        }
                                        kf9 kf9Var = (kf9) df9Var2;
                                        it8 it8Var7 = ndz0Var.i;
                                        String str21 = kf9Var.a;
                                        it8.m(it8Var7, str21, "rssi_read_failed", (Integer) concurrentHashMap8.get(str21), (String) null, f4i1.c(kf9Var.b, "status="), (String) null, 40);
                                        ((lh9) ynb0Var.get()).a(kf9Var.a);
                                    }
                                }
                            }
                            ((lh9) ndz0Var.e.get()).c(df9Var2);
                        }
                    }
                    String str22 = (String) mmr0Var2.a;
                    uuid3 = (UUID) mmr0Var2.b;
                    edz0Var = (edz0) concurrentHashMap6.get(str22);
                    if (edz0Var != null) {
                        cdz0Var = (cdz0) edz0Var.c.get();
                    } else {
                        cdz0Var = null;
                    }
                    if (u890.j(uuid3, pe9.b) || cdz0Var != null) {
                        if (edz0Var == null && cdz0Var != null && u890.j(cdz0Var.a.b, uuid3)) {
                            i = 0;
                            if (cdz0Var.b.compareAndSet(false, true)) {
                                AtomicReference atomicReference = edz0Var.c;
                                while (!atomicReference.compareAndSet(cdz0Var, null) && atomicReference.get() == cdz0Var) {
                                }
                                if (concurrentHashMap6.get(str22) == edz0Var) {
                                    i2 = 1;
                                }
                            }
                        } else {
                            i = 0;
                        }
                        i2 = i;
                    } else {
                        if (edz0Var != null) {
                            i6 = 1;
                            int i10 = edz0Var.d.get() ? 1 : 0;
                            i2 = i10 ^ i6;
                            i = 0;
                        } else {
                            i6 = 1;
                        }
                        i2 = i10 ^ i6;
                        i = 0;
                    }
                    if (i2 != 0) {
                        if (z3) {
                            str11 = ((hf9) df9Var2).a;
                            if (ndz0Var.o(str11)) {
                                ndz0Var.l(str11);
                            }
                        } else if (df9Var2 instanceof gf9) {
                            gf9 gf9Var2 = (gf9) df9Var2;
                            str10 = gf9Var2.a;
                            concurrentHashMap9.remove(str10);
                            concurrentHashMap6.remove(str10);
                            it8.m(ndz0Var.i, str10, "connection_failed", (Integer) concurrentHashMap8.get(str10), (String) null, f4i1.c(gf9Var2.b, "status="), (String) null, 40);
                            subject.onNext(new dg9(str10));
                            if (concurrentHashMap.keySet().contains(str10)) {
                                ndz0Var.h(str10);
                            } else if (concurrentHashMap7.keySet().contains(str10)) {
                                ndz0Var.k(new yg9(str10));
                            }
                        } else if (df9Var2 instanceof if9) {
                            str9 = ((if9) df9Var2).a;
                            concurrentHashMap9.remove(str9);
                            concurrentHashMap6.remove(str9);
                            it8.m(ndz0Var.i, str9, "disconnected", (Integer) concurrentHashMap8.get(str9), (String) null, (String) null, (String) null, 56);
                            subject.onNext(new dg9(str9));
                            if (concurrentHashMap.keySet().contains(str9)) {
                                ndz0Var.h(str9);
                            } else if (concurrentHashMap7.keySet().contains(str9)) {
                                ndz0Var.k(new yg9(str9));
                            }
                        } else if (df9Var2 instanceof jf9) {
                            jf9 jf9Var2 = (jf9) df9Var2;
                            str8 = jf9Var2.a;
                            i4 = jf9Var2.b;
                            i5 = jf9Var2.c;
                            it8Var = ndz0Var.i;
                            if (i5 == 0) {
                                it8.m(it8Var, str8, "mtu_changed", (Integer) concurrentHashMap8.get(str8), (String) null, (String) null, f4i1.c(i4, "negotiatedMtu="), 24);
                            } else {
                                it8.m(it8Var, str8, "mtu_request_failed", (Integer) concurrentHashMap8.get(str8), (String) null, f4i1.c(i5, "status="), f4i1.c(i4, "mtu="), 8);
                            }
                            ndz0Var.j.b(((Number) ni9Var.b.b()).intValue(), i4, i5, str8);
                            ndz0Var.k(new ch9(str8));
                        } else if (df9Var2 instanceof of9) {
                            of9Var = (of9) df9Var2;
                            String str110 = of9Var.a;
                            it8.m(ndz0Var.i, str110, "services_discovered", (Integer) concurrentHashMap8.get(str110), (String) null, (String) null, (String) null, 56);
                            ai9Var2 = (ai9) concurrentHashMap7.get(str110);
                            if (ai9Var2 != null) {
                                bluetoothGattServiceB2 = ai9Var2.b();
                                if (bluetoothGattServiceB2 != null) {
                                    ndz0Var.j(of9Var.a);
                                } else {
                                    ndz0Var.j(of9Var.a);
                                }
                            }
                        } else if (df9Var2 instanceof nf9) {
                            nf9 nf9Var2 = (nf9) df9Var2;
                            it8 it8Var8 = ndz0Var.i;
                            String str111 = nf9Var2.a;
                            it8.m(it8Var8, str111, "services_discovery_failed", (Integer) concurrentHashMap8.get(str111), (String) null, (String) null, (String) null, 56);
                            ndz0Var.j(nf9Var2.a);
                        } else if (df9Var2 instanceof mf9) {
                            ndz0Var.j(((mf9) df9Var2).a);
                        } else if (z) {
                            df9Var = df9Var2;
                            uuid2 = df9Var.b;
                            bArr = df9Var.c;
                            str7 = df9Var.a;
                            if (uuid2.equals(pe9.b)) {
                                it8 it8Var9 = ndz0Var.i;
                                String str112 = df9Var.a;
                                it8.m(it8Var9, str112, "read_success", (Integer) concurrentHashMap8.get(str112), (String) null, (String) null, eqq.m(str2, uuid2), 24);
                                subject.onNext(new xf9(str7, uuid2, bArr));
                            } else if (bArr.length == 8) {
                                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
                                byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                                j = byteBufferWrap2.getLong();
                                fi9VarArrValues = fi9.values();
                                length = fi9VarArrValues.length;
                                while (true) {
                                    if (i < length) {
                                        fi9Var7 = null;
                                        break;
                                    }
                                    fi9Var8 = fi9VarArrValues[i];
                                    if (fi9Var8.a == j) {
                                        fi9Var7 = fi9Var8;
                                        break;
                                    }
                                    i++;
                                }
                                if (fi9Var7 == null) {
                                    fi9Var7 = fi9Var;
                                }
                                concurrentHashMap2.put(str7, fi9Var7);
                                subject.onNext(new fg9(str7, fi9Var7));
                            } else {
                                subject.onNext(new fg9(str7, fi9Var));
                            }
                        } else {
                            fi9Var2 = fi9Var;
                            str3 = str2;
                            concurrentHashMap3 = concurrentHashMap2;
                            if (df9Var2 instanceof cf9) {
                                cf9Var = (cf9) df9Var2;
                                uuid = cf9Var.b;
                                i3 = cf9Var.c;
                                str6 = cf9Var.a;
                                if (uuid.equals(pe9.b)) {
                                    subject.onNext(new fg9(str6, fi9Var2));
                                } else {
                                    it8 it8Var10 = ndz0Var.i;
                                    String str113 = cf9Var.a;
                                    it8.m(it8Var10, str113, "read_failure", (Integer) concurrentHashMap8.get(str113), (String) null, f4i1.c(i3, str), eqq.m(str3, uuid), 8);
                                    jg9 jg9Var3 = new jg9(i3);
                                    fi9Var5 = (fi9) concurrentHashMap3.get(str6);
                                    if (fi9Var5 == null) {
                                        fi9Var6 = fi9Var2;
                                    } else {
                                        fi9Var6 = fi9Var5;
                                    }
                                    subject.onNext(new wf9(str6, uuid, jg9Var3, fi9Var6));
                                }
                            } else {
                                str4 = str;
                                if (z4) {
                                    ff9 ff9Var3 = (ff9) df9Var2;
                                    it8 it8Var11 = ndz0Var.i;
                                    String str114 = ff9Var3.a;
                                    Integer num4 = (Integer) concurrentHashMap8.get(str114);
                                    UUID uuid6 = ff9Var3.b;
                                    it8.m(it8Var11, str114, "write_success", num4, (String) null, (String) null, eqq.m(str3, uuid6), 24);
                                    subject.onNext(new ag9(ff9Var3.a, uuid6));
                                } else if (df9Var2 instanceof ef9) {
                                    ef9 ef9Var3 = (ef9) df9Var2;
                                    it8 it8Var12 = ndz0Var.i;
                                    String str115 = ef9Var3.a;
                                    Integer num5 = (Integer) concurrentHashMap8.get(str115);
                                    int i11 = ef9Var3.c;
                                    String strC2 = f4i1.c(i11, str4);
                                    UUID uuid7 = ef9Var3.b;
                                    it8.m(it8Var12, str115, "write_failure", num5, (String) null, strC2, eqq.m(str3, uuid7), 8);
                                    jg9 jg9Var4 = new jg9(i11);
                                    String str116 = ef9Var3.a;
                                    fi9Var3 = (fi9) concurrentHashMap3.get(str116);
                                    if (fi9Var3 == null) {
                                        fi9Var4 = fi9Var2;
                                    } else {
                                        fi9Var4 = fi9Var3;
                                    }
                                    subject.onNext(new yf9(str116, uuid7, jg9Var4, fi9Var4));
                                } else if (df9Var2 instanceof lf9) {
                                    lf9 lf9Var2 = (lf9) df9Var2;
                                    str5 = lf9Var2.a;
                                    ai9Var = (ai9) concurrentHashMap7.get(str5);
                                    if (ai9Var != null) {
                                        bluetoothGattServiceB = ai9Var.b();
                                        if (bluetoothGattServiceB != null) {
                                            ndz0Var.j(str5);
                                        } else {
                                            ndz0Var.j(str5);
                                        }
                                    }
                                } else {
                                    if (df9Var2 instanceof kf9) {
                                        eg.o();
                                        return null;
                                    }
                                    kf9 kf9Var2 = (kf9) df9Var2;
                                    it8 it8Var13 = ndz0Var.i;
                                    String str23 = kf9Var2.a;
                                    it8.m(it8Var13, str23, "rssi_read_failed", (Integer) concurrentHashMap8.get(str23), (String) null, f4i1.c(kf9Var2.b, "status="), (String) null, 40);
                                    ((lh9) ynb0Var.get()).a(kf9Var2.a);
                                }
                            }
                        }
                        ((lh9) ndz0Var.e.get()).c(df9Var2);
                    }
                }
                String str24 = (String) mmr0Var.a;
                UUID uuid8 = (UUID) mmr0Var.b;
                fdz0 fdz0Var = (fdz0) concurrentHashMap9.get(str24);
                if (fdz0Var != null) {
                    str = "failureReason=";
                    AtomicReference atomicReference2 = fdz0Var.c;
                    str2 = "characteristic=";
                    ddz0 ddz0Var = (ddz0) atomicReference2.get();
                    if (ddz0Var != null) {
                        fi9Var = fi9Var9;
                        jdz0 jdz0Var = ddz0Var.b;
                        concurrentHashMap2 = concurrentHashMap5;
                        if (u890.j(jdz0Var.a, uuid8)) {
                            while (!atomicReference2.compareAndSet(ddz0Var, null)) {
                                if (atomicReference2.get() != ddz0Var) {
                                }
                            }
                            if (concurrentHashMap9.get(str24) == fdz0Var) {
                                if (z4) {
                                    fdz0Var.b.add(jdz0Var);
                                }
                                z = df9Var2 instanceof df9;
                                if (z) {
                                    df9 df9Var4 = df9Var2;
                                    mmr0Var2 = new mmr0(df9Var4.a, df9Var4.b);
                                } else {
                                    if (df9Var2 instanceof cf9) {
                                        cf9 cf9Var3 = (cf9) df9Var2;
                                        mmr0Var2 = new mmr0(cf9Var3.a, cf9Var3.b);
                                    } else {
                                        i = 0;
                                    }
                                    i2 = 1;
                                    if (i2 != 0) {
                                        if (z3) {
                                            str11 = ((hf9) df9Var2).a;
                                            if (ndz0Var.o(str11)) {
                                                ndz0Var.l(str11);
                                            }
                                        } else if (df9Var2 instanceof gf9) {
                                            gf9 gf9Var3 = (gf9) df9Var2;
                                            str10 = gf9Var3.a;
                                            concurrentHashMap9.remove(str10);
                                            concurrentHashMap6.remove(str10);
                                            it8.m(ndz0Var.i, str10, "connection_failed", (Integer) concurrentHashMap8.get(str10), (String) null, f4i1.c(gf9Var3.b, "status="), (String) null, 40);
                                            subject.onNext(new dg9(str10));
                                            if (concurrentHashMap.keySet().contains(str10)) {
                                                ndz0Var.h(str10);
                                            } else if (concurrentHashMap7.keySet().contains(str10)) {
                                                ndz0Var.k(new yg9(str10));
                                            }
                                        } else if (df9Var2 instanceof if9) {
                                            str9 = ((if9) df9Var2).a;
                                            concurrentHashMap9.remove(str9);
                                            concurrentHashMap6.remove(str9);
                                            it8.m(ndz0Var.i, str9, "disconnected", (Integer) concurrentHashMap8.get(str9), (String) null, (String) null, (String) null, 56);
                                            subject.onNext(new dg9(str9));
                                            if (concurrentHashMap.keySet().contains(str9)) {
                                                ndz0Var.h(str9);
                                            } else if (concurrentHashMap7.keySet().contains(str9)) {
                                                ndz0Var.k(new yg9(str9));
                                            }
                                        } else if (df9Var2 instanceof jf9) {
                                            jf9 jf9Var3 = (jf9) df9Var2;
                                            str8 = jf9Var3.a;
                                            i4 = jf9Var3.b;
                                            i5 = jf9Var3.c;
                                            it8Var = ndz0Var.i;
                                            if (i5 == 0) {
                                                it8.m(it8Var, str8, "mtu_changed", (Integer) concurrentHashMap8.get(str8), (String) null, (String) null, f4i1.c(i4, "negotiatedMtu="), 24);
                                            } else {
                                                it8.m(it8Var, str8, "mtu_request_failed", (Integer) concurrentHashMap8.get(str8), (String) null, f4i1.c(i5, "status="), f4i1.c(i4, "mtu="), 8);
                                            }
                                            ndz0Var.j.b(((Number) ni9Var.b.b()).intValue(), i4, i5, str8);
                                            ndz0Var.k(new ch9(str8));
                                        } else if (df9Var2 instanceof of9) {
                                            of9Var = (of9) df9Var2;
                                            String str117 = of9Var.a;
                                            it8.m(ndz0Var.i, str117, "services_discovered", (Integer) concurrentHashMap8.get(str117), (String) null, (String) null, (String) null, 56);
                                            ai9Var2 = (ai9) concurrentHashMap7.get(str117);
                                            if (ai9Var2 != null) {
                                                bluetoothGattServiceB2 = ai9Var2.b();
                                                if (bluetoothGattServiceB2 != null) {
                                                    ndz0Var.j(of9Var.a);
                                                } else {
                                                    ndz0Var.j(of9Var.a);
                                                }
                                            }
                                        } else if (df9Var2 instanceof nf9) {
                                            nf9 nf9Var3 = (nf9) df9Var2;
                                            it8 it8Var14 = ndz0Var.i;
                                            String str118 = nf9Var3.a;
                                            it8.m(it8Var14, str118, "services_discovery_failed", (Integer) concurrentHashMap8.get(str118), (String) null, (String) null, (String) null, 56);
                                            ndz0Var.j(nf9Var3.a);
                                        } else if (df9Var2 instanceof mf9) {
                                            ndz0Var.j(((mf9) df9Var2).a);
                                        } else if (z) {
                                            df9Var = df9Var2;
                                            uuid2 = df9Var.b;
                                            bArr = df9Var.c;
                                            str7 = df9Var.a;
                                            if (uuid2.equals(pe9.b)) {
                                                it8 it8Var15 = ndz0Var.i;
                                                String str119 = df9Var.a;
                                                it8.m(it8Var15, str119, "read_success", (Integer) concurrentHashMap8.get(str119), (String) null, (String) null, eqq.m(str2, uuid2), 24);
                                                subject.onNext(new xf9(str7, uuid2, bArr));
                                            } else if (bArr.length == 8) {
                                                ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(bArr);
                                                byteBufferWrap3.order(ByteOrder.LITTLE_ENDIAN);
                                                j = byteBufferWrap3.getLong();
                                                fi9VarArrValues = fi9.values();
                                                length = fi9VarArrValues.length;
                                                while (true) {
                                                    if (i < length) {
                                                        fi9Var7 = null;
                                                        break;
                                                    }
                                                    fi9Var8 = fi9VarArrValues[i];
                                                    if (fi9Var8.a == j) {
                                                        fi9Var7 = fi9Var8;
                                                        break;
                                                    }
                                                    i++;
                                                }
                                                if (fi9Var7 == null) {
                                                    fi9Var7 = fi9Var;
                                                }
                                                concurrentHashMap2.put(str7, fi9Var7);
                                                subject.onNext(new fg9(str7, fi9Var7));
                                            } else {
                                                subject.onNext(new fg9(str7, fi9Var));
                                            }
                                        } else {
                                            fi9Var2 = fi9Var;
                                            str3 = str2;
                                            concurrentHashMap3 = concurrentHashMap2;
                                            if (df9Var2 instanceof cf9) {
                                                cf9Var = (cf9) df9Var2;
                                                uuid = cf9Var.b;
                                                i3 = cf9Var.c;
                                                str6 = cf9Var.a;
                                                if (uuid.equals(pe9.b)) {
                                                    subject.onNext(new fg9(str6, fi9Var2));
                                                } else {
                                                    it8 it8Var16 = ndz0Var.i;
                                                    String str1110 = cf9Var.a;
                                                    it8.m(it8Var16, str1110, "read_failure", (Integer) concurrentHashMap8.get(str1110), (String) null, f4i1.c(i3, str), eqq.m(str3, uuid), 8);
                                                    jg9 jg9Var5 = new jg9(i3);
                                                    fi9Var5 = (fi9) concurrentHashMap3.get(str6);
                                                    if (fi9Var5 == null) {
                                                        fi9Var6 = fi9Var2;
                                                    } else {
                                                        fi9Var6 = fi9Var5;
                                                    }
                                                    subject.onNext(new wf9(str6, uuid, jg9Var5, fi9Var6));
                                                }
                                            } else {
                                                str4 = str;
                                                if (z4) {
                                                    ff9 ff9Var4 = (ff9) df9Var2;
                                                    it8 it8Var17 = ndz0Var.i;
                                                    String str1111 = ff9Var4.a;
                                                    Integer num6 = (Integer) concurrentHashMap8.get(str1111);
                                                    UUID uuid9 = ff9Var4.b;
                                                    it8.m(it8Var17, str1111, "write_success", num6, (String) null, (String) null, eqq.m(str3, uuid9), 24);
                                                    subject.onNext(new ag9(ff9Var4.a, uuid9));
                                                } else if (df9Var2 instanceof ef9) {
                                                    ef9 ef9Var4 = (ef9) df9Var2;
                                                    it8 it8Var18 = ndz0Var.i;
                                                    String str1112 = ef9Var4.a;
                                                    Integer num7 = (Integer) concurrentHashMap8.get(str1112);
                                                    int i12 = ef9Var4.c;
                                                    String strC3 = f4i1.c(i12, str4);
                                                    UUID uuid10 = ef9Var4.b;
                                                    it8.m(it8Var18, str1112, "write_failure", num7, (String) null, strC3, eqq.m(str3, uuid10), 8);
                                                    jg9 jg9Var6 = new jg9(i12);
                                                    String str1113 = ef9Var4.a;
                                                    fi9Var3 = (fi9) concurrentHashMap3.get(str1113);
                                                    if (fi9Var3 == null) {
                                                        fi9Var4 = fi9Var2;
                                                    } else {
                                                        fi9Var4 = fi9Var3;
                                                    }
                                                    subject.onNext(new yf9(str1113, uuid10, jg9Var6, fi9Var4));
                                                } else if (df9Var2 instanceof lf9) {
                                                    lf9 lf9Var3 = (lf9) df9Var2;
                                                    str5 = lf9Var3.a;
                                                    ai9Var = (ai9) concurrentHashMap7.get(str5);
                                                    if (ai9Var != null) {
                                                        bluetoothGattServiceB = ai9Var.b();
                                                        if (bluetoothGattServiceB != null) {
                                                            ndz0Var.j(str5);
                                                        } else {
                                                            ndz0Var.j(str5);
                                                        }
                                                    }
                                                } else {
                                                    if (df9Var2 instanceof kf9) {
                                                        eg.o();
                                                        return null;
                                                    }
                                                    kf9 kf9Var3 = (kf9) df9Var2;
                                                    it8 it8Var19 = ndz0Var.i;
                                                    String str25 = kf9Var3.a;
                                                    it8.m(it8Var19, str25, "rssi_read_failed", (Integer) concurrentHashMap8.get(str25), (String) null, f4i1.c(kf9Var3.b, "status="), (String) null, 40);
                                                    ((lh9) ynb0Var.get()).a(kf9Var3.a);
                                                }
                                            }
                                        }
                                        ((lh9) ndz0Var.e.get()).c(df9Var2);
                                    }
                                }
                                String str26 = (String) mmr0Var2.a;
                                uuid3 = (UUID) mmr0Var2.b;
                                edz0Var = (edz0) concurrentHashMap6.get(str26);
                                if (edz0Var != null) {
                                    cdz0Var = (cdz0) edz0Var.c.get();
                                } else {
                                    cdz0Var = null;
                                }
                                if (u890.j(uuid3, pe9.b)) {
                                    if (edz0Var == null) {
                                        i = 0;
                                    } else {
                                        i = 0;
                                    }
                                    i2 = i;
                                } else {
                                    if (edz0Var == null) {
                                        i = 0;
                                    } else {
                                        i = 0;
                                    }
                                    i2 = i;
                                }
                                if (i2 != 0) {
                                    if (z3) {
                                        str11 = ((hf9) df9Var2).a;
                                        if (ndz0Var.o(str11)) {
                                            ndz0Var.l(str11);
                                        }
                                    } else if (df9Var2 instanceof gf9) {
                                        gf9 gf9Var4 = (gf9) df9Var2;
                                        str10 = gf9Var4.a;
                                        concurrentHashMap9.remove(str10);
                                        concurrentHashMap6.remove(str10);
                                        it8.m(ndz0Var.i, str10, "connection_failed", (Integer) concurrentHashMap8.get(str10), (String) null, f4i1.c(gf9Var4.b, "status="), (String) null, 40);
                                        subject.onNext(new dg9(str10));
                                        if (concurrentHashMap.keySet().contains(str10)) {
                                            ndz0Var.h(str10);
                                        } else if (concurrentHashMap7.keySet().contains(str10)) {
                                            ndz0Var.k(new yg9(str10));
                                        }
                                    } else if (df9Var2 instanceof if9) {
                                        str9 = ((if9) df9Var2).a;
                                        concurrentHashMap9.remove(str9);
                                        concurrentHashMap6.remove(str9);
                                        it8.m(ndz0Var.i, str9, "disconnected", (Integer) concurrentHashMap8.get(str9), (String) null, (String) null, (String) null, 56);
                                        subject.onNext(new dg9(str9));
                                        if (concurrentHashMap.keySet().contains(str9)) {
                                            ndz0Var.h(str9);
                                        } else if (concurrentHashMap7.keySet().contains(str9)) {
                                            ndz0Var.k(new yg9(str9));
                                        }
                                    } else if (df9Var2 instanceof jf9) {
                                        jf9 jf9Var4 = (jf9) df9Var2;
                                        str8 = jf9Var4.a;
                                        i4 = jf9Var4.b;
                                        i5 = jf9Var4.c;
                                        it8Var = ndz0Var.i;
                                        if (i5 == 0) {
                                            it8.m(it8Var, str8, "mtu_changed", (Integer) concurrentHashMap8.get(str8), (String) null, (String) null, f4i1.c(i4, "negotiatedMtu="), 24);
                                        } else {
                                            it8.m(it8Var, str8, "mtu_request_failed", (Integer) concurrentHashMap8.get(str8), (String) null, f4i1.c(i5, "status="), f4i1.c(i4, "mtu="), 8);
                                        }
                                        ndz0Var.j.b(((Number) ni9Var.b.b()).intValue(), i4, i5, str8);
                                        ndz0Var.k(new ch9(str8));
                                    } else if (df9Var2 instanceof of9) {
                                        of9Var = (of9) df9Var2;
                                        String str1114 = of9Var.a;
                                        it8.m(ndz0Var.i, str1114, "services_discovered", (Integer) concurrentHashMap8.get(str1114), (String) null, (String) null, (String) null, 56);
                                        ai9Var2 = (ai9) concurrentHashMap7.get(str1114);
                                        if (ai9Var2 != null) {
                                            bluetoothGattServiceB2 = ai9Var2.b();
                                            if (bluetoothGattServiceB2 != null) {
                                                ndz0Var.j(of9Var.a);
                                            } else {
                                                ndz0Var.j(of9Var.a);
                                            }
                                        }
                                    } else if (df9Var2 instanceof nf9) {
                                        nf9 nf9Var4 = (nf9) df9Var2;
                                        it8 it8Var110 = ndz0Var.i;
                                        String str1115 = nf9Var4.a;
                                        it8.m(it8Var110, str1115, "services_discovery_failed", (Integer) concurrentHashMap8.get(str1115), (String) null, (String) null, (String) null, 56);
                                        ndz0Var.j(nf9Var4.a);
                                    } else if (df9Var2 instanceof mf9) {
                                        ndz0Var.j(((mf9) df9Var2).a);
                                    } else if (z) {
                                        df9Var = df9Var2;
                                        uuid2 = df9Var.b;
                                        bArr = df9Var.c;
                                        str7 = df9Var.a;
                                        if (uuid2.equals(pe9.b)) {
                                            it8 it8Var111 = ndz0Var.i;
                                            String str1116 = df9Var.a;
                                            it8.m(it8Var111, str1116, "read_success", (Integer) concurrentHashMap8.get(str1116), (String) null, (String) null, eqq.m(str2, uuid2), 24);
                                            subject.onNext(new xf9(str7, uuid2, bArr));
                                        } else if (bArr.length == 8) {
                                            ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(bArr);
                                            byteBufferWrap4.order(ByteOrder.LITTLE_ENDIAN);
                                            j = byteBufferWrap4.getLong();
                                            fi9VarArrValues = fi9.values();
                                            length = fi9VarArrValues.length;
                                            while (true) {
                                                if (i < length) {
                                                    fi9Var7 = null;
                                                    break;
                                                }
                                                fi9Var8 = fi9VarArrValues[i];
                                                if (fi9Var8.a == j) {
                                                    fi9Var7 = fi9Var8;
                                                    break;
                                                }
                                                i++;
                                            }
                                            if (fi9Var7 == null) {
                                                fi9Var7 = fi9Var;
                                            }
                                            concurrentHashMap2.put(str7, fi9Var7);
                                            subject.onNext(new fg9(str7, fi9Var7));
                                        } else {
                                            subject.onNext(new fg9(str7, fi9Var));
                                        }
                                    } else {
                                        fi9Var2 = fi9Var;
                                        str3 = str2;
                                        concurrentHashMap3 = concurrentHashMap2;
                                        if (df9Var2 instanceof cf9) {
                                            cf9Var = (cf9) df9Var2;
                                            uuid = cf9Var.b;
                                            i3 = cf9Var.c;
                                            str6 = cf9Var.a;
                                            if (uuid.equals(pe9.b)) {
                                                subject.onNext(new fg9(str6, fi9Var2));
                                            } else {
                                                it8 it8Var112 = ndz0Var.i;
                                                String str1117 = cf9Var.a;
                                                it8.m(it8Var112, str1117, "read_failure", (Integer) concurrentHashMap8.get(str1117), (String) null, f4i1.c(i3, str), eqq.m(str3, uuid), 8);
                                                jg9 jg9Var7 = new jg9(i3);
                                                fi9Var5 = (fi9) concurrentHashMap3.get(str6);
                                                if (fi9Var5 == null) {
                                                    fi9Var6 = fi9Var2;
                                                } else {
                                                    fi9Var6 = fi9Var5;
                                                }
                                                subject.onNext(new wf9(str6, uuid, jg9Var7, fi9Var6));
                                            }
                                        } else {
                                            str4 = str;
                                            if (z4) {
                                                ff9 ff9Var5 = (ff9) df9Var2;
                                                it8 it8Var113 = ndz0Var.i;
                                                String str1118 = ff9Var5.a;
                                                Integer num8 = (Integer) concurrentHashMap8.get(str1118);
                                                UUID uuid11 = ff9Var5.b;
                                                it8.m(it8Var113, str1118, "write_success", num8, (String) null, (String) null, eqq.m(str3, uuid11), 24);
                                                subject.onNext(new ag9(ff9Var5.a, uuid11));
                                            } else if (df9Var2 instanceof ef9) {
                                                ef9 ef9Var5 = (ef9) df9Var2;
                                                it8 it8Var114 = ndz0Var.i;
                                                String str1119 = ef9Var5.a;
                                                Integer num9 = (Integer) concurrentHashMap8.get(str1119);
                                                int i13 = ef9Var5.c;
                                                String strC4 = f4i1.c(i13, str4);
                                                UUID uuid12 = ef9Var5.b;
                                                it8.m(it8Var114, str1119, "write_failure", num9, (String) null, strC4, eqq.m(str3, uuid12), 8);
                                                jg9 jg9Var8 = new jg9(i13);
                                                String str11110 = ef9Var5.a;
                                                fi9Var3 = (fi9) concurrentHashMap3.get(str11110);
                                                if (fi9Var3 == null) {
                                                    fi9Var4 = fi9Var2;
                                                } else {
                                                    fi9Var4 = fi9Var3;
                                                }
                                                subject.onNext(new yf9(str11110, uuid12, jg9Var8, fi9Var4));
                                            } else if (df9Var2 instanceof lf9) {
                                                lf9 lf9Var4 = (lf9) df9Var2;
                                                str5 = lf9Var4.a;
                                                ai9Var = (ai9) concurrentHashMap7.get(str5);
                                                if (ai9Var != null) {
                                                    bluetoothGattServiceB = ai9Var.b();
                                                    if (bluetoothGattServiceB != null) {
                                                        ndz0Var.j(str5);
                                                    } else {
                                                        ndz0Var.j(str5);
                                                    }
                                                }
                                            } else {
                                                if (df9Var2 instanceof kf9) {
                                                    eg.o();
                                                    return null;
                                                }
                                                kf9 kf9Var4 = (kf9) df9Var2;
                                                it8 it8Var115 = ndz0Var.i;
                                                String str27 = kf9Var4.a;
                                                it8.m(it8Var115, str27, "rssi_read_failed", (Integer) concurrentHashMap8.get(str27), (String) null, f4i1.c(kf9Var4.b, "status="), (String) null, 40);
                                                ((lh9) ynb0Var.get()).a(kf9Var4.a);
                                            }
                                        }
                                    }
                                    ((lh9) ndz0Var.e.get()).c(df9Var2);
                                }
                            }
                        }
                    }
                }
            }
        }
        return rih1.a;
    }

    private final Object d(Object obj) {
        String str = (String) obj;
        yix0 yix0Var = (yix0) this.b;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        lt20 lt20Var = new lt20(new jak(new fu20(yoi1.g(yix0Var.a(yon1.E4()).a(Collections.singleton(str))), new b201((kv01) this.c, null, (byte) 17), (byte) 1), str, (byte) 1), new rd0(str, (lnm) null, (byte) 4), (byte) 0);
        return ((vh4) this.d).a() ? new ht20(lt20Var, new nw5(2, (lnm) null, (byte) 26)) : lt20Var;
    }

    private final Object e(Object obj) throws Throwable {
        jy21 jy21Var = (jy21) obj;
        String str = (String) this.d;
        String str2 = (String) this.c;
        x711 x711Var = (x711) this.b;
        if (jy21Var instanceof gy21) {
            x711Var.b.b(6);
            return new r231(str2, str);
        }
        if (jy21Var instanceof cy21) {
            x711Var.b.b(7);
            return new o231(str2, str);
        }
        if (!(jy21Var instanceof hy21)) {
            throw new Throwable(jy21Var.b());
        }
        x711Var.b.b(8);
        return new a331(str2, str);
    }

    private final Object f(Object obj) {
        wc11 wc11Var = (wc11) obj;
        xk00 xk00Var = (xk00) this.d;
        g0y0 g0y0Var = (g0y0) this.b;
        w460 w460Var = new w460(false, (kl9) null, new yc11(xk00Var, wc11Var, g0y0Var), 25);
        k47 k47Var = new k47((gd11) this.c);
        cd11 cd11Var = wc11Var.c;
        String str = cd11Var.b;
        smc0 smc0VarN = k4p1.n();
        x360 x360Var = wc11Var.d;
        hvl1 hvl1Var = x360Var instanceof hvl1 ? (hvl1) x360Var : null;
        if (hvl1Var != null) {
            smc0VarN.add(new hg51(w460Var, tho1.v(hvl1.c(hvl1Var, 127)), ((uk00) g0y0Var.c).b));
        }
        smc0VarN.add(new hg51(k47Var, cd11Var, 0));
        return new ig51(str, k4p1.k(smc0VarN), new ziz0((Object) wc11Var, (byte) 18));
    }

    private final Object g(Object obj) {
        x621 x621Var = (x621) this.b;
        String str = (String) this.c;
        d4v0 d4v0Var = new d4v0(x621Var, (String) this.d, str, (byte) 19);
        dg30 dg30Var = x621Var.b;
        String string = dg30Var.getString(2131961135);
        String string2 = dg30Var.getString(2131961134);
        mw40 mw40VarT = yoi1.T(dg30Var, dg30Var.getString(2131961136, str), dg30Var.getString(2131961133));
        oad oadVar = new oad(d4v0Var, (byte) 28);
        mw40VarT.a = string;
        mw40VarT.c = oadVar;
        k6b k6bVar = k6b.X;
        mw40VarT.b = string2;
        mw40VarT.d = k6bVar;
        mw40VarT.b().b();
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.lnm */
    public final Object invoke(Object obj) throws lnm {
        axv0 axv0Var;
        bpb1 huzVar;
        x010 x010VarI;
        float f;
        ArrayList arrayList;
        float f2;
        byte b = this.a;
        byte b2 = 28;
        byte b3 = 27;
        byte b4 = 18;
        char c = 2;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                qzu0 qzu0Var = (qzu0) obj4;
                return (k0i) ((vu30) obj).invoke(qzu0Var.k0, new pcp0(qzu0Var, (gzu0) obj3, (k0i) obj2, (byte) 27));
            case 1:
                g4v0 g4v0Var = (g4v0) obj4;
                d0r d0rVar = (d0r) obj3;
                return cso1.y(f6o1.A(new xzq(g4v0Var.c.a(d0rVar), svu0.Y0), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), d3p1.F(d0rVar, g4v0Var.l, (String) obj2), fnt0.a1);
            case 2:
                zhv0 zhv0Var = (biv0) obj;
                vhv0 vhv0Var = (vhv0) obj2;
                o0i o0iVar = (o0i) obj4;
                xhv0 xhv0Var = (xhv0) obj3;
                i8h1 i8h1Var = xhv0Var.h;
                bcl1 bcl1Var = xhv0Var.d;
                if (zhv0Var instanceof zhv0) {
                    fn31.T(o0iVar.a, (o8n) null, 0, new du2(xhv0Var, o0iVar, vhv0Var, zhv0Var.a.b == qk1.b, (lnm) null, (byte) 9), 3);
                    return rih1Var;
                }
                if (zhv0Var.equals(aiv0.a)) {
                    return rih1Var;
                }
                if (zhv0Var.equals(aiv0.b)) {
                    xhv0Var.e.a(vhv0Var.a, bcl1.f(xhv0Var.d, o0iVar.e, "prerelease_card", (String) null, vhv0Var.i, new n5u0(vhv0Var, (byte) 24), 4), (Bundle) null);
                    return rih1Var;
                }
                if (zhv0Var.equals(aiv0.c)) {
                    r6h1 r6h1VarB = bcl1Var.i(o0iVar.e).b();
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-prerelease-page-early-access-upsell";
                    x6h1VarI.f = "1.0.0";
                    x6h1VarI.g = "22.0.0";
                    y6h1 y6h1VarA = x6h1VarI.a();
                    bbm bbmVar = xhv0Var.f;
                    x6h1 x6h1VarC = y6h1VarA.c();
                    x6h1VarC.i.add(new a7h1("early_access_upsell", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    bbmVar.a.a(bbm.a(1), i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", bbm.a(1))), x6h1VarC.a(), r6h1VarB, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                    return rih1Var;
                }
                if (!zhv0Var.equals(aiv0.d)) {
                    eg.o();
                    return null;
                }
                r6h1 r6h1VarB2 = bcl1Var.i(o0iVar.e).b();
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-prerelease-page-early-access-upsell";
                x6h1VarI2.f = "1.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1 x6h1VarC2 = x6h1VarI2.a().c();
                x6h1VarC2.i.add(new a7h1("early_access_upsell", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA2;
                ((xjn) k7h1Var).b = r6h1VarB2;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1Var;
            case 3:
                ui8 ui8Var = (ui8) obj4;
                nx9 nx9Var = (nx9) obj3;
                pug pugVar = (pug) obj2;
                klm klmVar = ((wn41) obj).a;
                rcp0 rcp0Var = new rcp0(pugVar);
                vap0 vap0Var = new vap0(nx9Var, (byte) 27);
                vap0 vap0Var2 = new vap0(nx9Var, (byte) 28);
                wap0 wap0Var = new wap0(nx9Var, (byte) 1);
                kly0 kly0Var = (kly0) pugVar.q;
                io80 io80VarB = klmVar.b("SessionService", new kx70(rcp0Var, vap0Var, vap0Var2, wap0Var, new qcp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13), new sap0(ui8Var, (byte) 11), new sap0(ui8Var, (byte) 12), (byte) 13));
                io80 io80VarB2 = klmVar.b("UserDirectoryService", new ocp0(new hbp0(io80VarB, (byte) 12), new qcp0(0, (kly0) pugVar.r, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14), (byte) 22));
                vap0 vap0Var3 = new vap0(nx9Var, (byte) 24);
                sap0 sap0Var = new sap0(ui8Var, (byte) 10);
                vap0 vap0Var4 = new vap0(nx9Var, (byte) 25);
                vap0 vap0Var5 = new vap0(nx9Var, (byte) 26);
                kly0 kly0Var2 = (kly0) pugVar.v;
                qcp0 qcp0Var = new qcp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 9);
                kly0 kly0Var3 = (kly0) pugVar.w;
                io80 io80VarB3 = klmVar.b("ConnectivitySessionService", new ang(new vap0(nx9Var, (byte) 12), new vap0(nx9Var, (byte) 13), new vap0(nx9Var, (byte) 14), new gcp0(0, (kly0) pugVar.a, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 19), new gcp0(0, (kly0) pugVar.h, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 20), new hbp0(io80VarB, (byte) 4), new hbp0(klmVar.b("PubSubSetupService", new kx70(vap0Var3, sap0Var, vap0Var4, vap0Var5, qcp0Var, new qcp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 10), new qcp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11), (byte) 11)), (byte) 5), new gcp0(0, (kly0) pugVar.c, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 21), new vap0(nx9Var, (byte) 15), (byte) 5));
                io80 io80VarB4 = klmVar.b("RemoteConfigNativeResolverService", new mcp0(new qcp0(0, (kly0) pugVar.d, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12), (byte) 8));
                qcp0 qcp0Var2 = new qcp0(0, (kly0) pugVar.e, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0);
                kly0 kly0Var4 = (kly0) pugVar.i;
                io80 io80VarInstallLocalFilesService = NucleusLocalFilesServiceInstallerKt.installLocalFilesService(klmVar, qcp0Var2, new qcp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1), new qcp0(0, (kly0) pugVar.f, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2));
                return new nlv0(io80VarB3, io80VarB, klmVar.b("CoreFullSessionService", new lbp0(new vap0(nx9Var, (byte) 17), new vap0(nx9Var, (byte) 19), new vap0(nx9Var, (byte) 20), new vap0(nx9Var, (byte) 21), new hbp0(io80VarB4, (byte) 9), new vap0(nx9Var, (byte) 22), new vap0(nx9Var, (byte) 23), new hbp0(io80VarB3, (byte) 10), new hbp0(io80VarB, (byte) 11), new vap0(nx9Var, (byte) 16), new hbp0(io80VarInstallLocalFilesService, (byte) 6), new hbp0(io80VarB2, (byte) 7), new gcp0(0, (kly0) pugVar.b, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 22), new hbp0(klmVar.b("PluginSupportService", new dy7(new qcp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3), new qcp0(0, (kly0) pugVar.k, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4), new qcp0(0, (kly0) pugVar.l, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5), new qcp0(0, (kly0) pugVar.m, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6), new qcp0(0, (kly0) pugVar.n, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7), new qcp0(0, (kly0) pugVar.s, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8), (byte) 26)), (byte) 8), new gcp0(0, (kly0) pugVar.j, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 23), new gcp0(0, (kly0) pugVar.o, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 24), new gcp0(0, (kly0) pugVar.t, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 25), new gcp0(0, (kly0) pugVar.u, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 26), new gcp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 27), new gcp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 28), new gcp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 29), new vap0(nx9Var, (byte) 18))), io80VarInstallLocalFilesService, io80VarB4, nx9Var, ui8Var);
            case 4:
                gnv0 gnv0Var = (gnv0) obj2;
                ((r1q0) obj4).a((iac0) obj3, gnv0Var);
                return new xwm0(gnv0Var, (byte) 9);
            case 5:
                u760 u760Var = (u760) obj;
                ((esv0) ((r8s) obj4).f).invoke(u760Var);
                uuv0 uuv0Var = ((fxv0) obj3).a.m;
                if (uuv0Var == null || !uuv0Var.a.equals(i760.a)) {
                    axv0Var = null;
                } else {
                    int iOrdinal = u760Var.ordinal();
                    if (iOrdinal == 0) {
                        axv0Var = dxv0.a;
                    } else {
                        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                            eg.o();
                            return null;
                        }
                        axv0Var = axv0.a;
                    }
                }
                if (axv0Var == null) {
                    return rih1Var;
                }
                ((iu30) obj2).invoke(axv0Var);
                return rih1Var;
            case 6:
                e8w0 e8w0Var = (e8w0) obj4;
                rtb0.b((rtb0) obj, e8w0Var.a.size(), new mwv0(e8w0Var, (byte) 6), new j2i(839450898, new gk0(e8w0Var, (smp0) obj3, (vu30) obj2, (byte) 22), true), 4);
                return rih1Var;
            case 7:
                hf2 hf2Var = (hf2) obj4;
                ubw0 ubw0Var = (ubw0) hf2Var.d;
                ht20 huzVar2 = (ubw0Var == null || (x010VarI = ubw0Var.i()) == null) ? new huz((Object) null, (byte) 10) : new ht20(hu20.e(x010VarI, new y3s(3, lnmVar)), new egv0(2, (lnm) null, (byte) 1));
                mr20 mr20Var = ((clm) obj3).a;
                mr20 mr20VarA = ((nwt) obj2).a();
                ubw0 ubw0Var2 = (ubw0) hf2Var.e;
                if (ubw0Var2 == null || (huzVar = ubw0Var2.c()) == null) {
                    huzVar = new huz(Boolean.FALSE, (byte) 10);
                }
                return h5p1.r(rqt0.t(mr20Var, u2m.t), rqt0.w(mr20VarA, p7w0.f, rqt0.b), rqt0.u(huzVar2), rqt0.u(huzVar), new f3(5, (lnm) null, (byte) 21));
            case 8:
                ofw0 ofw0Var = (ofw0) obj4;
                aru0 aru0Var = ofw0Var.k;
                ugn0 ugn0Var = ofw0Var.g;
                pdw0 pdw0Var = new pdw0(aru0Var, ugn0Var, ofw0Var.m, ofw0Var.l, ofw0Var.f, ofw0Var.n, ofw0Var.b, (zau0) obj3, ofw0Var.d, ofw0Var.e);
                MobiusLoop mobiusLoopG = Mobius.d(t7p0.j, pdw0Var).d(si10.e1).b(xi10.e1).g(new qfw0((sbw0) obj2, false, false, ugn0Var.a(), null, false, new sz20(false, false), q1o1.a, q1o1.b, false, false, false, null, null));
                mobiusLoopG.b(new y11(ofw0Var, b4));
                jqd0 jqd0Var = new jqd0(mobiusLoopG, pdw0Var);
                ofw0Var.r = jqd0Var;
                return new w9d0(ofw0Var, jqd0Var, (byte) 9);
            case 9:
                DrawScope drawScope = (DrawScope) obj;
                float fS = ((fc5) obj4).a.s();
                o8a o8aVar = (o8a) obj3;
                bw91 bw91Var = o8aVar.a;
                float fS2 = o8aVar.b.s();
                float f3 = 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) / 2.0f)) << 32);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) / drawScope.X0(180.0f);
                float fX0 = drawScope.X0(90.0f) * fIntBitsToFloat;
                float fX1 = drawScope.X0(8.0f) * fIntBitsToFloat;
                float fX2 = drawScope.X0(14.0f) * fIntBitsToFloat;
                float fX3 = drawScope.X0(32.0f) * fIntBitsToFloat;
                klz0 klz0Var = (klz0) obj2;
                ek60 ek60VarListIterator = bw91Var.listIterator();
                int i = 0;
                while (true) {
                    ek60 ek60Var = ek60VarListIterator;
                    if (!ek60Var.hasNext()) {
                        float f4 = f3;
                        long j = jFloatToRawIntBits;
                        float fX4 = drawScope.X0(96.0f) * fIntBitsToFloat;
                        DrawScope.i1(drawScope, u7h.b(klz0Var.a.c, 0.4f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 360.0f, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.j() >> 32)) - fX4) / f4)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fX4) / f4)) & 4294967295L), (((long) Float.floatToRawIntBits(fX4)) << 32) | (((long) Float.floatToRawIntBits(fX4)) & 4294967295L), new phc1(drawScope.X0(4.0f), 0.0f, 2, 0, (uw4) null, 26), 832);
                        float fX5 = drawScope.X0(4.0f);
                        float fX6 = drawScope.X0(8.0f);
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j & 4294967295L));
                        tw4 tw4VarA = ww4.a();
                        if (fS > 0.0f) {
                            float f5 = fX4 / f4;
                            float f6 = (float) (((double) fS) * 6.283185307179586d);
                            float f7 = fX6 - fX5;
                            float f8 = (f7 * fS) + fX5;
                            int iMax = (int) Math.max(f4, (float) Math.floor(fS * 100.0f));
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            if (iMax >= 0) {
                                int i2 = 0;
                                while (true) {
                                    f2 = 1.5707964f;
                                    float f9 = (i2 * f6) / iMax;
                                    float f10 = (((f9 / 6.2831855f) * f7) + fX5) / 2.0f;
                                    float f11 = f5 + f10;
                                    float f12 = f5 - f10;
                                    double d = f9 - 1.5707964f;
                                    f = f5;
                                    float f13 = fX5;
                                    float fCos = (((float) Math.cos(d)) * f11) + fIntBitsToFloat2;
                                    float fSin = (f11 * ((float) Math.sin(d))) + fIntBitsToFloat3;
                                    float fCos2 = (((float) Math.cos(d)) * f12) + fIntBitsToFloat2;
                                    float fSin2 = (f12 * ((float) Math.sin(d))) + fIntBitsToFloat3;
                                    Offset offset = new Offset((((long) Float.floatToRawIntBits(fSin)) & 4294967295L) | (((long) Float.floatToRawIntBits(fCos)) << 32));
                                    arrayList = arrayList2;
                                    arrayList.add(offset);
                                    float f14 = f7;
                                    arrayList3.add(new Offset((((long) Float.floatToRawIntBits(fSin2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fCos2)) << 32)));
                                    if (i2 != iMax) {
                                        i2++;
                                        f7 = f14;
                                        arrayList2 = arrayList;
                                        fX5 = f13;
                                        f5 = f;
                                    }
                                }
                            } else {
                                f = f5;
                                arrayList = arrayList2;
                                f2 = 1.5707964f;
                            }
                            tw4VarA.k(Float.intBitsToFloat((int) (((Offset) arrayList.get(0)).a >> 32)), Float.intBitsToFloat((int) (((Offset) arrayList.get(0)).a & 4294967295L)));
                            int size = arrayList.size();
                            for (int i3 = 1; i3 < size; i3++) {
                                tw4VarA.j(Float.intBitsToFloat((int) (((Offset) arrayList.get(i3)).a >> 32)), Float.intBitsToFloat((int) (((Offset) arrayList.get(i3)).a & 4294967295L)));
                            }
                            float f15 = f8 / 2.0f;
                            double d2 = f6 - f2;
                            float fCos3 = (((float) Math.cos(d2)) * f) + fIntBitsToFloat2;
                            float fSin3 = (((float) Math.sin(d2)) * f) + fIntBitsToFloat3;
                            float f16 = fCos3 - f15;
                            float f17 = fSin3 - f15;
                            float f18 = fCos3 + f15;
                            float f19 = fSin3 + f15;
                            float degrees = (float) Math.toDegrees(d2);
                            RectF rectF = tw4VarA.b;
                            if (rectF == null) {
                                rectF = new RectF();
                                tw4VarA.b = rectF;
                            }
                            rectF.set(f16, f17, f18, f19);
                            Path path = tw4VarA.a;
                            RectF rectF2 = tw4VarA.b;
                            rectF2.getClass();
                            path.arcTo(rectF2, degrees, 180.0f, false);
                            for (int size2 = arrayList3.size() - 2; -1 < size2; size2--) {
                                tw4VarA.j(Float.intBitsToFloat((int) (((Offset) arrayList3.get(size2)).a >> 32)), Float.intBitsToFloat((int) (((Offset) arrayList3.get(size2)).a & 4294967295L)));
                            }
                            tw4VarA.g();
                        }
                        DrawScope.w0(drawScope, tw4VarA, klz0Var.a.c, z520.a, 52);
                        return rih1Var;
                    }
                    Object next = ek60Var.next();
                    int i4 = i + 1;
                    if (i < 0) {
                        lnm lnmVar2 = lnmVar;
                        p7h.T();
                        throw lnmVar2;
                    }
                    float fFloatValue = (((fX3 - fX2) * ((Number) next).floatValue()) + fX2) / f3;
                    float f20 = fX0 - fFloatValue;
                    float f21 = fX0 + fFloatValue;
                    char c2 = c;
                    int i5 = (int) (jFloatToRawIntBits >> 32);
                    lnm lnmVar3 = lnmVar;
                    double d3 = (((i * f3) * 3.1415927f) / 24.0f) - 1.5707964f;
                    float f22 = fX0;
                    float f23 = f3;
                    long j2 = jFloatToRawIntBits;
                    int i6 = (int) (j2 & 4294967295L);
                    DrawScope.p0(drawScope, u7h.b(klz0Var.a.e, fS2, 0.0f, 0.0f, 0.0f, 14), (((long) Float.floatToRawIntBits((((float) Math.cos(d3)) * f20) + Float.intBitsToFloat(i5))) << 32) | (((long) Float.floatToRawIntBits((f20 * ((float) Math.sin(d3))) + Float.intBitsToFloat(i6))) & 4294967295L), (((long) Float.floatToRawIntBits((((float) Math.cos(d3)) * f21) + Float.intBitsToFloat(i5))) << 32) | (((long) Float.floatToRawIntBits((f21 * ((float) Math.sin(d3))) + Float.intBitsToFloat(i6))) & 4294967295L), fX1, 1, (uw4) null, 480);
                    fS2 = fS2;
                    f3 = f23;
                    i = i4;
                    c = c2;
                    lnmVar = lnmVar3;
                    fX0 = f22;
                    jFloatToRawIntBits = j2;
                    fX2 = fX2;
                }
                break;
            case 10:
                l2u0 l2u0Var = (l2u0) obj4;
                ((iu30) obj3).invoke(Long.valueOf((long) (((Number) obj).floatValue() * (l2u0Var != null ? l2u0Var.c : 0L))));
                ((ven0) obj2).setValue((Object) null);
                return rih1Var;
            case 11:
                ((qtr) obj).b(new qmx0((lzn0) obj4, (vgm) obj3, (l0x0) obj2, (lnm) null));
                return rih1Var;
            case 12:
                return hu20.e(rqt0.u(new x010(rqt0.u(new f5y0((x72) obj4, (me30) obj2, (byte) 1)), (mt) obj3, new lok0(3, (lnm) null, (byte) 21), (byte) 1)), new svr(3, (lnm) null));
            case 13:
                rnz rnzVarN = EsIdentFilter.IdentFilter.n();
                String str = (String) obj4;
                rnzVarN.n(str);
                return new lt20(new sr0(new h5y0(((omy0) obj).callStream("spotify.connectivity.pubsub.esperanto.proto.PubSub", "addOnPushedMessageForIdentFilter", rnzVarN.build()), (byte) 3), (lmy0) obj3, str, (iu30) obj2, (byte) 21), new kn1(str, (lnm) null, (byte) 4), (byte) 0);
            case 14:
                ((ohd) obj3).resumeWith(fn31.q((c9n) obj4, (o8n) null, 0, new pew0((QuasarWorker) obj2, obj, lnmVar, (byte) 23), 3));
                return rih1Var;
            case 15:
                return a(obj);
            case 16:
                rtb0 rtb0Var = (rtb0) obj;
                rtb0.c(rtb0Var, "header", yaj.a, 2);
                c380 c380Var = (c380) obj4;
                rtb0Var.e(c380Var.size(), new iio0(c380Var, (byte) 15), new iio0(c380Var, (byte) 16), new j2i(802480018, new rf1((byte) 26, obj3, obj2, (List) c380Var), true));
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                c380 c380Var2 = (c380) obj4;
                ((rtb0) obj).e(c380Var2.size(), (iu30) null, new iio0(c380Var2, (byte) 18), new j2i(802480018, new rf1((List) c380Var2, obj3, (iu30) obj2, b3), true));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                rtb0 rtb0Var2 = (rtb0) obj;
                l201 l201Var = (l201) obj4;
                int size3 = l201Var.a.a.a.size();
                boolean z = l201Var.b != null;
                phi0 phi0Var = (phi0) obj3;
                rtb0.b(rtb0Var2, z ? size3 + 1 : size3, new gu2(size3, phi0Var, l201Var, (byte) 29), new j2i(1460703701, new hm80(z, size3, phi0Var, l201Var, (iu30) obj2), true), 4);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                w201 w201Var = (w201) obj4;
                List list = w201Var.a;
                ((rtb0) obj).e(list.size(), (iu30) null, new iio0(list, (byte) 19), new j2i(2039820996, new oi1(list, w201Var, (ss50) obj3, (iu30) obj2, (byte) 12), true));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ArrayList arrayList4 = (ArrayList) obj4;
                ((rtb0) obj).e(arrayList4.size(), (iu30) null, new qbb0(arrayList4, (byte) 22), new j2i(802480018, new rf1(arrayList4, (n0v0) obj3, (iu30) obj2, b2), true));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                b261.n((e261) obj, ((w501) obj4).c ? (String) obj3 : (String) obj2);
                return rih1Var;
            case 22:
                int iOrdinal2 = ((fwb) obj).ordinal();
                if (iOrdinal2 == 0) {
                    ((td01) obj2).a.m((Object) null, Boolean.TRUE);
                } else if (iOrdinal2 == 1) {
                    ((gc01) obj3).a.m((Object) null, Boolean.TRUE);
                } else if (iOrdinal2 == 2) {
                    ((qe01) obj4).h.m((Object) null, Boolean.TRUE);
                }
                return rih1Var;
            case 23:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, ((rj01) obj4).t);
                String str2 = (String) obj3;
                if (str2 != null) {
                    b261.g(e261Var, str2, new lpx0((Function0) obj2, (byte) 22));
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                qzh qzhVar = (qzh) obj4;
                qzhVar.n(new ijp0((Function0) obj3, (Function0) obj2, (byte) 1));
                View view = qzhVar.getView();
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return view;
            case 25:
                return d(obj);
            case 26:
                return e(obj);
            case 27:
                return f(obj);
            case 28:
                return g(obj);
            default:
                u721 u721Var = ((y621) obj4).a;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                View view2 = u721Var.c;
                if (view2 != null) {
                    ViewParent parent = view2.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(view2);
                    }
                }
                u721Var.c = null;
                View composeView = new ComposeView(u721Var.a, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                u721Var.c = composeView;
                op80 jp80Var = new jp80(new it1(composeView, (byte) 2));
                op80 eq80Var = new eq80(bco0.a);
                op80 wchVar = q6x.b;
                if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
                    jp80Var = wchVar;
                } else if (jp80Var.equals(wchVar)) {
                    jp80Var = eq80Var;
                } else if (!eq80Var.equals(wchVar)) {
                    wchVar = new wch(jp80Var, eq80Var);
                    jp80Var = wchVar;
                }
                xhk1.c(composeView, jp80Var);
                composeView.setContent(new j2i(-962687658, new pby0(composeView, str3, str4, u721Var, (byte) 14), true));
                ((ViewGroup) u721Var.a.findViewById(R.id.content)).addView(composeView);
                return rih1Var;
        }
    }
}
