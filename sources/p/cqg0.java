package p;

import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.offline_esperanto.proto.EsOffline$Context;
import com.spotify.offline_esperanto.proto.EsOffline$ContextInfo;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsResponse;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class cqg0 {
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    public static final ept a(EsOffline.Device device) {
        bpt bptVar;
        String name = device.getName();
        if (name.length() == 0) {
            String clientId = device.getClientId();
            int iHashCode = clientId.hashCode();
            if (iHashCode != -1914237170) {
                if (iHashCode != -542408173) {
                    if (iHashCode == -218043280 && clientId.equals("8625198a5ee54c7aa603cd4714d3e639")) {
                        name = "Mighty";
                    } else {
                        name = "";
                    }
                } else if (clientId.equals("88197451c42e4c5d96b00be2e4e30713")) {
                    name = "Samsung Galaxy Watch";
                } else {
                    name = "";
                }
            } else if (clientId.equals("0f053e0244a44e94933c24a5d99b4ef7")) {
                name = "Garmin";
            } else {
                name = "";
            }
        }
        int iT = device.t();
        bpt bptVar2 = bpt.d;
        bpt bptVar3 = bpt.g;
        if (iT != 0) {
            if (iT == 1) {
                bptVar2 = bpt.f;
            } else if (iT == 2) {
                bptVar2 = bpt.c;
            } else if (iT == 3) {
                bptVar2 = bpt.b;
            } else if (iT == 12) {
                bptVar2 = bpt.e;
            } else if (iT != 13) {
                bptVar = bptVar3;
            }
            bptVar = bptVar2;
        } else {
            String clientId2 = device.getClientId();
            if (clientId2 != null) {
                if ((r11 = clientId2.hashCode()) != -1914237170) {
                }
            }
            bptVar = bptVar3;
        }
        return new ept(name, bptVar, device.getDeviceId(), device.n(), device.s());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    public static final nvp0 b(EsOffline$GetContextsResponse esOffline$GetContextsResponse) {
        h290<EsOffline$ContextInfo> h290VarP = esOffline$GetContextsResponse.p();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
        for (EsOffline$ContextInfo esOffline$ContextInfo : h290VarP) {
            String uri = esOffline$ContextInfo.o().getUri();
            poz pozVarQ = esOffline$ContextInfo.o().q();
            int iOrdinal = pozVarQ.ordinal();
            int i = 1;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    i = 2;
                    if (iOrdinal == 2) {
                        i = 6;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            i = 5;
                        } else if (iOrdinal != 5) {
                            n57.e("Invalid availability string: " + pozVarQ);
                            i = 8;
                        } else {
                            i = 6;
                        }
                    }
                } else {
                    i = 8;
                }
            }
            arrayList.add(new mvp0(uri, i));
        }
        return new nvp0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023 A[PHI: r3
      0x0023: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:5:0x0013, B:7:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final rw21 c(EsOffline$Context esOffline$Context) {
        int iP = (int) esOffline$Context.p();
        int iOrdinal = esOffline$Context.q().ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            int i2 = 2;
            if (iOrdinal != 2) {
                i2 = 5;
                if (iOrdinal == 3) {
                    i = i2;
                } else if (iOrdinal == 4) {
                    i = 4;
                } else if (iOrdinal == 5) {
                    i = 3;
                }
            } else {
                i = i2;
            }
        } else {
            i = 6;
        }
        return new rw21(iP, i);
    }
}
