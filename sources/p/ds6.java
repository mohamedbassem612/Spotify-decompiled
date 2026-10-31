package p;

import android.content.Context;
import com.spotify.cosmos.util.proto.ArtistCollectionState;
import com.spotify.cosmos.util.proto.ArtistSyncState;
import java.util.Set;
import spotify.collection.esperanto.proto.CollectionArtist;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ds6 extends a8d1 implements vu30 {
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public byte S0;
    public /* synthetic */ Object T0;
    public final /* synthetic */ js6 U0;
    public final /* synthetic */ bm6 V0;
    public final /* synthetic */ lik1 W0;
    public vum1 X;
    public final /* synthetic */ String X0;
    public qrg1 Y;
    public final /* synthetic */ String Y0;
    public boolean Z;
    public s2t a;
    public l2t b;
    public l2t c;
    public l2t d;
    public l2t e;
    public l2t f;
    public l2t g;
    public l2t h;
    public l2t i;
    public CollectionArtist t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds6(js6 js6Var, bm6 bm6Var, lik1 lik1Var, String str, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.U0 = js6Var;
        this.V0 = bm6Var;
        this.W0 = lik1Var;
        this.X0 = str;
        this.Y0 = str2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        ds6 ds6Var = new ds6(this.U0, this.V0, this.W0, this.X0, this.Y0, lnmVar);
        ds6Var.T0 = obj;
        return ds6Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:121:0x0908  */
    /* JADX WARN: Code duplicated, block: B:124:0x0911  */
    /* JADX WARN: Code duplicated, block: B:126:0x0916  */
    /* JADX WARN: Code duplicated, block: B:128:0x091b  */
    /* JADX WARN: Code duplicated, block: B:129:0x091f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0930  */
    /* JADX WARN: Code duplicated, block: B:133:0x0933  */
    /* JADX WARN: Code duplicated, block: B:137:0x096b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0978  */
    /* JADX WARN: Code duplicated, block: B:142:0x097c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0985  */
    /* JADX WARN: Code duplicated, block: B:147:0x0994  */
    /* JADX WARN: Code duplicated, block: B:150:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:152:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:154:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:157:0x09d0  */
    /* JADX WARN: Code duplicated, block: B:159:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:162:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:165:0x0a00 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:171:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0a53 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x0a66  */
    /* JADX WARN: Code duplicated, block: B:184:0x0a7a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:195:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:198:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:200:0x0af7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x0b06  */
    /* JADX WARN: Code duplicated, block: B:24:0x027f  */
    /* JADX WARN: Code duplicated, block: B:28:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x0318  */
    /* JADX WARN: Code duplicated, block: B:40:0x0351  */
    /* JADX WARN: Code duplicated, block: B:44:0x038c  */
    /* JADX WARN: Code duplicated, block: B:48:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x043b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0458  */
    /* JADX WARN: Code duplicated, block: B:60:0x045b  */
    /* JADX WARN: Code duplicated, block: B:63:0x046e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0591  */
    /* JADX WARN: Code duplicated, block: B:66:0x0679  */
    /* JADX WARN: Code duplicated, block: B:69:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:71:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x0819  */
    /* JADX WARN: Code duplicated, block: B:81:0x0820 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x088f  */
    /* JADX WARN: Code duplicated, block: B:94:0x089b  */
    /* JADX WARN: Code duplicated, block: B:96:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:99:0x08ac  */
    public final Object invokeSuspend(Object obj) {
        s2t s2tVar;
        js6 js6Var;
        s2t s2tVarQ;
        l2t l2tVarQ;
        lik1 lik1Var;
        l2t l2tVarQ2;
        l2t l2tVarQ3;
        l2t l2tVarQ4;
        l2t l2tVar;
        Object objQ;
        d9n d9nVar;
        l2t l2tVar2;
        l2t l2tVar3;
        l2t l2tVar4;
        CollectionArtist collectionArtist;
        Object objE;
        l2t l2tVar5;
        l2t l2tVar6;
        l2t l2tVar7;
        l2t l2tVar8;
        l2t l2tVar9;
        l2t l2tVar10;
        CollectionArtist collectionArtist2;
        vum1 vum1Var;
        Object objE2;
        CollectionArtist collectionArtist3;
        vum1 vum1Var2;
        l2t l2tVar11;
        l2t l2tVar12;
        l2t l2tVar13;
        l2t l2tVar14;
        l2t l2tVar15;
        boolean zBooleanValue;
        Object objE3;
        vum1 vum1Var3;
        boolean z;
        l2t l2tVar16;
        l2t l2tVar17;
        l2t l2tVar18;
        CollectionArtist collectionArtist4;
        l2t l2tVar19;
        l2t l2tVar20;
        boolean zBooleanValue2;
        Object objE4;
        boolean z2;
        boolean z3;
        l2t l2tVar21;
        l2t l2tVar22;
        l2t l2tVar23;
        CollectionArtist collectionArtist5;
        vum1 vum1Var4;
        boolean zBooleanValue3;
        Object objE5;
        boolean z4;
        boolean z5;
        l2t l2tVar24;
        l2t l2tVar25;
        CollectionArtist collectionArtist6;
        vum1 vum1Var5;
        boolean z6;
        boolean zBooleanValue4;
        Object objE6;
        boolean z7;
        boolean z8;
        CollectionArtist collectionArtist7;
        vum1 vum1Var6;
        boolean z9;
        boolean z10;
        qrg1 qrg1Var;
        Object objE7;
        l2t l2tVar26;
        boolean zBooleanValue5;
        Object objE8;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        qrg1 qrg1Var2;
        CollectionArtist collectionArtist8;
        l2t l2tVar27;
        boolean zBooleanValue6;
        Object objE9;
        boolean z16;
        boolean z17;
        CollectionArtist collectionArtist9;
        qrg1 qrg1Var3;
        boolean z18;
        boolean z19;
        lik1 lik1Var2;
        s4b1 s4b1VarX;
        blc0 blc0Var;
        blc0 blc0Var2;
        boolean z20;
        m5q m5qVar;
        String link;
        blc0 blc0Var3;
        ks6 ks6Var;
        s4b1 s4b1Var;
        lik1 lik1Var3;
        String str;
        smc0 smc0VarN;
        bm6 bm6Var;
        String str2;
        ugo0 ugo0Var;
        p860 p860Var;
        boolean zJ;
        e2t0 e2t0Var;
        lik1 lik1Var4;
        jhm jhmVarS;
        boolean z21;
        ok51 ok51Var;
        qaa1 qaa1Var;
        blc0 blc0Var4;
        jhm jhmVarS2;
        ArtistCollectionState artistCollectionStateP;
        xwp0 xwp0VarO;
        boolean z22;
        umx umxVar;
        int i;
        hhm hhmVar;
        boolean followed;
        fux fuxVar;
        int i2;
        c9n c9nVar = (c9n) this.T0;
        byte b = this.S0;
        Object obj2 = null;
        lik1 lik1Var5 = this.W0;
        js6 js6Var2 = this.U0;
        d9n d9nVar2 = d9n.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                String str3 = this.X0;
                String str4 = this.Y0;
                wc5 wc5Var = new wc5(js6Var2, str3, str4, (lnm) null, (byte) 3);
                s2tVar = null;
                s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, wc5Var, 3);
                js6Var = js6Var2;
                s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new wc5(js6Var2, lik1Var5, str4, (lnm) null, (byte) 4), 3);
                l2t l2tVarQ5 = fn31.q(c9nVar, (o8n) null, 0, new cs6(js6Var, null, (byte) 5), 3);
                l2t l2tVarQ6 = fn31.q(c9nVar, (o8n) null, 0, new cs6(js6Var, null, (byte) 4), 3);
                l2t l2tVarQ7 = fn31.q(c9nVar, (o8n) null, 0, new cs6(js6Var, null, (byte) 3), 3);
                l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new cs6(js6Var, null, (byte) 0), 3);
                lik1Var = lik1Var5;
                l2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new cs6(js6Var, null, (byte) 1), 3);
                l2tVarQ3 = fn31.q(c9nVar, (o8n) null, 0, new cs6(js6Var, null, (byte) 2), 3);
                l2t l2tVarQ8 = fn31.q(c9nVar, (o8n) null, 0, new cs6(js6Var, null, (byte) 6), 3);
                l2tVarQ4 = fn31.q(c9nVar, (o8n) null, 0, new k96(js6Var, str4, (lnm) null, (byte) 4), 3);
                this.T0 = null;
                this.a = s2tVarQ;
                this.b = l2tVarQ5;
                this.c = l2tVarQ6;
                this.d = l2tVarQ7;
                this.e = l2tVarQ;
                this.f = l2tVarQ2;
                this.g = l2tVarQ3;
                l2tVar = l2tVarQ8;
                this.h = l2tVar;
                this.i = l2tVarQ4;
                this.S0 = (byte) 1;
                objQ = s2tVarQ2.Q(this);
                d9nVar = d9nVar2;
                if (objQ != d9nVar) {
                    l2tVar2 = l2tVarQ5;
                    l2tVar3 = l2tVarQ7;
                    l2tVar4 = l2tVarQ6;
                    collectionArtist = (CollectionArtist) objQ;
                    this.T0 = s2tVar;
                    this.a = s2tVar;
                    this.b = l2tVar2;
                    this.c = l2tVar4;
                    this.d = l2tVar3;
                    this.e = l2tVarQ;
                    this.f = l2tVarQ2;
                    this.g = l2tVarQ3;
                    this.h = l2tVar;
                    this.i = l2tVarQ4;
                    this.t = collectionArtist;
                    this.S0 = (byte) 2;
                    objE = s2tVarQ.E(this);
                    if (objE != d9nVar) {
                        l2tVar5 = l2tVar2;
                        l2tVar6 = l2tVarQ;
                        l2tVar7 = l2tVar3;
                        l2tVar8 = l2tVarQ3;
                        l2tVar9 = l2tVarQ2;
                        l2tVar10 = l2tVarQ4;
                        collectionArtist2 = collectionArtist;
                        vum1Var = (vum1) objE;
                        this.T0 = s2tVar;
                        this.a = s2tVar;
                        this.b = s2tVar;
                        this.c = l2tVar4;
                        this.d = l2tVar7;
                        this.e = l2tVar6;
                        this.f = l2tVar9;
                        this.g = l2tVar8;
                        this.h = l2tVar;
                        this.i = l2tVar10;
                        this.t = collectionArtist2;
                        this.X = vum1Var;
                        this.S0 = (byte) 3;
                        objE2 = l2tVar5.E(this);
                        if (objE2 != d9nVar) {
                            l2t l2tVar28 = l2tVar;
                            collectionArtist3 = collectionArtist2;
                            vum1Var2 = vum1Var;
                            l2tVar11 = l2tVar9;
                            l2tVar12 = l2tVar8;
                            l2tVar13 = l2tVar28;
                            l2tVar14 = l2tVar4;
                            l2tVar15 = l2tVar7;
                            zBooleanValue = ((Boolean) objE2).booleanValue();
                            this.T0 = s2tVar;
                            this.a = s2tVar;
                            this.b = s2tVar;
                            this.c = l2tVar14;
                            this.d = s2tVar;
                            this.e = l2tVar6;
                            this.f = l2tVar11;
                            this.g = l2tVar12;
                            this.h = l2tVar13;
                            this.i = l2tVar10;
                            this.t = collectionArtist3;
                            this.X = vum1Var2;
                            this.Z = zBooleanValue;
                            this.S0 = (byte) 4;
                            objE3 = l2tVar15.E(this);
                            if (objE3 != d9nVar) {
                                CollectionArtist collectionArtist10 = collectionArtist3;
                                vum1Var3 = vum1Var2;
                                z = zBooleanValue;
                                l2tVar16 = l2tVar12;
                                l2tVar17 = l2tVar13;
                                l2tVar18 = l2tVar10;
                                collectionArtist4 = collectionArtist10;
                                l2t l2tVar29 = l2tVar14;
                                l2tVar19 = l2tVar6;
                                l2tVar20 = l2tVar29;
                                zBooleanValue2 = ((Boolean) objE3).booleanValue();
                                this.T0 = s2tVar;
                                this.a = s2tVar;
                                this.b = s2tVar;
                                this.c = s2tVar;
                                this.d = s2tVar;
                                this.e = l2tVar19;
                                this.f = l2tVar11;
                                this.g = l2tVar16;
                                this.h = l2tVar17;
                                this.i = l2tVar18;
                                this.t = collectionArtist4;
                                this.X = vum1Var3;
                                this.Z = z;
                                this.N0 = zBooleanValue2;
                                this.S0 = (byte) 5;
                                objE4 = l2tVar20.E(this);
                                if (objE4 != d9nVar) {
                                    vum1 vum1Var7 = vum1Var3;
                                    z2 = z;
                                    z3 = zBooleanValue2;
                                    l2tVar21 = l2tVar16;
                                    l2tVar22 = l2tVar11;
                                    l2tVar23 = l2tVar17;
                                    collectionArtist5 = collectionArtist4;
                                    vum1Var4 = vum1Var7;
                                    zBooleanValue3 = ((Boolean) objE4).booleanValue();
                                    this.T0 = s2tVar;
                                    this.a = s2tVar;
                                    this.b = s2tVar;
                                    this.c = s2tVar;
                                    this.d = s2tVar;
                                    this.e = l2tVar19;
                                    this.f = l2tVar22;
                                    this.g = s2tVar;
                                    this.h = l2tVar23;
                                    this.i = l2tVar18;
                                    this.t = collectionArtist5;
                                    this.X = vum1Var4;
                                    this.Z = z2;
                                    this.N0 = z3;
                                    this.O0 = zBooleanValue3;
                                    this.S0 = (byte) 6;
                                    objE5 = l2tVar21.E(this);
                                    if (objE5 != d9nVar) {
                                        boolean z23 = z2;
                                        z4 = z3;
                                        z5 = zBooleanValue3;
                                        l2tVar24 = l2tVar23;
                                        l2tVar25 = l2tVar18;
                                        collectionArtist6 = collectionArtist5;
                                        vum1Var5 = vum1Var4;
                                        z6 = z23;
                                        zBooleanValue4 = ((Boolean) objE5).booleanValue();
                                        this.T0 = s2tVar;
                                        this.a = s2tVar;
                                        this.b = s2tVar;
                                        this.c = s2tVar;
                                        this.d = s2tVar;
                                        this.e = l2tVar19;
                                        this.f = l2tVar22;
                                        this.g = s2tVar;
                                        this.h = s2tVar;
                                        this.i = l2tVar25;
                                        this.t = collectionArtist6;
                                        this.X = vum1Var5;
                                        this.Z = z6;
                                        this.N0 = z4;
                                        this.O0 = z5;
                                        this.P0 = zBooleanValue4;
                                        this.S0 = (byte) 7;
                                        objE6 = l2tVar24.E(this);
                                        if (objE6 != d9nVar) {
                                            boolean z24 = z4;
                                            z7 = z5;
                                            z8 = zBooleanValue4;
                                            collectionArtist7 = collectionArtist6;
                                            vum1Var6 = vum1Var5;
                                            z9 = z6;
                                            z10 = z24;
                                            qrg1Var = (qrg1) objE6;
                                            this.T0 = s2tVar;
                                            this.a = s2tVar;
                                            this.b = s2tVar;
                                            this.c = s2tVar;
                                            this.d = s2tVar;
                                            this.e = s2tVar;
                                            this.f = l2tVar22;
                                            this.g = s2tVar;
                                            this.h = s2tVar;
                                            this.i = l2tVar25;
                                            this.t = collectionArtist7;
                                            this.X = vum1Var6;
                                            this.Y = qrg1Var;
                                            this.Z = z9;
                                            this.N0 = z10;
                                            this.O0 = z7;
                                            this.P0 = z8;
                                            this.S0 = (byte) 8;
                                            objE7 = l2tVar19.E(this);
                                            if (objE7 != d9nVar) {
                                                l2tVar26 = l2tVar22;
                                                zBooleanValue5 = ((Boolean) objE7).booleanValue();
                                                this.T0 = s2tVar;
                                                this.a = s2tVar;
                                                this.b = s2tVar;
                                                this.c = s2tVar;
                                                this.d = s2tVar;
                                                this.e = s2tVar;
                                                this.f = s2tVar;
                                                this.g = s2tVar;
                                                this.h = s2tVar;
                                                this.i = l2tVar25;
                                                this.t = collectionArtist7;
                                                this.X = vum1Var6;
                                                this.Y = qrg1Var;
                                                this.Z = z9;
                                                this.N0 = z10;
                                                this.O0 = z7;
                                                this.P0 = z8;
                                                this.Q0 = zBooleanValue5;
                                                this.S0 = (byte) 9;
                                                objE8 = l2tVar26.E(this);
                                                if (objE8 != d9nVar) {
                                                    boolean z25 = z7;
                                                    z11 = z8;
                                                    z12 = zBooleanValue5;
                                                    z13 = z10;
                                                    z14 = z25;
                                                    z15 = z9;
                                                    qrg1Var2 = qrg1Var;
                                                    collectionArtist8 = collectionArtist7;
                                                    l2tVar27 = l2tVar25;
                                                    zBooleanValue6 = ((Boolean) objE8).booleanValue();
                                                    this.T0 = s2tVar;
                                                    this.a = s2tVar;
                                                    this.b = s2tVar;
                                                    this.c = s2tVar;
                                                    this.d = s2tVar;
                                                    this.e = s2tVar;
                                                    this.f = s2tVar;
                                                    this.g = s2tVar;
                                                    this.h = s2tVar;
                                                    this.i = s2tVar;
                                                    this.t = collectionArtist8;
                                                    this.X = vum1Var6;
                                                    this.Y = qrg1Var2;
                                                    this.Z = z15;
                                                    this.N0 = z13;
                                                    this.O0 = z14;
                                                    this.P0 = z11;
                                                    this.Q0 = z12;
                                                    this.R0 = zBooleanValue6;
                                                    this.S0 = (byte) 10;
                                                    objE9 = l2tVar27.E(this);
                                                    if (objE9 != d9nVar) {
                                                        boolean z26 = z11;
                                                        z16 = z12;
                                                        z17 = zBooleanValue6;
                                                        collectionArtist9 = collectionArtist8;
                                                        qrg1Var3 = qrg1Var2;
                                                        z18 = z14;
                                                        z19 = z26;
                                                        boolean z27 = z13;
                                                        boolean z28 = z15;
                                                        bs6 bs6Var = (bs6) objE9;
                                                        Set set = s4b1.f;
                                                        lik1Var2 = lik1Var;
                                                        s4b1VarX = uic.x(lik1Var2.a);
                                                        blc0Var = s4b1VarX.c;
                                                        blc0Var2 = blc0.v1;
                                                        if (blc0Var == blc0Var2) {
                                                            z20 = true;
                                                        } else {
                                                            z20 = false;
                                                        }
                                                        m5qVar = js6Var.k;
                                                        link = collectionArtist9.q().getLink();
                                                        boolean z29 = z17;
                                                        switch (m5qVar.a) {
                                                            case 0:
                                                                z16 = z16;
                                                                z19 = z19;
                                                                z18 = z18;
                                                                blc0Var = blc0Var;
                                                                blc0Var3 = blc0Var2;
                                                                v5q v5qVar = m5qVar.b.c;
                                                                f971 f971Var = (f971) v5qVar.E5.get();
                                                                jl21 jl21Var = (jl21) v5qVar.s2.get();
                                                                ua91 ua91VarD0 = v5qVar.D0();
                                                                ccc0 ccc0Var = (ccc0) v5qVar.H2.get();
                                                                ijr ijrVar = (ijr) v5qVar.o6.get();
                                                                daq daqVar = v5qVar.b;
                                                                s4b1Var = s4b1VarX;
                                                                ks6Var = new ks6(lik1Var2, link, f971Var, jl21Var, ua91VarD0, new a680(ccc0Var, ijrVar, (kt91) daqVar.f8.get(), (dg30) v5qVar.i.a, (q8n) daqVar.w1.get()), (oh41) v5qVar.M5.get(), new uf0((Context) daqVar.x1.a), v5qVar.y0(), new wp20((ccc0) v5qVar.H2.get(), (ijr) v5qVar.o6.get(), (kt91) daqVar.f8.get(), (dg30) v5qVar.i.a, (q8n) daqVar.w1.get()), v5qVar.p(), new her((ayl) v5qVar.F2.get(), (byte) 24), new gmt((ca40) v5qVar.V0.get(), (ik21) v5qVar.Y0.get(), (byte) 4), v5qVar.n0(), v5qVar.h0(), v5qVar.G0(), v5qVar.i0(), new i6b((xb40) v5qVar.b8.get(), (byte) 0), v5qVar.A());
                                                                break;
                                                            case 1:
                                                                blc0Var3 = blc0Var2;
                                                                s7q s7qVar = m5qVar.b.d;
                                                                f971 f971Var2 = (f971) s7qVar.E3.get();
                                                                jl21 jl21Var2 = (jl21) s7qVar.G3.get();
                                                                ua91 ua91VarT4 = s7qVar.T4();
                                                                ccc0 ccc0Var2 = (ccc0) s7qVar.L1.get();
                                                                ijr ijrVar2 = (ijr) s7qVar.b3.get();
                                                                daq daqVar2 = s7qVar.b;
                                                                ks6Var = new ks6(lik1Var2, link, f971Var2, jl21Var2, ua91VarT4, new a680(ccc0Var2, ijrVar2, (kt91) daqVar2.f8.get(), (dg30) s7qVar.t.a, (q8n) daqVar2.w1.get()), (oh41) s7qVar.H3.get(), s7qVar.O1(), s7qVar.B4(), new wp20((ccc0) s7qVar.L1.get(), (ijr) s7qVar.b3.get(), (kt91) daqVar2.f8.get(), (dg30) s7qVar.t.a, (q8n) daqVar2.w1.get()), s7qVar.X(), new her((ayl) s7qVar.l3.get(), (byte) 24), s7qVar.f1(), s7qVar.E3(), s7qVar.o3(), s7qVar.j5(), s7qVar.p3(), s7qVar.Q(), s7qVar.Y0());
                                                                s4b1Var = s4b1VarX;
                                                                break;
                                                            default:
                                                                teq teqVar = m5qVar.b.d;
                                                                f971 f971Var3 = (f971) teqVar.O3.get();
                                                                jl21 jl21Var3 = (jl21) teqVar.l2.get();
                                                                ua91 ua91VarJ3 = teqVar.J3();
                                                                ccc0 ccc0Var3 = (ccc0) teqVar.q3.get();
                                                                ijr ijrVar3 = (ijr) teqVar.n5.get();
                                                                daq daqVar3 = teqVar.d;
                                                                blc0Var3 = blc0Var2;
                                                                ks6Var = new ks6(lik1Var2, link, f971Var3, jl21Var3, ua91VarJ3, new a680(ccc0Var3, ijrVar3, (kt91) daqVar3.f8.get(), (dg30) teqVar.f.a, (q8n) daqVar3.w1.get()), (oh41) teqVar.P3.get(), teqVar.a1(), teqVar.s3(), new wp20((ccc0) teqVar.q3.get(), (ijr) teqVar.n5.get(), (kt91) daqVar3.f8.get(), (dg30) teqVar.f.a, (q8n) daqVar3.w1.get()), teqVar.b0(), new her((ayl) teqVar.x3.get(), (byte) 24), new gmt((ca40) teqVar.f2.get(), (ik21) teqVar.h2.get(), (byte) 4), teqVar.A2(), teqVar.n2(), teqVar.X3(), teqVar.o2(), new i6b((xb40) teqVar.J5.get(), (byte) 0), teqVar.B0());
                                                                s4b1Var = s4b1VarX;
                                                                break;
                                                        }
                                                        lik1Var3 = (lik1) ks6Var.a;
                                                        str = (String) ks6Var.b;
                                                        smc0VarN = k4p1.n();
                                                        bm6Var = this.V0;
                                                        if (bm6Var.c) {
                                                            followed = collectionArtist9.p().getFollowed();
                                                            boolean isBanned = collectionArtist9.p().getIsBanned();
                                                            wp20 wp20Var = (wp20) ks6Var.t;
                                                            if (followed) {
                                                                fuxVar = fux.c;
                                                            } else {
                                                                fuxVar = hnx.c;
                                                            }
                                                            fux fuxVar2 = fuxVar;
                                                            if (followed) {
                                                                i2 = 2131954468;
                                                            } else {
                                                                i2 = 2131954371;
                                                            }
                                                            str2 = str;
                                                            smc0VarN.add(new jhm("collection_follow_artist", fuxVar2, (fhm) null, Integer.valueOf(i2), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ll20.d1, new cl1(followed, str, (byte) 15)), new ew8(wp20Var, followed, str, isBanned, (byte) 2)), 244));
                                                        } else {
                                                            str2 = str;
                                                        }
                                                        if (!bm6Var.a && !z29) {
                                                            boolean followed2 = collectionArtist9.p().getFollowed();
                                                            boolean isBanned2 = collectionArtist9.p().getIsBanned();
                                                            smc0VarN.add(new jhm("collection_ban_artist", bm6Var.e ? tkx.c : bpx.c, (fhm) null, Integer.valueOf(isBanned2 ? 2131954465 : 2131954325), (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(fr9.R0, new cl1(isBanned2, str2, (byte) 3)), new ew8((a680) ks6Var.f, str2, followed2, isBanned2)), 244));
                                                        }
                                                        if (bm6Var.f) {
                                                            artistCollectionStateP = collectionArtist9.p();
                                                            if (artistCollectionStateP.getNumTracksInCollection() <= 0 || artistCollectionStateP.getNumAlbumsInCollection() > 0) {
                                                                String collectionLink = collectionArtist9.p().getCollectionLink();
                                                                ArtistSyncState artistSyncStateR = collectionArtist9.r();
                                                                xwp0VarO = dm5.O(artistSyncStateR.getSyncProgress(), artistSyncStateR.getOffline());
                                                                if (!xwp0VarO.equals(rwp0.a) || xwp0VarO.equals(pwp0.a) || xwp0VarO.equals(lwp0.a)) {
                                                                    z22 = false;
                                                                } else {
                                                                    if (!(xwp0VarO instanceof jwp0) && !(xwp0VarO instanceof vwp0) && !xwp0VarO.equals(hwp0.a) && !xwp0VarO.equals(twp0.a) && !xwp0VarO.equals(nwp0.a)) {
                                                                        eg.o();
                                                                        return obj2;
                                                                    }
                                                                    z22 = true;
                                                                }
                                                                her herVar = (her) ks6Var.Y;
                                                                if (z22) {
                                                                    umxVar = umx.c;
                                                                } else {
                                                                    umxVar = tmx.c;
                                                                }
                                                                umx umxVar2 = umxVar;
                                                                if (z22) {
                                                                    i = 2131954467;
                                                                } else {
                                                                    i = 2131954366;
                                                                }
                                                                Integer numValueOf = Integer.valueOf(i);
                                                                ygm ygmVar = new ygm(2);
                                                                if (z22) {
                                                                    hhmVar = hhm.b;
                                                                } else {
                                                                    hhmVar = hhm.a;
                                                                }
                                                                smc0VarN.add(new jhm("artist_download", umxVar2, (fhm) null, numValueOf, (String) null, false, (tm81) null, new ihm(ygmVar, hhmVar, new ghm(wiu.T0, new cl1(z22, collectionLink, (byte) 10)), new c30(z22, herVar, collectionLink, (byte) 12)), 244));
                                                            }
                                                        }
                                                        if (bm6Var.t) {
                                                            smc0VarN.add(js6Var.n.d());
                                                        }
                                                        ugo0Var = bm6Var.h;
                                                        if (ugo0Var != null) {
                                                            if (ugo0Var.a) {
                                                                jhmVarS2 = ((kqi0) ks6Var.O0).k(ugo0Var);
                                                            } else {
                                                                jhmVarS2 = ((dxy) ks6Var.Q0).s(ugo0Var);
                                                            }
                                                            smc0VarN.add(jhmVarS2);
                                                        }
                                                        p860Var = bm6Var.X;
                                                        if (p860Var != null) {
                                                            smc0VarN.add(js6Var.o.h(p860Var));
                                                        }
                                                        zJ = u890.j(vum1Var6, tum1.a);
                                                        e2t0Var = e2t0.b;
                                                        if (!zJ) {
                                                            if (!(vum1Var6 instanceof uum1)) {
                                                                lik1Var4 = lik1Var3;
                                                                smc0VarN.add(((tzr0) ks6Var.N0).g(str2, e2t0Var, lik1Var4));
                                                            }
                                                            if (lik1Var2.equals(nik1.q2) || blc0Var4 == blc0Var3) {
                                                                blc0Var4 = blc0Var;
                                                                smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                                            }
                                                            blc0Var4 = blc0Var;
                                                            jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                                            if (jhmVarS != null) {
                                                                smc0VarN.add(jhmVarS);
                                                            }
                                                            if (!bm6Var.b && !z20) {
                                                                smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                                            }
                                                            if (z16) {
                                                                smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                                            }
                                                            if (((no4) js6Var.a.a.get()).h() && ((bp90) js6Var.i.e.a().getValue()).f) {
                                                                smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                                            }
                                                            if (!bm6Var.g && ((!z28 || z18) && z27)) {
                                                                smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                                            }
                                                            if (z20 || !u890.j(s4b1Var.b(), collectionArtist9.q().getLink())) {
                                                                z21 = false;
                                                            } else {
                                                                z21 = true;
                                                            }
                                                            if (js6Var.m.a && (qaa1Var = bs6Var.a) != null && qaa1Var.a && !z21) {
                                                                smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                                            }
                                                            ok51Var = bm6Var.i;
                                                            if (ok51Var != null) {
                                                                smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                                            }
                                                            if ((bm6Var.d && js6Var.l) || z20) {
                                                                smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                                            }
                                                            if (z19) {
                                                                smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                                            }
                                                            smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                                            smc0 smc0VarK = k4p1.k(smc0VarN);
                                                            String standardLink = collectionArtist9.q().getPortraits().getStandardLink();
                                                            String name = collectionArtist9.q().getName();
                                                            standardLink.getClass();
                                                            String name2 = collectionArtist9.q().getName();
                                                            String name3 = collectionArtist9.q().getName();
                                                            uwr uwrVar = cbx.a;
                                                            return new kjm(new igm(name, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink, name2, name3)})), (String) null, 4), smc0VarK, 4);
                                                        }
                                                        smc0VarN.add(((dlg1) ks6Var.P0).i(str2, e2t0Var));
                                                        lik1Var4 = lik1Var3;
                                                        if (lik1Var2.equals(nik1.q2)) {
                                                            blc0Var4 = blc0Var;
                                                            smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                                        } else {
                                                            blc0Var4 = blc0Var;
                                                            smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                                        }
                                                        blc0Var4 = blc0Var;
                                                        jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                                        if (jhmVarS != null) {
                                                            smc0VarN.add(jhmVarS);
                                                        }
                                                        if (!bm6Var.b) {
                                                            smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                                        }
                                                        if (z16) {
                                                            smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                                        }
                                                        if (((no4) js6Var.a.a.get()).h()) {
                                                            smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                                        }
                                                        if (!bm6Var.g) {
                                                            smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                                        }
                                                        if (z20) {
                                                            z21 = false;
                                                        } else {
                                                            z21 = false;
                                                        }
                                                        if (js6Var.m.a) {
                                                            smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                                        }
                                                        ok51Var = bm6Var.i;
                                                        if (ok51Var != null) {
                                                            smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                                        }
                                                        if (bm6Var.d) {
                                                            smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                                        } else {
                                                            smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                                        }
                                                        if (z19) {
                                                            smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                                        }
                                                        smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                                        smc0 smc0VarK2 = k4p1.k(smc0VarN);
                                                        String standardLink2 = collectionArtist9.q().getPortraits().getStandardLink();
                                                        String name4 = collectionArtist9.q().getName();
                                                        standardLink2.getClass();
                                                        String name5 = collectionArtist9.q().getName();
                                                        String name6 = collectionArtist9.q().getName();
                                                        uwr uwrVar2 = cbx.a;
                                                        return new kjm(new igm(name4, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink2, name5, name6)})), (String) null, 4), smc0VarK2, 4);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return d9nVar;
            case 1:
                l2tVarQ4 = this.i;
                l2t l2tVar30 = this.h;
                l2t l2tVar31 = this.g;
                l2t l2tVar32 = this.f;
                l2t l2tVar33 = this.e;
                l2tVar3 = this.d;
                l2t l2tVar34 = this.c;
                l2t l2tVar35 = this.b;
                s2tVarQ = this.a;
                hm5.M(obj);
                l2tVar4 = l2tVar34;
                l2tVar2 = l2tVar35;
                l2tVarQ2 = l2tVar32;
                lik1Var = lik1Var5;
                objQ = obj;
                l2tVar = l2tVar30;
                js6Var = js6Var2;
                d9nVar = d9nVar2;
                l2tVarQ = l2tVar33;
                l2tVarQ3 = l2tVar31;
                s2tVar = null;
                collectionArtist = (CollectionArtist) objQ;
                this.T0 = s2tVar;
                this.a = s2tVar;
                this.b = l2tVar2;
                this.c = l2tVar4;
                this.d = l2tVar3;
                this.e = l2tVarQ;
                this.f = l2tVarQ2;
                this.g = l2tVarQ3;
                this.h = l2tVar;
                this.i = l2tVarQ4;
                this.t = collectionArtist;
                this.S0 = (byte) 2;
                objE = s2tVarQ.E(this);
                if (objE != d9nVar) {
                    l2tVar5 = l2tVar2;
                    l2tVar6 = l2tVarQ;
                    l2tVar7 = l2tVar3;
                    l2tVar8 = l2tVarQ3;
                    l2tVar9 = l2tVarQ2;
                    l2tVar10 = l2tVarQ4;
                    collectionArtist2 = collectionArtist;
                    vum1Var = (vum1) objE;
                    this.T0 = s2tVar;
                    this.a = s2tVar;
                    this.b = s2tVar;
                    this.c = l2tVar4;
                    this.d = l2tVar7;
                    this.e = l2tVar6;
                    this.f = l2tVar9;
                    this.g = l2tVar8;
                    this.h = l2tVar;
                    this.i = l2tVar10;
                    this.t = collectionArtist2;
                    this.X = vum1Var;
                    this.S0 = (byte) 3;
                    objE2 = l2tVar5.E(this);
                    if (objE2 != d9nVar) {
                        l2t l2tVar210 = l2tVar;
                        collectionArtist3 = collectionArtist2;
                        vum1Var2 = vum1Var;
                        l2tVar11 = l2tVar9;
                        l2tVar12 = l2tVar8;
                        l2tVar13 = l2tVar210;
                        l2tVar14 = l2tVar4;
                        l2tVar15 = l2tVar7;
                        zBooleanValue = ((Boolean) objE2).booleanValue();
                        this.T0 = s2tVar;
                        this.a = s2tVar;
                        this.b = s2tVar;
                        this.c = l2tVar14;
                        this.d = s2tVar;
                        this.e = l2tVar6;
                        this.f = l2tVar11;
                        this.g = l2tVar12;
                        this.h = l2tVar13;
                        this.i = l2tVar10;
                        this.t = collectionArtist3;
                        this.X = vum1Var2;
                        this.Z = zBooleanValue;
                        this.S0 = (byte) 4;
                        objE3 = l2tVar15.E(this);
                        if (objE3 != d9nVar) {
                            CollectionArtist collectionArtist11 = collectionArtist3;
                            vum1Var3 = vum1Var2;
                            z = zBooleanValue;
                            l2tVar16 = l2tVar12;
                            l2tVar17 = l2tVar13;
                            l2tVar18 = l2tVar10;
                            collectionArtist4 = collectionArtist11;
                            l2t l2tVar211 = l2tVar14;
                            l2tVar19 = l2tVar6;
                            l2tVar20 = l2tVar211;
                            zBooleanValue2 = ((Boolean) objE3).booleanValue();
                            this.T0 = s2tVar;
                            this.a = s2tVar;
                            this.b = s2tVar;
                            this.c = s2tVar;
                            this.d = s2tVar;
                            this.e = l2tVar19;
                            this.f = l2tVar11;
                            this.g = l2tVar16;
                            this.h = l2tVar17;
                            this.i = l2tVar18;
                            this.t = collectionArtist4;
                            this.X = vum1Var3;
                            this.Z = z;
                            this.N0 = zBooleanValue2;
                            this.S0 = (byte) 5;
                            objE4 = l2tVar20.E(this);
                            if (objE4 != d9nVar) {
                                vum1 vum1Var8 = vum1Var3;
                                z2 = z;
                                z3 = zBooleanValue2;
                                l2tVar21 = l2tVar16;
                                l2tVar22 = l2tVar11;
                                l2tVar23 = l2tVar17;
                                collectionArtist5 = collectionArtist4;
                                vum1Var4 = vum1Var8;
                                zBooleanValue3 = ((Boolean) objE4).booleanValue();
                                this.T0 = s2tVar;
                                this.a = s2tVar;
                                this.b = s2tVar;
                                this.c = s2tVar;
                                this.d = s2tVar;
                                this.e = l2tVar19;
                                this.f = l2tVar22;
                                this.g = s2tVar;
                                this.h = l2tVar23;
                                this.i = l2tVar18;
                                this.t = collectionArtist5;
                                this.X = vum1Var4;
                                this.Z = z2;
                                this.N0 = z3;
                                this.O0 = zBooleanValue3;
                                this.S0 = (byte) 6;
                                objE5 = l2tVar21.E(this);
                                if (objE5 != d9nVar) {
                                    boolean z210 = z2;
                                    z4 = z3;
                                    z5 = zBooleanValue3;
                                    l2tVar24 = l2tVar23;
                                    l2tVar25 = l2tVar18;
                                    collectionArtist6 = collectionArtist5;
                                    vum1Var5 = vum1Var4;
                                    z6 = z210;
                                    zBooleanValue4 = ((Boolean) objE5).booleanValue();
                                    this.T0 = s2tVar;
                                    this.a = s2tVar;
                                    this.b = s2tVar;
                                    this.c = s2tVar;
                                    this.d = s2tVar;
                                    this.e = l2tVar19;
                                    this.f = l2tVar22;
                                    this.g = s2tVar;
                                    this.h = s2tVar;
                                    this.i = l2tVar25;
                                    this.t = collectionArtist6;
                                    this.X = vum1Var5;
                                    this.Z = z6;
                                    this.N0 = z4;
                                    this.O0 = z5;
                                    this.P0 = zBooleanValue4;
                                    this.S0 = (byte) 7;
                                    objE6 = l2tVar24.E(this);
                                    if (objE6 != d9nVar) {
                                        boolean z211 = z4;
                                        z7 = z5;
                                        z8 = zBooleanValue4;
                                        collectionArtist7 = collectionArtist6;
                                        vum1Var6 = vum1Var5;
                                        z9 = z6;
                                        z10 = z211;
                                        qrg1Var = (qrg1) objE6;
                                        this.T0 = s2tVar;
                                        this.a = s2tVar;
                                        this.b = s2tVar;
                                        this.c = s2tVar;
                                        this.d = s2tVar;
                                        this.e = s2tVar;
                                        this.f = l2tVar22;
                                        this.g = s2tVar;
                                        this.h = s2tVar;
                                        this.i = l2tVar25;
                                        this.t = collectionArtist7;
                                        this.X = vum1Var6;
                                        this.Y = qrg1Var;
                                        this.Z = z9;
                                        this.N0 = z10;
                                        this.O0 = z7;
                                        this.P0 = z8;
                                        this.S0 = (byte) 8;
                                        objE7 = l2tVar19.E(this);
                                        if (objE7 != d9nVar) {
                                            l2tVar26 = l2tVar22;
                                            zBooleanValue5 = ((Boolean) objE7).booleanValue();
                                            this.T0 = s2tVar;
                                            this.a = s2tVar;
                                            this.b = s2tVar;
                                            this.c = s2tVar;
                                            this.d = s2tVar;
                                            this.e = s2tVar;
                                            this.f = s2tVar;
                                            this.g = s2tVar;
                                            this.h = s2tVar;
                                            this.i = l2tVar25;
                                            this.t = collectionArtist7;
                                            this.X = vum1Var6;
                                            this.Y = qrg1Var;
                                            this.Z = z9;
                                            this.N0 = z10;
                                            this.O0 = z7;
                                            this.P0 = z8;
                                            this.Q0 = zBooleanValue5;
                                            this.S0 = (byte) 9;
                                            objE8 = l2tVar26.E(this);
                                            if (objE8 != d9nVar) {
                                                boolean z212 = z7;
                                                z11 = z8;
                                                z12 = zBooleanValue5;
                                                z13 = z10;
                                                z14 = z212;
                                                z15 = z9;
                                                qrg1Var2 = qrg1Var;
                                                collectionArtist8 = collectionArtist7;
                                                l2tVar27 = l2tVar25;
                                                zBooleanValue6 = ((Boolean) objE8).booleanValue();
                                                this.T0 = s2tVar;
                                                this.a = s2tVar;
                                                this.b = s2tVar;
                                                this.c = s2tVar;
                                                this.d = s2tVar;
                                                this.e = s2tVar;
                                                this.f = s2tVar;
                                                this.g = s2tVar;
                                                this.h = s2tVar;
                                                this.i = s2tVar;
                                                this.t = collectionArtist8;
                                                this.X = vum1Var6;
                                                this.Y = qrg1Var2;
                                                this.Z = z15;
                                                this.N0 = z13;
                                                this.O0 = z14;
                                                this.P0 = z11;
                                                this.Q0 = z12;
                                                this.R0 = zBooleanValue6;
                                                this.S0 = (byte) 10;
                                                objE9 = l2tVar27.E(this);
                                                if (objE9 != d9nVar) {
                                                    boolean z213 = z11;
                                                    z16 = z12;
                                                    z17 = zBooleanValue6;
                                                    collectionArtist9 = collectionArtist8;
                                                    qrg1Var3 = qrg1Var2;
                                                    z18 = z14;
                                                    z19 = z213;
                                                    boolean z214 = z13;
                                                    boolean z215 = z15;
                                                    bs6 bs6Var2 = (bs6) objE9;
                                                    Set set2 = s4b1.f;
                                                    lik1Var2 = lik1Var;
                                                    s4b1VarX = uic.x(lik1Var2.a);
                                                    blc0Var = s4b1VarX.c;
                                                    blc0Var2 = blc0.v1;
                                                    if (blc0Var == blc0Var2) {
                                                        z20 = true;
                                                    } else {
                                                        z20 = false;
                                                    }
                                                    m5qVar = js6Var.k;
                                                    link = collectionArtist9.q().getLink();
                                                    boolean z216 = z17;
                                                    switch (m5qVar.a) {
                                                        case 0:
                                                            z16 = z16;
                                                            z19 = z19;
                                                            z18 = z18;
                                                            blc0Var = blc0Var;
                                                            blc0Var3 = blc0Var2;
                                                            v5q v5qVar2 = m5qVar.b.c;
                                                            f971 f971Var4 = (f971) v5qVar2.E5.get();
                                                            jl21 jl21Var4 = (jl21) v5qVar2.s2.get();
                                                            ua91 ua91VarD1 = v5qVar2.D0();
                                                            ccc0 ccc0Var4 = (ccc0) v5qVar2.H2.get();
                                                            ijr ijrVar4 = (ijr) v5qVar2.o6.get();
                                                            daq daqVar4 = v5qVar2.b;
                                                            s4b1Var = s4b1VarX;
                                                            ks6Var = new ks6(lik1Var2, link, f971Var4, jl21Var4, ua91VarD1, new a680(ccc0Var4, ijrVar4, (kt91) daqVar4.f8.get(), (dg30) v5qVar2.i.a, (q8n) daqVar4.w1.get()), (oh41) v5qVar2.M5.get(), new uf0((Context) daqVar4.x1.a), v5qVar2.y0(), new wp20((ccc0) v5qVar2.H2.get(), (ijr) v5qVar2.o6.get(), (kt91) daqVar4.f8.get(), (dg30) v5qVar2.i.a, (q8n) daqVar4.w1.get()), v5qVar2.p(), new her((ayl) v5qVar2.F2.get(), (byte) 24), new gmt((ca40) v5qVar2.V0.get(), (ik21) v5qVar2.Y0.get(), (byte) 4), v5qVar2.n0(), v5qVar2.h0(), v5qVar2.G0(), v5qVar2.i0(), new i6b((xb40) v5qVar2.b8.get(), (byte) 0), v5qVar2.A());
                                                            break;
                                                        case 1:
                                                            blc0Var3 = blc0Var2;
                                                            s7q s7qVar2 = m5qVar.b.d;
                                                            f971 f971Var5 = (f971) s7qVar2.E3.get();
                                                            jl21 jl21Var5 = (jl21) s7qVar2.G3.get();
                                                            ua91 ua91VarT5 = s7qVar2.T4();
                                                            ccc0 ccc0Var5 = (ccc0) s7qVar2.L1.get();
                                                            ijr ijrVar5 = (ijr) s7qVar2.b3.get();
                                                            daq daqVar5 = s7qVar2.b;
                                                            ks6Var = new ks6(lik1Var2, link, f971Var5, jl21Var5, ua91VarT5, new a680(ccc0Var5, ijrVar5, (kt91) daqVar5.f8.get(), (dg30) s7qVar2.t.a, (q8n) daqVar5.w1.get()), (oh41) s7qVar2.H3.get(), s7qVar2.O1(), s7qVar2.B4(), new wp20((ccc0) s7qVar2.L1.get(), (ijr) s7qVar2.b3.get(), (kt91) daqVar5.f8.get(), (dg30) s7qVar2.t.a, (q8n) daqVar5.w1.get()), s7qVar2.X(), new her((ayl) s7qVar2.l3.get(), (byte) 24), s7qVar2.f1(), s7qVar2.E3(), s7qVar2.o3(), s7qVar2.j5(), s7qVar2.p3(), s7qVar2.Q(), s7qVar2.Y0());
                                                            s4b1Var = s4b1VarX;
                                                            break;
                                                        default:
                                                            teq teqVar2 = m5qVar.b.d;
                                                            f971 f971Var6 = (f971) teqVar2.O3.get();
                                                            jl21 jl21Var6 = (jl21) teqVar2.l2.get();
                                                            ua91 ua91VarJ4 = teqVar2.J3();
                                                            ccc0 ccc0Var6 = (ccc0) teqVar2.q3.get();
                                                            ijr ijrVar6 = (ijr) teqVar2.n5.get();
                                                            daq daqVar6 = teqVar2.d;
                                                            blc0Var3 = blc0Var2;
                                                            ks6Var = new ks6(lik1Var2, link, f971Var6, jl21Var6, ua91VarJ4, new a680(ccc0Var6, ijrVar6, (kt91) daqVar6.f8.get(), (dg30) teqVar2.f.a, (q8n) daqVar6.w1.get()), (oh41) teqVar2.P3.get(), teqVar2.a1(), teqVar2.s3(), new wp20((ccc0) teqVar2.q3.get(), (ijr) teqVar2.n5.get(), (kt91) daqVar6.f8.get(), (dg30) teqVar2.f.a, (q8n) daqVar6.w1.get()), teqVar2.b0(), new her((ayl) teqVar2.x3.get(), (byte) 24), new gmt((ca40) teqVar2.f2.get(), (ik21) teqVar2.h2.get(), (byte) 4), teqVar2.A2(), teqVar2.n2(), teqVar2.X3(), teqVar2.o2(), new i6b((xb40) teqVar2.J5.get(), (byte) 0), teqVar2.B0());
                                                            s4b1Var = s4b1VarX;
                                                            break;
                                                    }
                                                    lik1Var3 = (lik1) ks6Var.a;
                                                    str = (String) ks6Var.b;
                                                    smc0VarN = k4p1.n();
                                                    bm6Var = this.V0;
                                                    if (bm6Var.c) {
                                                        followed = collectionArtist9.p().getFollowed();
                                                        boolean isBanned3 = collectionArtist9.p().getIsBanned();
                                                        wp20 wp20Var2 = (wp20) ks6Var.t;
                                                        if (followed) {
                                                            fuxVar = fux.c;
                                                        } else {
                                                            fuxVar = hnx.c;
                                                        }
                                                        fux fuxVar3 = fuxVar;
                                                        if (followed) {
                                                            i2 = 2131954468;
                                                        } else {
                                                            i2 = 2131954371;
                                                        }
                                                        str2 = str;
                                                        smc0VarN.add(new jhm("collection_follow_artist", fuxVar3, (fhm) null, Integer.valueOf(i2), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ll20.d1, new cl1(followed, str, (byte) 15)), new ew8(wp20Var2, followed, str, isBanned3, (byte) 2)), 244));
                                                    } else {
                                                        str2 = str;
                                                    }
                                                    if (!bm6Var.a) {
                                                    }
                                                    if (bm6Var.f) {
                                                        artistCollectionStateP = collectionArtist9.p();
                                                        if (artistCollectionStateP.getNumTracksInCollection() <= 0) {
                                                        }
                                                        String collectionLink2 = collectionArtist9.p().getCollectionLink();
                                                        ArtistSyncState artistSyncStateR2 = collectionArtist9.r();
                                                        xwp0VarO = dm5.O(artistSyncStateR2.getSyncProgress(), artistSyncStateR2.getOffline());
                                                        if (xwp0VarO.equals(rwp0.a)) {
                                                            z22 = false;
                                                        } else {
                                                            z22 = false;
                                                        }
                                                        her herVar2 = (her) ks6Var.Y;
                                                        if (z22) {
                                                            umxVar = umx.c;
                                                        } else {
                                                            umxVar = tmx.c;
                                                        }
                                                        umx umxVar3 = umxVar;
                                                        if (z22) {
                                                            i = 2131954467;
                                                        } else {
                                                            i = 2131954366;
                                                        }
                                                        Integer numValueOf2 = Integer.valueOf(i);
                                                        ygm ygmVar2 = new ygm(2);
                                                        if (z22) {
                                                            hhmVar = hhm.b;
                                                        } else {
                                                            hhmVar = hhm.a;
                                                        }
                                                        smc0VarN.add(new jhm("artist_download", umxVar3, (fhm) null, numValueOf2, (String) null, false, (tm81) null, new ihm(ygmVar2, hhmVar, new ghm(wiu.T0, new cl1(z22, collectionLink2, (byte) 10)), new c30(z22, herVar2, collectionLink2, (byte) 12)), 244));
                                                        break;
                                                    }
                                                    if (bm6Var.t) {
                                                        smc0VarN.add(js6Var.n.d());
                                                    }
                                                    ugo0Var = bm6Var.h;
                                                    if (ugo0Var != null) {
                                                        if (ugo0Var.a) {
                                                            jhmVarS2 = ((kqi0) ks6Var.O0).k(ugo0Var);
                                                        } else {
                                                            jhmVarS2 = ((dxy) ks6Var.Q0).s(ugo0Var);
                                                        }
                                                        smc0VarN.add(jhmVarS2);
                                                    }
                                                    p860Var = bm6Var.X;
                                                    if (p860Var != null) {
                                                        smc0VarN.add(js6Var.o.h(p860Var));
                                                    }
                                                    zJ = u890.j(vum1Var6, tum1.a);
                                                    e2t0Var = e2t0.b;
                                                    if (!zJ) {
                                                        if (!(vum1Var6 instanceof uum1)) {
                                                            lik1Var4 = lik1Var3;
                                                            smc0VarN.add(((tzr0) ks6Var.N0).g(str2, e2t0Var, lik1Var4));
                                                        }
                                                        if (lik1Var2.equals(nik1.q2)) {
                                                            blc0Var4 = blc0Var;
                                                            smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                                        } else {
                                                            blc0Var4 = blc0Var;
                                                            smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                                        }
                                                        blc0Var4 = blc0Var;
                                                        jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                                        if (jhmVarS != null) {
                                                            smc0VarN.add(jhmVarS);
                                                        }
                                                        if (!bm6Var.b) {
                                                            smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                                        }
                                                        if (z16) {
                                                            smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                                        }
                                                        if (((no4) js6Var.a.a.get()).h()) {
                                                            smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                                        }
                                                        if (!bm6Var.g) {
                                                            smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                                        }
                                                        if (z20) {
                                                            z21 = false;
                                                        } else {
                                                            z21 = false;
                                                        }
                                                        if (js6Var.m.a) {
                                                            smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                                        }
                                                        ok51Var = bm6Var.i;
                                                        if (ok51Var != null) {
                                                            smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                                        }
                                                        if (bm6Var.d) {
                                                            smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                                        } else {
                                                            smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                                        }
                                                        if (z19) {
                                                            smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                                        }
                                                        smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                                        smc0 smc0VarK3 = k4p1.k(smc0VarN);
                                                        String standardLink3 = collectionArtist9.q().getPortraits().getStandardLink();
                                                        String name7 = collectionArtist9.q().getName();
                                                        standardLink3.getClass();
                                                        String name8 = collectionArtist9.q().getName();
                                                        String name9 = collectionArtist9.q().getName();
                                                        uwr uwrVar3 = cbx.a;
                                                        return new kjm(new igm(name7, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink3, name8, name9)})), (String) null, 4), smc0VarK3, 4);
                                                    }
                                                    smc0VarN.add(((dlg1) ks6Var.P0).i(str2, e2t0Var));
                                                    lik1Var4 = lik1Var3;
                                                    if (lik1Var2.equals(nik1.q2)) {
                                                        blc0Var4 = blc0Var;
                                                        smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                                    } else {
                                                        blc0Var4 = blc0Var;
                                                        smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                                    }
                                                    blc0Var4 = blc0Var;
                                                    jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                                    if (jhmVarS != null) {
                                                        smc0VarN.add(jhmVarS);
                                                    }
                                                    if (!bm6Var.b) {
                                                        smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                                    }
                                                    if (z16) {
                                                        smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                                    }
                                                    if (((no4) js6Var.a.a.get()).h()) {
                                                        smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                                    }
                                                    if (!bm6Var.g) {
                                                        smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                                    }
                                                    if (z20) {
                                                        z21 = false;
                                                    } else {
                                                        z21 = false;
                                                    }
                                                    if (js6Var.m.a) {
                                                        smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                                    }
                                                    ok51Var = bm6Var.i;
                                                    if (ok51Var != null) {
                                                        smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                                    }
                                                    if (bm6Var.d) {
                                                        smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                                    } else {
                                                        smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                                    }
                                                    if (z19) {
                                                        smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                                    }
                                                    smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                                    smc0 smc0VarK4 = k4p1.k(smc0VarN);
                                                    String standardLink4 = collectionArtist9.q().getPortraits().getStandardLink();
                                                    String name10 = collectionArtist9.q().getName();
                                                    standardLink4.getClass();
                                                    String name11 = collectionArtist9.q().getName();
                                                    String name12 = collectionArtist9.q().getName();
                                                    uwr uwrVar4 = cbx.a;
                                                    return new kjm(new igm(name10, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink4, name11, name12)})), (String) null, 4), smc0VarK4, 4);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return d9nVar;
            case 2:
                obj2 = null;
                collectionArtist2 = this.t;
                l2t l2tVar36 = this.i;
                l2t l2tVar37 = this.h;
                l2t l2tVar38 = this.g;
                l2tVar9 = this.f;
                l2t l2tVar39 = this.e;
                l2t l2tVar40 = this.d;
                l2tVar4 = this.c;
                l2tVar5 = this.b;
                hm5.M(obj);
                objE = obj;
                l2tVar10 = l2tVar36;
                lik1Var = lik1Var5;
                js6Var = js6Var2;
                d9nVar = d9nVar2;
                l2tVar7 = l2tVar40;
                l2tVar6 = l2tVar39;
                l2tVar8 = l2tVar38;
                l2tVar = l2tVar37;
                s2tVar = null;
                vum1Var = (vum1) objE;
                this.T0 = s2tVar;
                this.a = s2tVar;
                this.b = s2tVar;
                this.c = l2tVar4;
                this.d = l2tVar7;
                this.e = l2tVar6;
                this.f = l2tVar9;
                this.g = l2tVar8;
                this.h = l2tVar;
                this.i = l2tVar10;
                this.t = collectionArtist2;
                this.X = vum1Var;
                this.S0 = (byte) 3;
                objE2 = l2tVar5.E(this);
                if (objE2 != d9nVar) {
                    l2t l2tVar212 = l2tVar;
                    collectionArtist3 = collectionArtist2;
                    vum1Var2 = vum1Var;
                    l2tVar11 = l2tVar9;
                    l2tVar12 = l2tVar8;
                    l2tVar13 = l2tVar212;
                    l2tVar14 = l2tVar4;
                    l2tVar15 = l2tVar7;
                    zBooleanValue = ((Boolean) objE2).booleanValue();
                    this.T0 = s2tVar;
                    this.a = s2tVar;
                    this.b = s2tVar;
                    this.c = l2tVar14;
                    this.d = s2tVar;
                    this.e = l2tVar6;
                    this.f = l2tVar11;
                    this.g = l2tVar12;
                    this.h = l2tVar13;
                    this.i = l2tVar10;
                    this.t = collectionArtist3;
                    this.X = vum1Var2;
                    this.Z = zBooleanValue;
                    this.S0 = (byte) 4;
                    objE3 = l2tVar15.E(this);
                    if (objE3 != d9nVar) {
                        CollectionArtist collectionArtist12 = collectionArtist3;
                        vum1Var3 = vum1Var2;
                        z = zBooleanValue;
                        l2tVar16 = l2tVar12;
                        l2tVar17 = l2tVar13;
                        l2tVar18 = l2tVar10;
                        collectionArtist4 = collectionArtist12;
                        l2t l2tVar213 = l2tVar14;
                        l2tVar19 = l2tVar6;
                        l2tVar20 = l2tVar213;
                        zBooleanValue2 = ((Boolean) objE3).booleanValue();
                        this.T0 = s2tVar;
                        this.a = s2tVar;
                        this.b = s2tVar;
                        this.c = s2tVar;
                        this.d = s2tVar;
                        this.e = l2tVar19;
                        this.f = l2tVar11;
                        this.g = l2tVar16;
                        this.h = l2tVar17;
                        this.i = l2tVar18;
                        this.t = collectionArtist4;
                        this.X = vum1Var3;
                        this.Z = z;
                        this.N0 = zBooleanValue2;
                        this.S0 = (byte) 5;
                        objE4 = l2tVar20.E(this);
                        if (objE4 != d9nVar) {
                            vum1 vum1Var9 = vum1Var3;
                            z2 = z;
                            z3 = zBooleanValue2;
                            l2tVar21 = l2tVar16;
                            l2tVar22 = l2tVar11;
                            l2tVar23 = l2tVar17;
                            collectionArtist5 = collectionArtist4;
                            vum1Var4 = vum1Var9;
                            zBooleanValue3 = ((Boolean) objE4).booleanValue();
                            this.T0 = s2tVar;
                            this.a = s2tVar;
                            this.b = s2tVar;
                            this.c = s2tVar;
                            this.d = s2tVar;
                            this.e = l2tVar19;
                            this.f = l2tVar22;
                            this.g = s2tVar;
                            this.h = l2tVar23;
                            this.i = l2tVar18;
                            this.t = collectionArtist5;
                            this.X = vum1Var4;
                            this.Z = z2;
                            this.N0 = z3;
                            this.O0 = zBooleanValue3;
                            this.S0 = (byte) 6;
                            objE5 = l2tVar21.E(this);
                            if (objE5 != d9nVar) {
                                boolean z217 = z2;
                                z4 = z3;
                                z5 = zBooleanValue3;
                                l2tVar24 = l2tVar23;
                                l2tVar25 = l2tVar18;
                                collectionArtist6 = collectionArtist5;
                                vum1Var5 = vum1Var4;
                                z6 = z217;
                                zBooleanValue4 = ((Boolean) objE5).booleanValue();
                                this.T0 = s2tVar;
                                this.a = s2tVar;
                                this.b = s2tVar;
                                this.c = s2tVar;
                                this.d = s2tVar;
                                this.e = l2tVar19;
                                this.f = l2tVar22;
                                this.g = s2tVar;
                                this.h = s2tVar;
                                this.i = l2tVar25;
                                this.t = collectionArtist6;
                                this.X = vum1Var5;
                                this.Z = z6;
                                this.N0 = z4;
                                this.O0 = z5;
                                this.P0 = zBooleanValue4;
                                this.S0 = (byte) 7;
                                objE6 = l2tVar24.E(this);
                                if (objE6 != d9nVar) {
                                    boolean z218 = z4;
                                    z7 = z5;
                                    z8 = zBooleanValue4;
                                    collectionArtist7 = collectionArtist6;
                                    vum1Var6 = vum1Var5;
                                    z9 = z6;
                                    z10 = z218;
                                    qrg1Var = (qrg1) objE6;
                                    this.T0 = s2tVar;
                                    this.a = s2tVar;
                                    this.b = s2tVar;
                                    this.c = s2tVar;
                                    this.d = s2tVar;
                                    this.e = s2tVar;
                                    this.f = l2tVar22;
                                    this.g = s2tVar;
                                    this.h = s2tVar;
                                    this.i = l2tVar25;
                                    this.t = collectionArtist7;
                                    this.X = vum1Var6;
                                    this.Y = qrg1Var;
                                    this.Z = z9;
                                    this.N0 = z10;
                                    this.O0 = z7;
                                    this.P0 = z8;
                                    this.S0 = (byte) 8;
                                    objE7 = l2tVar19.E(this);
                                    if (objE7 != d9nVar) {
                                        l2tVar26 = l2tVar22;
                                        zBooleanValue5 = ((Boolean) objE7).booleanValue();
                                        this.T0 = s2tVar;
                                        this.a = s2tVar;
                                        this.b = s2tVar;
                                        this.c = s2tVar;
                                        this.d = s2tVar;
                                        this.e = s2tVar;
                                        this.f = s2tVar;
                                        this.g = s2tVar;
                                        this.h = s2tVar;
                                        this.i = l2tVar25;
                                        this.t = collectionArtist7;
                                        this.X = vum1Var6;
                                        this.Y = qrg1Var;
                                        this.Z = z9;
                                        this.N0 = z10;
                                        this.O0 = z7;
                                        this.P0 = z8;
                                        this.Q0 = zBooleanValue5;
                                        this.S0 = (byte) 9;
                                        objE8 = l2tVar26.E(this);
                                        if (objE8 != d9nVar) {
                                            boolean z219 = z7;
                                            z11 = z8;
                                            z12 = zBooleanValue5;
                                            z13 = z10;
                                            z14 = z219;
                                            z15 = z9;
                                            qrg1Var2 = qrg1Var;
                                            collectionArtist8 = collectionArtist7;
                                            l2tVar27 = l2tVar25;
                                            zBooleanValue6 = ((Boolean) objE8).booleanValue();
                                            this.T0 = s2tVar;
                                            this.a = s2tVar;
                                            this.b = s2tVar;
                                            this.c = s2tVar;
                                            this.d = s2tVar;
                                            this.e = s2tVar;
                                            this.f = s2tVar;
                                            this.g = s2tVar;
                                            this.h = s2tVar;
                                            this.i = s2tVar;
                                            this.t = collectionArtist8;
                                            this.X = vum1Var6;
                                            this.Y = qrg1Var2;
                                            this.Z = z15;
                                            this.N0 = z13;
                                            this.O0 = z14;
                                            this.P0 = z11;
                                            this.Q0 = z12;
                                            this.R0 = zBooleanValue6;
                                            this.S0 = (byte) 10;
                                            objE9 = l2tVar27.E(this);
                                            if (objE9 != d9nVar) {
                                                boolean z2110 = z11;
                                                z16 = z12;
                                                z17 = zBooleanValue6;
                                                collectionArtist9 = collectionArtist8;
                                                qrg1Var3 = qrg1Var2;
                                                z18 = z14;
                                                z19 = z2110;
                                                boolean z2111 = z13;
                                                boolean z2112 = z15;
                                                bs6 bs6Var3 = (bs6) objE9;
                                                Set set3 = s4b1.f;
                                                lik1Var2 = lik1Var;
                                                s4b1VarX = uic.x(lik1Var2.a);
                                                blc0Var = s4b1VarX.c;
                                                blc0Var2 = blc0.v1;
                                                if (blc0Var == blc0Var2) {
                                                    z20 = true;
                                                } else {
                                                    z20 = false;
                                                }
                                                m5qVar = js6Var.k;
                                                link = collectionArtist9.q().getLink();
                                                boolean z2113 = z17;
                                                switch (m5qVar.a) {
                                                    case 0:
                                                        z16 = z16;
                                                        z19 = z19;
                                                        z18 = z18;
                                                        blc0Var = blc0Var;
                                                        blc0Var3 = blc0Var2;
                                                        v5q v5qVar3 = m5qVar.b.c;
                                                        f971 f971Var7 = (f971) v5qVar3.E5.get();
                                                        jl21 jl21Var7 = (jl21) v5qVar3.s2.get();
                                                        ua91 ua91VarD2 = v5qVar3.D0();
                                                        ccc0 ccc0Var7 = (ccc0) v5qVar3.H2.get();
                                                        ijr ijrVar7 = (ijr) v5qVar3.o6.get();
                                                        daq daqVar7 = v5qVar3.b;
                                                        s4b1Var = s4b1VarX;
                                                        ks6Var = new ks6(lik1Var2, link, f971Var7, jl21Var7, ua91VarD2, new a680(ccc0Var7, ijrVar7, (kt91) daqVar7.f8.get(), (dg30) v5qVar3.i.a, (q8n) daqVar7.w1.get()), (oh41) v5qVar3.M5.get(), new uf0((Context) daqVar7.x1.a), v5qVar3.y0(), new wp20((ccc0) v5qVar3.H2.get(), (ijr) v5qVar3.o6.get(), (kt91) daqVar7.f8.get(), (dg30) v5qVar3.i.a, (q8n) daqVar7.w1.get()), v5qVar3.p(), new her((ayl) v5qVar3.F2.get(), (byte) 24), new gmt((ca40) v5qVar3.V0.get(), (ik21) v5qVar3.Y0.get(), (byte) 4), v5qVar3.n0(), v5qVar3.h0(), v5qVar3.G0(), v5qVar3.i0(), new i6b((xb40) v5qVar3.b8.get(), (byte) 0), v5qVar3.A());
                                                        break;
                                                    case 1:
                                                        blc0Var3 = blc0Var2;
                                                        s7q s7qVar3 = m5qVar.b.d;
                                                        f971 f971Var8 = (f971) s7qVar3.E3.get();
                                                        jl21 jl21Var8 = (jl21) s7qVar3.G3.get();
                                                        ua91 ua91VarT6 = s7qVar3.T4();
                                                        ccc0 ccc0Var8 = (ccc0) s7qVar3.L1.get();
                                                        ijr ijrVar8 = (ijr) s7qVar3.b3.get();
                                                        daq daqVar8 = s7qVar3.b;
                                                        ks6Var = new ks6(lik1Var2, link, f971Var8, jl21Var8, ua91VarT6, new a680(ccc0Var8, ijrVar8, (kt91) daqVar8.f8.get(), (dg30) s7qVar3.t.a, (q8n) daqVar8.w1.get()), (oh41) s7qVar3.H3.get(), s7qVar3.O1(), s7qVar3.B4(), new wp20((ccc0) s7qVar3.L1.get(), (ijr) s7qVar3.b3.get(), (kt91) daqVar8.f8.get(), (dg30) s7qVar3.t.a, (q8n) daqVar8.w1.get()), s7qVar3.X(), new her((ayl) s7qVar3.l3.get(), (byte) 24), s7qVar3.f1(), s7qVar3.E3(), s7qVar3.o3(), s7qVar3.j5(), s7qVar3.p3(), s7qVar3.Q(), s7qVar3.Y0());
                                                        s4b1Var = s4b1VarX;
                                                        break;
                                                    default:
                                                        teq teqVar3 = m5qVar.b.d;
                                                        f971 f971Var9 = (f971) teqVar3.O3.get();
                                                        jl21 jl21Var9 = (jl21) teqVar3.l2.get();
                                                        ua91 ua91VarJ5 = teqVar3.J3();
                                                        ccc0 ccc0Var9 = (ccc0) teqVar3.q3.get();
                                                        ijr ijrVar9 = (ijr) teqVar3.n5.get();
                                                        daq daqVar9 = teqVar3.d;
                                                        blc0Var3 = blc0Var2;
                                                        ks6Var = new ks6(lik1Var2, link, f971Var9, jl21Var9, ua91VarJ5, new a680(ccc0Var9, ijrVar9, (kt91) daqVar9.f8.get(), (dg30) teqVar3.f.a, (q8n) daqVar9.w1.get()), (oh41) teqVar3.P3.get(), teqVar3.a1(), teqVar3.s3(), new wp20((ccc0) teqVar3.q3.get(), (ijr) teqVar3.n5.get(), (kt91) daqVar9.f8.get(), (dg30) teqVar3.f.a, (q8n) daqVar9.w1.get()), teqVar3.b0(), new her((ayl) teqVar3.x3.get(), (byte) 24), new gmt((ca40) teqVar3.f2.get(), (ik21) teqVar3.h2.get(), (byte) 4), teqVar3.A2(), teqVar3.n2(), teqVar3.X3(), teqVar3.o2(), new i6b((xb40) teqVar3.J5.get(), (byte) 0), teqVar3.B0());
                                                        s4b1Var = s4b1VarX;
                                                        break;
                                                }
                                                lik1Var3 = (lik1) ks6Var.a;
                                                str = (String) ks6Var.b;
                                                smc0VarN = k4p1.n();
                                                bm6Var = this.V0;
                                                if (bm6Var.c) {
                                                    followed = collectionArtist9.p().getFollowed();
                                                    boolean isBanned4 = collectionArtist9.p().getIsBanned();
                                                    wp20 wp20Var3 = (wp20) ks6Var.t;
                                                    if (followed) {
                                                        fuxVar = fux.c;
                                                    } else {
                                                        fuxVar = hnx.c;
                                                    }
                                                    fux fuxVar4 = fuxVar;
                                                    if (followed) {
                                                        i2 = 2131954468;
                                                    } else {
                                                        i2 = 2131954371;
                                                    }
                                                    str2 = str;
                                                    smc0VarN.add(new jhm("collection_follow_artist", fuxVar4, (fhm) null, Integer.valueOf(i2), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ll20.d1, new cl1(followed, str, (byte) 15)), new ew8(wp20Var3, followed, str, isBanned4, (byte) 2)), 244));
                                                } else {
                                                    str2 = str;
                                                }
                                                if (!bm6Var.a) {
                                                }
                                                if (bm6Var.f) {
                                                    artistCollectionStateP = collectionArtist9.p();
                                                    if (artistCollectionStateP.getNumTracksInCollection() <= 0) {
                                                    }
                                                    String collectionLink3 = collectionArtist9.p().getCollectionLink();
                                                    ArtistSyncState artistSyncStateR3 = collectionArtist9.r();
                                                    xwp0VarO = dm5.O(artistSyncStateR3.getSyncProgress(), artistSyncStateR3.getOffline());
                                                    if (xwp0VarO.equals(rwp0.a)) {
                                                        z22 = false;
                                                    } else {
                                                        z22 = false;
                                                    }
                                                    her herVar3 = (her) ks6Var.Y;
                                                    if (z22) {
                                                        umxVar = umx.c;
                                                    } else {
                                                        umxVar = tmx.c;
                                                    }
                                                    umx umxVar4 = umxVar;
                                                    if (z22) {
                                                        i = 2131954467;
                                                    } else {
                                                        i = 2131954366;
                                                    }
                                                    Integer numValueOf3 = Integer.valueOf(i);
                                                    ygm ygmVar3 = new ygm(2);
                                                    if (z22) {
                                                        hhmVar = hhm.b;
                                                    } else {
                                                        hhmVar = hhm.a;
                                                    }
                                                    smc0VarN.add(new jhm("artist_download", umxVar4, (fhm) null, numValueOf3, (String) null, false, (tm81) null, new ihm(ygmVar3, hhmVar, new ghm(wiu.T0, new cl1(z22, collectionLink3, (byte) 10)), new c30(z22, herVar3, collectionLink3, (byte) 12)), 244));
                                                    break;
                                                }
                                                if (bm6Var.t) {
                                                    smc0VarN.add(js6Var.n.d());
                                                }
                                                ugo0Var = bm6Var.h;
                                                if (ugo0Var != null) {
                                                    if (ugo0Var.a) {
                                                        jhmVarS2 = ((kqi0) ks6Var.O0).k(ugo0Var);
                                                    } else {
                                                        jhmVarS2 = ((dxy) ks6Var.Q0).s(ugo0Var);
                                                    }
                                                    smc0VarN.add(jhmVarS2);
                                                }
                                                p860Var = bm6Var.X;
                                                if (p860Var != null) {
                                                    smc0VarN.add(js6Var.o.h(p860Var));
                                                }
                                                zJ = u890.j(vum1Var6, tum1.a);
                                                e2t0Var = e2t0.b;
                                                if (!zJ) {
                                                    if (!(vum1Var6 instanceof uum1)) {
                                                        lik1Var4 = lik1Var3;
                                                        smc0VarN.add(((tzr0) ks6Var.N0).g(str2, e2t0Var, lik1Var4));
                                                    }
                                                    if (lik1Var2.equals(nik1.q2)) {
                                                        blc0Var4 = blc0Var;
                                                        smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                                    } else {
                                                        blc0Var4 = blc0Var;
                                                        smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                                    }
                                                    blc0Var4 = blc0Var;
                                                    jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                                    if (jhmVarS != null) {
                                                        smc0VarN.add(jhmVarS);
                                                    }
                                                    if (!bm6Var.b) {
                                                        smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                                    }
                                                    if (z16) {
                                                        smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                                    }
                                                    if (((no4) js6Var.a.a.get()).h()) {
                                                        smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                                    }
                                                    if (!bm6Var.g) {
                                                        smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                                    }
                                                    if (z20) {
                                                        z21 = false;
                                                    } else {
                                                        z21 = false;
                                                    }
                                                    if (js6Var.m.a) {
                                                        smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                                    }
                                                    ok51Var = bm6Var.i;
                                                    if (ok51Var != null) {
                                                        smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                                    }
                                                    if (bm6Var.d) {
                                                        smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                                    } else {
                                                        smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                                    }
                                                    if (z19) {
                                                        smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                                    }
                                                    smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                                    smc0 smc0VarK5 = k4p1.k(smc0VarN);
                                                    String standardLink5 = collectionArtist9.q().getPortraits().getStandardLink();
                                                    String name13 = collectionArtist9.q().getName();
                                                    standardLink5.getClass();
                                                    String name14 = collectionArtist9.q().getName();
                                                    String name15 = collectionArtist9.q().getName();
                                                    uwr uwrVar5 = cbx.a;
                                                    return new kjm(new igm(name13, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink5, name14, name15)})), (String) null, 4), smc0VarK5, 4);
                                                }
                                                smc0VarN.add(((dlg1) ks6Var.P0).i(str2, e2t0Var));
                                                lik1Var4 = lik1Var3;
                                                if (lik1Var2.equals(nik1.q2)) {
                                                    blc0Var4 = blc0Var;
                                                    smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                                } else {
                                                    blc0Var4 = blc0Var;
                                                    smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                                }
                                                blc0Var4 = blc0Var;
                                                jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                                if (jhmVarS != null) {
                                                    smc0VarN.add(jhmVarS);
                                                }
                                                if (!bm6Var.b) {
                                                    smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                                }
                                                if (z16) {
                                                    smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                                }
                                                if (((no4) js6Var.a.a.get()).h()) {
                                                    smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                                }
                                                if (!bm6Var.g) {
                                                    smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                                }
                                                if (z20) {
                                                    z21 = false;
                                                } else {
                                                    z21 = false;
                                                }
                                                if (js6Var.m.a) {
                                                    smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                                }
                                                ok51Var = bm6Var.i;
                                                if (ok51Var != null) {
                                                    smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                                }
                                                if (bm6Var.d) {
                                                    smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                                } else {
                                                    smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                                }
                                                if (z19) {
                                                    smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                                }
                                                smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                                smc0 smc0VarK6 = k4p1.k(smc0VarN);
                                                String standardLink6 = collectionArtist9.q().getPortraits().getStandardLink();
                                                String name16 = collectionArtist9.q().getName();
                                                standardLink6.getClass();
                                                String name17 = collectionArtist9.q().getName();
                                                String name18 = collectionArtist9.q().getName();
                                                uwr uwrVar6 = cbx.a;
                                                return new kjm(new igm(name16, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink6, name17, name18)})), (String) null, 4), smc0VarK6, 4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return d9nVar;
            case 3:
                obj2 = null;
                vum1Var2 = this.X;
                CollectionArtist collectionArtist13 = this.t;
                l2t l2tVar41 = this.i;
                l2t l2tVar42 = this.h;
                l2tVar12 = this.g;
                l2t l2tVar43 = this.f;
                l2tVar6 = this.e;
                l2tVar15 = this.d;
                l2tVar14 = this.c;
                hm5.M(obj);
                l2tVar10 = l2tVar41;
                l2tVar11 = l2tVar43;
                lik1Var = lik1Var5;
                s2tVar = null;
                objE2 = obj;
                l2tVar13 = l2tVar42;
                collectionArtist3 = collectionArtist13;
                js6Var = js6Var2;
                d9nVar = d9nVar2;
                zBooleanValue = ((Boolean) objE2).booleanValue();
                this.T0 = s2tVar;
                this.a = s2tVar;
                this.b = s2tVar;
                this.c = l2tVar14;
                this.d = s2tVar;
                this.e = l2tVar6;
                this.f = l2tVar11;
                this.g = l2tVar12;
                this.h = l2tVar13;
                this.i = l2tVar10;
                this.t = collectionArtist3;
                this.X = vum1Var2;
                this.Z = zBooleanValue;
                this.S0 = (byte) 4;
                objE3 = l2tVar15.E(this);
                if (objE3 != d9nVar) {
                    CollectionArtist collectionArtist14 = collectionArtist3;
                    vum1Var3 = vum1Var2;
                    z = zBooleanValue;
                    l2tVar16 = l2tVar12;
                    l2tVar17 = l2tVar13;
                    l2tVar18 = l2tVar10;
                    collectionArtist4 = collectionArtist14;
                    l2t l2tVar214 = l2tVar14;
                    l2tVar19 = l2tVar6;
                    l2tVar20 = l2tVar214;
                    zBooleanValue2 = ((Boolean) objE3).booleanValue();
                    this.T0 = s2tVar;
                    this.a = s2tVar;
                    this.b = s2tVar;
                    this.c = s2tVar;
                    this.d = s2tVar;
                    this.e = l2tVar19;
                    this.f = l2tVar11;
                    this.g = l2tVar16;
                    this.h = l2tVar17;
                    this.i = l2tVar18;
                    this.t = collectionArtist4;
                    this.X = vum1Var3;
                    this.Z = z;
                    this.N0 = zBooleanValue2;
                    this.S0 = (byte) 5;
                    objE4 = l2tVar20.E(this);
                    if (objE4 != d9nVar) {
                        vum1 vum1Var10 = vum1Var3;
                        z2 = z;
                        z3 = zBooleanValue2;
                        l2tVar21 = l2tVar16;
                        l2tVar22 = l2tVar11;
                        l2tVar23 = l2tVar17;
                        collectionArtist5 = collectionArtist4;
                        vum1Var4 = vum1Var10;
                        zBooleanValue3 = ((Boolean) objE4).booleanValue();
                        this.T0 = s2tVar;
                        this.a = s2tVar;
                        this.b = s2tVar;
                        this.c = s2tVar;
                        this.d = s2tVar;
                        this.e = l2tVar19;
                        this.f = l2tVar22;
                        this.g = s2tVar;
                        this.h = l2tVar23;
                        this.i = l2tVar18;
                        this.t = collectionArtist5;
                        this.X = vum1Var4;
                        this.Z = z2;
                        this.N0 = z3;
                        this.O0 = zBooleanValue3;
                        this.S0 = (byte) 6;
                        objE5 = l2tVar21.E(this);
                        if (objE5 != d9nVar) {
                            boolean z2114 = z2;
                            z4 = z3;
                            z5 = zBooleanValue3;
                            l2tVar24 = l2tVar23;
                            l2tVar25 = l2tVar18;
                            collectionArtist6 = collectionArtist5;
                            vum1Var5 = vum1Var4;
                            z6 = z2114;
                            zBooleanValue4 = ((Boolean) objE5).booleanValue();
                            this.T0 = s2tVar;
                            this.a = s2tVar;
                            this.b = s2tVar;
                            this.c = s2tVar;
                            this.d = s2tVar;
                            this.e = l2tVar19;
                            this.f = l2tVar22;
                            this.g = s2tVar;
                            this.h = s2tVar;
                            this.i = l2tVar25;
                            this.t = collectionArtist6;
                            this.X = vum1Var5;
                            this.Z = z6;
                            this.N0 = z4;
                            this.O0 = z5;
                            this.P0 = zBooleanValue4;
                            this.S0 = (byte) 7;
                            objE6 = l2tVar24.E(this);
                            if (objE6 != d9nVar) {
                                boolean z2115 = z4;
                                z7 = z5;
                                z8 = zBooleanValue4;
                                collectionArtist7 = collectionArtist6;
                                vum1Var6 = vum1Var5;
                                z9 = z6;
                                z10 = z2115;
                                qrg1Var = (qrg1) objE6;
                                this.T0 = s2tVar;
                                this.a = s2tVar;
                                this.b = s2tVar;
                                this.c = s2tVar;
                                this.d = s2tVar;
                                this.e = s2tVar;
                                this.f = l2tVar22;
                                this.g = s2tVar;
                                this.h = s2tVar;
                                this.i = l2tVar25;
                                this.t = collectionArtist7;
                                this.X = vum1Var6;
                                this.Y = qrg1Var;
                                this.Z = z9;
                                this.N0 = z10;
                                this.O0 = z7;
                                this.P0 = z8;
                                this.S0 = (byte) 8;
                                objE7 = l2tVar19.E(this);
                                if (objE7 != d9nVar) {
                                    l2tVar26 = l2tVar22;
                                    zBooleanValue5 = ((Boolean) objE7).booleanValue();
                                    this.T0 = s2tVar;
                                    this.a = s2tVar;
                                    this.b = s2tVar;
                                    this.c = s2tVar;
                                    this.d = s2tVar;
                                    this.e = s2tVar;
                                    this.f = s2tVar;
                                    this.g = s2tVar;
                                    this.h = s2tVar;
                                    this.i = l2tVar25;
                                    this.t = collectionArtist7;
                                    this.X = vum1Var6;
                                    this.Y = qrg1Var;
                                    this.Z = z9;
                                    this.N0 = z10;
                                    this.O0 = z7;
                                    this.P0 = z8;
                                    this.Q0 = zBooleanValue5;
                                    this.S0 = (byte) 9;
                                    objE8 = l2tVar26.E(this);
                                    if (objE8 != d9nVar) {
                                        boolean z2116 = z7;
                                        z11 = z8;
                                        z12 = zBooleanValue5;
                                        z13 = z10;
                                        z14 = z2116;
                                        z15 = z9;
                                        qrg1Var2 = qrg1Var;
                                        collectionArtist8 = collectionArtist7;
                                        l2tVar27 = l2tVar25;
                                        zBooleanValue6 = ((Boolean) objE8).booleanValue();
                                        this.T0 = s2tVar;
                                        this.a = s2tVar;
                                        this.b = s2tVar;
                                        this.c = s2tVar;
                                        this.d = s2tVar;
                                        this.e = s2tVar;
                                        this.f = s2tVar;
                                        this.g = s2tVar;
                                        this.h = s2tVar;
                                        this.i = s2tVar;
                                        this.t = collectionArtist8;
                                        this.X = vum1Var6;
                                        this.Y = qrg1Var2;
                                        this.Z = z15;
                                        this.N0 = z13;
                                        this.O0 = z14;
                                        this.P0 = z11;
                                        this.Q0 = z12;
                                        this.R0 = zBooleanValue6;
                                        this.S0 = (byte) 10;
                                        objE9 = l2tVar27.E(this);
                                        if (objE9 != d9nVar) {
                                            boolean z2117 = z11;
                                            z16 = z12;
                                            z17 = zBooleanValue6;
                                            collectionArtist9 = collectionArtist8;
                                            qrg1Var3 = qrg1Var2;
                                            z18 = z14;
                                            z19 = z2117;
                                            boolean z2118 = z13;
                                            boolean z2119 = z15;
                                            bs6 bs6Var4 = (bs6) objE9;
                                            Set set4 = s4b1.f;
                                            lik1Var2 = lik1Var;
                                            s4b1VarX = uic.x(lik1Var2.a);
                                            blc0Var = s4b1VarX.c;
                                            blc0Var2 = blc0.v1;
                                            if (blc0Var == blc0Var2) {
                                                z20 = true;
                                            } else {
                                                z20 = false;
                                            }
                                            m5qVar = js6Var.k;
                                            link = collectionArtist9.q().getLink();
                                            boolean z21110 = z17;
                                            switch (m5qVar.a) {
                                                case 0:
                                                    z16 = z16;
                                                    z19 = z19;
                                                    z18 = z18;
                                                    blc0Var = blc0Var;
                                                    blc0Var3 = blc0Var2;
                                                    v5q v5qVar4 = m5qVar.b.c;
                                                    f971 f971Var10 = (f971) v5qVar4.E5.get();
                                                    jl21 jl21Var10 = (jl21) v5qVar4.s2.get();
                                                    ua91 ua91VarD3 = v5qVar4.D0();
                                                    ccc0 ccc0Var10 = (ccc0) v5qVar4.H2.get();
                                                    ijr ijrVar10 = (ijr) v5qVar4.o6.get();
                                                    daq daqVar10 = v5qVar4.b;
                                                    s4b1Var = s4b1VarX;
                                                    ks6Var = new ks6(lik1Var2, link, f971Var10, jl21Var10, ua91VarD3, new a680(ccc0Var10, ijrVar10, (kt91) daqVar10.f8.get(), (dg30) v5qVar4.i.a, (q8n) daqVar10.w1.get()), (oh41) v5qVar4.M5.get(), new uf0((Context) daqVar10.x1.a), v5qVar4.y0(), new wp20((ccc0) v5qVar4.H2.get(), (ijr) v5qVar4.o6.get(), (kt91) daqVar10.f8.get(), (dg30) v5qVar4.i.a, (q8n) daqVar10.w1.get()), v5qVar4.p(), new her((ayl) v5qVar4.F2.get(), (byte) 24), new gmt((ca40) v5qVar4.V0.get(), (ik21) v5qVar4.Y0.get(), (byte) 4), v5qVar4.n0(), v5qVar4.h0(), v5qVar4.G0(), v5qVar4.i0(), new i6b((xb40) v5qVar4.b8.get(), (byte) 0), v5qVar4.A());
                                                    break;
                                                case 1:
                                                    blc0Var3 = blc0Var2;
                                                    s7q s7qVar4 = m5qVar.b.d;
                                                    f971 f971Var11 = (f971) s7qVar4.E3.get();
                                                    jl21 jl21Var11 = (jl21) s7qVar4.G3.get();
                                                    ua91 ua91VarT7 = s7qVar4.T4();
                                                    ccc0 ccc0Var11 = (ccc0) s7qVar4.L1.get();
                                                    ijr ijrVar11 = (ijr) s7qVar4.b3.get();
                                                    daq daqVar11 = s7qVar4.b;
                                                    ks6Var = new ks6(lik1Var2, link, f971Var11, jl21Var11, ua91VarT7, new a680(ccc0Var11, ijrVar11, (kt91) daqVar11.f8.get(), (dg30) s7qVar4.t.a, (q8n) daqVar11.w1.get()), (oh41) s7qVar4.H3.get(), s7qVar4.O1(), s7qVar4.B4(), new wp20((ccc0) s7qVar4.L1.get(), (ijr) s7qVar4.b3.get(), (kt91) daqVar11.f8.get(), (dg30) s7qVar4.t.a, (q8n) daqVar11.w1.get()), s7qVar4.X(), new her((ayl) s7qVar4.l3.get(), (byte) 24), s7qVar4.f1(), s7qVar4.E3(), s7qVar4.o3(), s7qVar4.j5(), s7qVar4.p3(), s7qVar4.Q(), s7qVar4.Y0());
                                                    s4b1Var = s4b1VarX;
                                                    break;
                                                default:
                                                    teq teqVar4 = m5qVar.b.d;
                                                    f971 f971Var12 = (f971) teqVar4.O3.get();
                                                    jl21 jl21Var12 = (jl21) teqVar4.l2.get();
                                                    ua91 ua91VarJ6 = teqVar4.J3();
                                                    ccc0 ccc0Var12 = (ccc0) teqVar4.q3.get();
                                                    ijr ijrVar12 = (ijr) teqVar4.n5.get();
                                                    daq daqVar12 = teqVar4.d;
                                                    blc0Var3 = blc0Var2;
                                                    ks6Var = new ks6(lik1Var2, link, f971Var12, jl21Var12, ua91VarJ6, new a680(ccc0Var12, ijrVar12, (kt91) daqVar12.f8.get(), (dg30) teqVar4.f.a, (q8n) daqVar12.w1.get()), (oh41) teqVar4.P3.get(), teqVar4.a1(), teqVar4.s3(), new wp20((ccc0) teqVar4.q3.get(), (ijr) teqVar4.n5.get(), (kt91) daqVar12.f8.get(), (dg30) teqVar4.f.a, (q8n) daqVar12.w1.get()), teqVar4.b0(), new her((ayl) teqVar4.x3.get(), (byte) 24), new gmt((ca40) teqVar4.f2.get(), (ik21) teqVar4.h2.get(), (byte) 4), teqVar4.A2(), teqVar4.n2(), teqVar4.X3(), teqVar4.o2(), new i6b((xb40) teqVar4.J5.get(), (byte) 0), teqVar4.B0());
                                                    s4b1Var = s4b1VarX;
                                                    break;
                                            }
                                            lik1Var3 = (lik1) ks6Var.a;
                                            str = (String) ks6Var.b;
                                            smc0VarN = k4p1.n();
                                            bm6Var = this.V0;
                                            if (bm6Var.c) {
                                                followed = collectionArtist9.p().getFollowed();
                                                boolean isBanned5 = collectionArtist9.p().getIsBanned();
                                                wp20 wp20Var4 = (wp20) ks6Var.t;
                                                if (followed) {
                                                    fuxVar = fux.c;
                                                } else {
                                                    fuxVar = hnx.c;
                                                }
                                                fux fuxVar5 = fuxVar;
                                                if (followed) {
                                                    i2 = 2131954468;
                                                } else {
                                                    i2 = 2131954371;
                                                }
                                                str2 = str;
                                                smc0VarN.add(new jhm("collection_follow_artist", fuxVar5, (fhm) null, Integer.valueOf(i2), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ll20.d1, new cl1(followed, str, (byte) 15)), new ew8(wp20Var4, followed, str, isBanned5, (byte) 2)), 244));
                                            } else {
                                                str2 = str;
                                            }
                                            if (!bm6Var.a) {
                                            }
                                            if (bm6Var.f) {
                                                artistCollectionStateP = collectionArtist9.p();
                                                if (artistCollectionStateP.getNumTracksInCollection() <= 0) {
                                                }
                                                String collectionLink4 = collectionArtist9.p().getCollectionLink();
                                                ArtistSyncState artistSyncStateR4 = collectionArtist9.r();
                                                xwp0VarO = dm5.O(artistSyncStateR4.getSyncProgress(), artistSyncStateR4.getOffline());
                                                if (xwp0VarO.equals(rwp0.a)) {
                                                    z22 = false;
                                                } else {
                                                    z22 = false;
                                                }
                                                her herVar4 = (her) ks6Var.Y;
                                                if (z22) {
                                                    umxVar = umx.c;
                                                } else {
                                                    umxVar = tmx.c;
                                                }
                                                umx umxVar5 = umxVar;
                                                if (z22) {
                                                    i = 2131954467;
                                                } else {
                                                    i = 2131954366;
                                                }
                                                Integer numValueOf4 = Integer.valueOf(i);
                                                ygm ygmVar4 = new ygm(2);
                                                if (z22) {
                                                    hhmVar = hhm.b;
                                                } else {
                                                    hhmVar = hhm.a;
                                                }
                                                smc0VarN.add(new jhm("artist_download", umxVar5, (fhm) null, numValueOf4, (String) null, false, (tm81) null, new ihm(ygmVar4, hhmVar, new ghm(wiu.T0, new cl1(z22, collectionLink4, (byte) 10)), new c30(z22, herVar4, collectionLink4, (byte) 12)), 244));
                                                break;
                                            }
                                            if (bm6Var.t) {
                                                smc0VarN.add(js6Var.n.d());
                                            }
                                            ugo0Var = bm6Var.h;
                                            if (ugo0Var != null) {
                                                if (ugo0Var.a) {
                                                    jhmVarS2 = ((kqi0) ks6Var.O0).k(ugo0Var);
                                                } else {
                                                    jhmVarS2 = ((dxy) ks6Var.Q0).s(ugo0Var);
                                                }
                                                smc0VarN.add(jhmVarS2);
                                            }
                                            p860Var = bm6Var.X;
                                            if (p860Var != null) {
                                                smc0VarN.add(js6Var.o.h(p860Var));
                                            }
                                            zJ = u890.j(vum1Var6, tum1.a);
                                            e2t0Var = e2t0.b;
                                            if (!zJ) {
                                                if (!(vum1Var6 instanceof uum1)) {
                                                    lik1Var4 = lik1Var3;
                                                    smc0VarN.add(((tzr0) ks6Var.N0).g(str2, e2t0Var, lik1Var4));
                                                }
                                                if (lik1Var2.equals(nik1.q2)) {
                                                    blc0Var4 = blc0Var;
                                                    smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                                } else {
                                                    blc0Var4 = blc0Var;
                                                    smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                                }
                                                blc0Var4 = blc0Var;
                                                jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                                if (jhmVarS != null) {
                                                    smc0VarN.add(jhmVarS);
                                                }
                                                if (!bm6Var.b) {
                                                    smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                                }
                                                if (z16) {
                                                    smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                                }
                                                if (((no4) js6Var.a.a.get()).h()) {
                                                    smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                                }
                                                if (!bm6Var.g) {
                                                    smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                                }
                                                if (z20) {
                                                    z21 = false;
                                                } else {
                                                    z21 = false;
                                                }
                                                if (js6Var.m.a) {
                                                    smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                                }
                                                ok51Var = bm6Var.i;
                                                if (ok51Var != null) {
                                                    smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                                }
                                                if (bm6Var.d) {
                                                    smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                                } else {
                                                    smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                                }
                                                if (z19) {
                                                    smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                                }
                                                smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                                smc0 smc0VarK7 = k4p1.k(smc0VarN);
                                                String standardLink7 = collectionArtist9.q().getPortraits().getStandardLink();
                                                String name19 = collectionArtist9.q().getName();
                                                standardLink7.getClass();
                                                String name110 = collectionArtist9.q().getName();
                                                String name111 = collectionArtist9.q().getName();
                                                uwr uwrVar7 = cbx.a;
                                                return new kjm(new igm(name19, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink7, name110, name111)})), (String) null, 4), smc0VarK7, 4);
                                            }
                                            smc0VarN.add(((dlg1) ks6Var.P0).i(str2, e2t0Var));
                                            lik1Var4 = lik1Var3;
                                            if (lik1Var2.equals(nik1.q2)) {
                                                blc0Var4 = blc0Var;
                                                smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                            } else {
                                                blc0Var4 = blc0Var;
                                                smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                            }
                                            blc0Var4 = blc0Var;
                                            jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                            if (jhmVarS != null) {
                                                smc0VarN.add(jhmVarS);
                                            }
                                            if (!bm6Var.b) {
                                                smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                            }
                                            if (z16) {
                                                smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                            }
                                            if (((no4) js6Var.a.a.get()).h()) {
                                                smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                            }
                                            if (!bm6Var.g) {
                                                smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                            }
                                            if (z20) {
                                                z21 = false;
                                            } else {
                                                z21 = false;
                                            }
                                            if (js6Var.m.a) {
                                                smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                            }
                                            ok51Var = bm6Var.i;
                                            if (ok51Var != null) {
                                                smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                            }
                                            if (bm6Var.d) {
                                                smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                            } else {
                                                smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                            }
                                            if (z19) {
                                                smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                            }
                                            smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                            smc0 smc0VarK8 = k4p1.k(smc0VarN);
                                            String standardLink8 = collectionArtist9.q().getPortraits().getStandardLink();
                                            String name112 = collectionArtist9.q().getName();
                                            standardLink8.getClass();
                                            String name113 = collectionArtist9.q().getName();
                                            String name114 = collectionArtist9.q().getName();
                                            uwr uwrVar8 = cbx.a;
                                            return new kjm(new igm(name112, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink8, name113, name114)})), (String) null, 4), smc0VarK8, 4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return d9nVar;
            case 4:
                obj2 = null;
                z = this.Z;
                vum1 vum1Var11 = this.X;
                CollectionArtist collectionArtist15 = this.t;
                l2t l2tVar44 = this.i;
                l2tVar17 = this.h;
                l2t l2tVar45 = this.g;
                l2t l2tVar46 = this.f;
                l2tVar19 = this.e;
                l2t l2tVar47 = this.c;
                hm5.M(obj);
                vum1Var3 = vum1Var11;
                js6Var = js6Var2;
                d9nVar = d9nVar2;
                l2tVar16 = l2tVar45;
                l2tVar20 = l2tVar47;
                l2tVar18 = l2tVar44;
                collectionArtist4 = collectionArtist15;
                l2tVar11 = l2tVar46;
                lik1Var = lik1Var5;
                s2tVar = null;
                objE3 = obj;
                zBooleanValue2 = ((Boolean) objE3).booleanValue();
                this.T0 = s2tVar;
                this.a = s2tVar;
                this.b = s2tVar;
                this.c = s2tVar;
                this.d = s2tVar;
                this.e = l2tVar19;
                this.f = l2tVar11;
                this.g = l2tVar16;
                this.h = l2tVar17;
                this.i = l2tVar18;
                this.t = collectionArtist4;
                this.X = vum1Var3;
                this.Z = z;
                this.N0 = zBooleanValue2;
                this.S0 = (byte) 5;
                objE4 = l2tVar20.E(this);
                if (objE4 != d9nVar) {
                    vum1 vum1Var12 = vum1Var3;
                    z2 = z;
                    z3 = zBooleanValue2;
                    l2tVar21 = l2tVar16;
                    l2tVar22 = l2tVar11;
                    l2tVar23 = l2tVar17;
                    collectionArtist5 = collectionArtist4;
                    vum1Var4 = vum1Var12;
                    zBooleanValue3 = ((Boolean) objE4).booleanValue();
                    this.T0 = s2tVar;
                    this.a = s2tVar;
                    this.b = s2tVar;
                    this.c = s2tVar;
                    this.d = s2tVar;
                    this.e = l2tVar19;
                    this.f = l2tVar22;
                    this.g = s2tVar;
                    this.h = l2tVar23;
                    this.i = l2tVar18;
                    this.t = collectionArtist5;
                    this.X = vum1Var4;
                    this.Z = z2;
                    this.N0 = z3;
                    this.O0 = zBooleanValue3;
                    this.S0 = (byte) 6;
                    objE5 = l2tVar21.E(this);
                    if (objE5 != d9nVar) {
                        boolean z21111 = z2;
                        z4 = z3;
                        z5 = zBooleanValue3;
                        l2tVar24 = l2tVar23;
                        l2tVar25 = l2tVar18;
                        collectionArtist6 = collectionArtist5;
                        vum1Var5 = vum1Var4;
                        z6 = z21111;
                        zBooleanValue4 = ((Boolean) objE5).booleanValue();
                        this.T0 = s2tVar;
                        this.a = s2tVar;
                        this.b = s2tVar;
                        this.c = s2tVar;
                        this.d = s2tVar;
                        this.e = l2tVar19;
                        this.f = l2tVar22;
                        this.g = s2tVar;
                        this.h = s2tVar;
                        this.i = l2tVar25;
                        this.t = collectionArtist6;
                        this.X = vum1Var5;
                        this.Z = z6;
                        this.N0 = z4;
                        this.O0 = z5;
                        this.P0 = zBooleanValue4;
                        this.S0 = (byte) 7;
                        objE6 = l2tVar24.E(this);
                        if (objE6 != d9nVar) {
                            boolean z21112 = z4;
                            z7 = z5;
                            z8 = zBooleanValue4;
                            collectionArtist7 = collectionArtist6;
                            vum1Var6 = vum1Var5;
                            z9 = z6;
                            z10 = z21112;
                            qrg1Var = (qrg1) objE6;
                            this.T0 = s2tVar;
                            this.a = s2tVar;
                            this.b = s2tVar;
                            this.c = s2tVar;
                            this.d = s2tVar;
                            this.e = s2tVar;
                            this.f = l2tVar22;
                            this.g = s2tVar;
                            this.h = s2tVar;
                            this.i = l2tVar25;
                            this.t = collectionArtist7;
                            this.X = vum1Var6;
                            this.Y = qrg1Var;
                            this.Z = z9;
                            this.N0 = z10;
                            this.O0 = z7;
                            this.P0 = z8;
                            this.S0 = (byte) 8;
                            objE7 = l2tVar19.E(this);
                            if (objE7 != d9nVar) {
                                l2tVar26 = l2tVar22;
                                zBooleanValue5 = ((Boolean) objE7).booleanValue();
                                this.T0 = s2tVar;
                                this.a = s2tVar;
                                this.b = s2tVar;
                                this.c = s2tVar;
                                this.d = s2tVar;
                                this.e = s2tVar;
                                this.f = s2tVar;
                                this.g = s2tVar;
                                this.h = s2tVar;
                                this.i = l2tVar25;
                                this.t = collectionArtist7;
                                this.X = vum1Var6;
                                this.Y = qrg1Var;
                                this.Z = z9;
                                this.N0 = z10;
                                this.O0 = z7;
                                this.P0 = z8;
                                this.Q0 = zBooleanValue5;
                                this.S0 = (byte) 9;
                                objE8 = l2tVar26.E(this);
                                if (objE8 != d9nVar) {
                                    boolean z21113 = z7;
                                    z11 = z8;
                                    z12 = zBooleanValue5;
                                    z13 = z10;
                                    z14 = z21113;
                                    z15 = z9;
                                    qrg1Var2 = qrg1Var;
                                    collectionArtist8 = collectionArtist7;
                                    l2tVar27 = l2tVar25;
                                    zBooleanValue6 = ((Boolean) objE8).booleanValue();
                                    this.T0 = s2tVar;
                                    this.a = s2tVar;
                                    this.b = s2tVar;
                                    this.c = s2tVar;
                                    this.d = s2tVar;
                                    this.e = s2tVar;
                                    this.f = s2tVar;
                                    this.g = s2tVar;
                                    this.h = s2tVar;
                                    this.i = s2tVar;
                                    this.t = collectionArtist8;
                                    this.X = vum1Var6;
                                    this.Y = qrg1Var2;
                                    this.Z = z15;
                                    this.N0 = z13;
                                    this.O0 = z14;
                                    this.P0 = z11;
                                    this.Q0 = z12;
                                    this.R0 = zBooleanValue6;
                                    this.S0 = (byte) 10;
                                    objE9 = l2tVar27.E(this);
                                    if (objE9 != d9nVar) {
                                        boolean z21114 = z11;
                                        z16 = z12;
                                        z17 = zBooleanValue6;
                                        collectionArtist9 = collectionArtist8;
                                        qrg1Var3 = qrg1Var2;
                                        z18 = z14;
                                        z19 = z21114;
                                        boolean z21115 = z13;
                                        boolean z21116 = z15;
                                        bs6 bs6Var5 = (bs6) objE9;
                                        Set set5 = s4b1.f;
                                        lik1Var2 = lik1Var;
                                        s4b1VarX = uic.x(lik1Var2.a);
                                        blc0Var = s4b1VarX.c;
                                        blc0Var2 = blc0.v1;
                                        if (blc0Var == blc0Var2) {
                                            z20 = true;
                                        } else {
                                            z20 = false;
                                        }
                                        m5qVar = js6Var.k;
                                        link = collectionArtist9.q().getLink();
                                        boolean z21117 = z17;
                                        switch (m5qVar.a) {
                                            case 0:
                                                z16 = z16;
                                                z19 = z19;
                                                z18 = z18;
                                                blc0Var = blc0Var;
                                                blc0Var3 = blc0Var2;
                                                v5q v5qVar5 = m5qVar.b.c;
                                                f971 f971Var13 = (f971) v5qVar5.E5.get();
                                                jl21 jl21Var13 = (jl21) v5qVar5.s2.get();
                                                ua91 ua91VarD4 = v5qVar5.D0();
                                                ccc0 ccc0Var13 = (ccc0) v5qVar5.H2.get();
                                                ijr ijrVar13 = (ijr) v5qVar5.o6.get();
                                                daq daqVar13 = v5qVar5.b;
                                                s4b1Var = s4b1VarX;
                                                ks6Var = new ks6(lik1Var2, link, f971Var13, jl21Var13, ua91VarD4, new a680(ccc0Var13, ijrVar13, (kt91) daqVar13.f8.get(), (dg30) v5qVar5.i.a, (q8n) daqVar13.w1.get()), (oh41) v5qVar5.M5.get(), new uf0((Context) daqVar13.x1.a), v5qVar5.y0(), new wp20((ccc0) v5qVar5.H2.get(), (ijr) v5qVar5.o6.get(), (kt91) daqVar13.f8.get(), (dg30) v5qVar5.i.a, (q8n) daqVar13.w1.get()), v5qVar5.p(), new her((ayl) v5qVar5.F2.get(), (byte) 24), new gmt((ca40) v5qVar5.V0.get(), (ik21) v5qVar5.Y0.get(), (byte) 4), v5qVar5.n0(), v5qVar5.h0(), v5qVar5.G0(), v5qVar5.i0(), new i6b((xb40) v5qVar5.b8.get(), (byte) 0), v5qVar5.A());
                                                break;
                                            case 1:
                                                blc0Var3 = blc0Var2;
                                                s7q s7qVar5 = m5qVar.b.d;
                                                f971 f971Var14 = (f971) s7qVar5.E3.get();
                                                jl21 jl21Var14 = (jl21) s7qVar5.G3.get();
                                                ua91 ua91VarT8 = s7qVar5.T4();
                                                ccc0 ccc0Var14 = (ccc0) s7qVar5.L1.get();
                                                ijr ijrVar14 = (ijr) s7qVar5.b3.get();
                                                daq daqVar14 = s7qVar5.b;
                                                ks6Var = new ks6(lik1Var2, link, f971Var14, jl21Var14, ua91VarT8, new a680(ccc0Var14, ijrVar14, (kt91) daqVar14.f8.get(), (dg30) s7qVar5.t.a, (q8n) daqVar14.w1.get()), (oh41) s7qVar5.H3.get(), s7qVar5.O1(), s7qVar5.B4(), new wp20((ccc0) s7qVar5.L1.get(), (ijr) s7qVar5.b3.get(), (kt91) daqVar14.f8.get(), (dg30) s7qVar5.t.a, (q8n) daqVar14.w1.get()), s7qVar5.X(), new her((ayl) s7qVar5.l3.get(), (byte) 24), s7qVar5.f1(), s7qVar5.E3(), s7qVar5.o3(), s7qVar5.j5(), s7qVar5.p3(), s7qVar5.Q(), s7qVar5.Y0());
                                                s4b1Var = s4b1VarX;
                                                break;
                                            default:
                                                teq teqVar5 = m5qVar.b.d;
                                                f971 f971Var15 = (f971) teqVar5.O3.get();
                                                jl21 jl21Var15 = (jl21) teqVar5.l2.get();
                                                ua91 ua91VarJ7 = teqVar5.J3();
                                                ccc0 ccc0Var15 = (ccc0) teqVar5.q3.get();
                                                ijr ijrVar15 = (ijr) teqVar5.n5.get();
                                                daq daqVar15 = teqVar5.d;
                                                blc0Var3 = blc0Var2;
                                                ks6Var = new ks6(lik1Var2, link, f971Var15, jl21Var15, ua91VarJ7, new a680(ccc0Var15, ijrVar15, (kt91) daqVar15.f8.get(), (dg30) teqVar5.f.a, (q8n) daqVar15.w1.get()), (oh41) teqVar5.P3.get(), teqVar5.a1(), teqVar5.s3(), new wp20((ccc0) teqVar5.q3.get(), (ijr) teqVar5.n5.get(), (kt91) daqVar15.f8.get(), (dg30) teqVar5.f.a, (q8n) daqVar15.w1.get()), teqVar5.b0(), new her((ayl) teqVar5.x3.get(), (byte) 24), new gmt((ca40) teqVar5.f2.get(), (ik21) teqVar5.h2.get(), (byte) 4), teqVar5.A2(), teqVar5.n2(), teqVar5.X3(), teqVar5.o2(), new i6b((xb40) teqVar5.J5.get(), (byte) 0), teqVar5.B0());
                                                s4b1Var = s4b1VarX;
                                                break;
                                        }
                                        lik1Var3 = (lik1) ks6Var.a;
                                        str = (String) ks6Var.b;
                                        smc0VarN = k4p1.n();
                                        bm6Var = this.V0;
                                        if (bm6Var.c) {
                                            followed = collectionArtist9.p().getFollowed();
                                            boolean isBanned6 = collectionArtist9.p().getIsBanned();
                                            wp20 wp20Var5 = (wp20) ks6Var.t;
                                            if (followed) {
                                                fuxVar = fux.c;
                                            } else {
                                                fuxVar = hnx.c;
                                            }
                                            fux fuxVar6 = fuxVar;
                                            if (followed) {
                                                i2 = 2131954468;
                                            } else {
                                                i2 = 2131954371;
                                            }
                                            str2 = str;
                                            smc0VarN.add(new jhm("collection_follow_artist", fuxVar6, (fhm) null, Integer.valueOf(i2), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ll20.d1, new cl1(followed, str, (byte) 15)), new ew8(wp20Var5, followed, str, isBanned6, (byte) 2)), 244));
                                        } else {
                                            str2 = str;
                                        }
                                        if (!bm6Var.a) {
                                        }
                                        if (bm6Var.f) {
                                            artistCollectionStateP = collectionArtist9.p();
                                            if (artistCollectionStateP.getNumTracksInCollection() <= 0) {
                                            }
                                            String collectionLink5 = collectionArtist9.p().getCollectionLink();
                                            ArtistSyncState artistSyncStateR5 = collectionArtist9.r();
                                            xwp0VarO = dm5.O(artistSyncStateR5.getSyncProgress(), artistSyncStateR5.getOffline());
                                            if (xwp0VarO.equals(rwp0.a)) {
                                                z22 = false;
                                            } else {
                                                z22 = false;
                                            }
                                            her herVar5 = (her) ks6Var.Y;
                                            if (z22) {
                                                umxVar = umx.c;
                                            } else {
                                                umxVar = tmx.c;
                                            }
                                            umx umxVar6 = umxVar;
                                            if (z22) {
                                                i = 2131954467;
                                            } else {
                                                i = 2131954366;
                                            }
                                            Integer numValueOf5 = Integer.valueOf(i);
                                            ygm ygmVar5 = new ygm(2);
                                            if (z22) {
                                                hhmVar = hhm.b;
                                            } else {
                                                hhmVar = hhm.a;
                                            }
                                            smc0VarN.add(new jhm("artist_download", umxVar6, (fhm) null, numValueOf5, (String) null, false, (tm81) null, new ihm(ygmVar5, hhmVar, new ghm(wiu.T0, new cl1(z22, collectionLink5, (byte) 10)), new c30(z22, herVar5, collectionLink5, (byte) 12)), 244));
                                            break;
                                        }
                                        if (bm6Var.t) {
                                            smc0VarN.add(js6Var.n.d());
                                        }
                                        ugo0Var = bm6Var.h;
                                        if (ugo0Var != null) {
                                            if (ugo0Var.a) {
                                                jhmVarS2 = ((kqi0) ks6Var.O0).k(ugo0Var);
                                            } else {
                                                jhmVarS2 = ((dxy) ks6Var.Q0).s(ugo0Var);
                                            }
                                            smc0VarN.add(jhmVarS2);
                                        }
                                        p860Var = bm6Var.X;
                                        if (p860Var != null) {
                                            smc0VarN.add(js6Var.o.h(p860Var));
                                        }
                                        zJ = u890.j(vum1Var6, tum1.a);
                                        e2t0Var = e2t0.b;
                                        if (!zJ) {
                                            if (!(vum1Var6 instanceof uum1)) {
                                                lik1Var4 = lik1Var3;
                                                smc0VarN.add(((tzr0) ks6Var.N0).g(str2, e2t0Var, lik1Var4));
                                            }
                                            if (lik1Var2.equals(nik1.q2)) {
                                                blc0Var4 = blc0Var;
                                                smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                            } else {
                                                blc0Var4 = blc0Var;
                                                smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                            }
                                            blc0Var4 = blc0Var;
                                            jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                            if (jhmVarS != null) {
                                                smc0VarN.add(jhmVarS);
                                            }
                                            if (!bm6Var.b) {
                                                smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                            }
                                            if (z16) {
                                                smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                            }
                                            if (((no4) js6Var.a.a.get()).h()) {
                                                smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                            }
                                            if (!bm6Var.g) {
                                                smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                            }
                                            if (z20) {
                                                z21 = false;
                                            } else {
                                                z21 = false;
                                            }
                                            if (js6Var.m.a) {
                                                smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                            }
                                            ok51Var = bm6Var.i;
                                            if (ok51Var != null) {
                                                smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                            }
                                            if (bm6Var.d) {
                                                smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                            } else {
                                                smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                            }
                                            if (z19) {
                                                smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                            }
                                            smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                            smc0 smc0VarK9 = k4p1.k(smc0VarN);
                                            String standardLink9 = collectionArtist9.q().getPortraits().getStandardLink();
                                            String name115 = collectionArtist9.q().getName();
                                            standardLink9.getClass();
                                            String name116 = collectionArtist9.q().getName();
                                            String name117 = collectionArtist9.q().getName();
                                            uwr uwrVar9 = cbx.a;
                                            return new kjm(new igm(name115, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink9, name116, name117)})), (String) null, 4), smc0VarK9, 4);
                                        }
                                        smc0VarN.add(((dlg1) ks6Var.P0).i(str2, e2t0Var));
                                        lik1Var4 = lik1Var3;
                                        if (lik1Var2.equals(nik1.q2)) {
                                            blc0Var4 = blc0Var;
                                            smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                        } else {
                                            blc0Var4 = blc0Var;
                                            smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                        }
                                        blc0Var4 = blc0Var;
                                        jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                        if (jhmVarS != null) {
                                            smc0VarN.add(jhmVarS);
                                        }
                                        if (!bm6Var.b) {
                                            smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                        }
                                        if (z16) {
                                            smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                        }
                                        if (((no4) js6Var.a.a.get()).h()) {
                                            smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                        }
                                        if (!bm6Var.g) {
                                            smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                        }
                                        if (z20) {
                                            z21 = false;
                                        } else {
                                            z21 = false;
                                        }
                                        if (js6Var.m.a) {
                                            smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                        }
                                        ok51Var = bm6Var.i;
                                        if (ok51Var != null) {
                                            smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                        }
                                        if (bm6Var.d) {
                                            smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                        } else {
                                            smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                        }
                                        if (z19) {
                                            smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                        }
                                        smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                        smc0 smc0VarK10 = k4p1.k(smc0VarN);
                                        String standardLink10 = collectionArtist9.q().getPortraits().getStandardLink();
                                        String name118 = collectionArtist9.q().getName();
                                        standardLink10.getClass();
                                        String name119 = collectionArtist9.q().getName();
                                        String name1110 = collectionArtist9.q().getName();
                                        uwr uwrVar10 = cbx.a;
                                        return new kjm(new igm(name118, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink10, name119, name1110)})), (String) null, 4), smc0VarK10, 4);
                                    }
                                }
                            }
                        }
                    }
                }
                return d9nVar;
            case 5:
                obj2 = null;
                z3 = this.N0;
                boolean z30 = this.Z;
                vum1 vum1Var13 = this.X;
                CollectionArtist collectionArtist16 = this.t;
                l2t l2tVar48 = this.i;
                l2t l2tVar49 = this.h;
                l2tVar21 = this.g;
                l2t l2tVar50 = this.f;
                l2t l2tVar51 = this.e;
                hm5.M(obj);
                z2 = z30;
                js6Var = js6Var2;
                d9nVar = d9nVar2;
                l2tVar22 = l2tVar50;
                l2tVar19 = l2tVar51;
                l2tVar18 = l2tVar48;
                l2tVar23 = l2tVar49;
                lik1Var = lik1Var5;
                objE4 = obj;
                collectionArtist5 = collectionArtist16;
                vum1Var4 = vum1Var13;
                s2tVar = null;
                zBooleanValue3 = ((Boolean) objE4).booleanValue();
                this.T0 = s2tVar;
                this.a = s2tVar;
                this.b = s2tVar;
                this.c = s2tVar;
                this.d = s2tVar;
                this.e = l2tVar19;
                this.f = l2tVar22;
                this.g = s2tVar;
                this.h = l2tVar23;
                this.i = l2tVar18;
                this.t = collectionArtist5;
                this.X = vum1Var4;
                this.Z = z2;
                this.N0 = z3;
                this.O0 = zBooleanValue3;
                this.S0 = (byte) 6;
                objE5 = l2tVar21.E(this);
                if (objE5 != d9nVar) {
                    boolean z21118 = z2;
                    z4 = z3;
                    z5 = zBooleanValue3;
                    l2tVar24 = l2tVar23;
                    l2tVar25 = l2tVar18;
                    collectionArtist6 = collectionArtist5;
                    vum1Var5 = vum1Var4;
                    z6 = z21118;
                    zBooleanValue4 = ((Boolean) objE5).booleanValue();
                    this.T0 = s2tVar;
                    this.a = s2tVar;
                    this.b = s2tVar;
                    this.c = s2tVar;
                    this.d = s2tVar;
                    this.e = l2tVar19;
                    this.f = l2tVar22;
                    this.g = s2tVar;
                    this.h = s2tVar;
                    this.i = l2tVar25;
                    this.t = collectionArtist6;
                    this.X = vum1Var5;
                    this.Z = z6;
                    this.N0 = z4;
                    this.O0 = z5;
                    this.P0 = zBooleanValue4;
                    this.S0 = (byte) 7;
                    objE6 = l2tVar24.E(this);
                    if (objE6 != d9nVar) {
                        boolean z21119 = z4;
                        z7 = z5;
                        z8 = zBooleanValue4;
                        collectionArtist7 = collectionArtist6;
                        vum1Var6 = vum1Var5;
                        z9 = z6;
                        z10 = z21119;
                        qrg1Var = (qrg1) objE6;
                        this.T0 = s2tVar;
                        this.a = s2tVar;
                        this.b = s2tVar;
                        this.c = s2tVar;
                        this.d = s2tVar;
                        this.e = s2tVar;
                        this.f = l2tVar22;
                        this.g = s2tVar;
                        this.h = s2tVar;
                        this.i = l2tVar25;
                        this.t = collectionArtist7;
                        this.X = vum1Var6;
                        this.Y = qrg1Var;
                        this.Z = z9;
                        this.N0 = z10;
                        this.O0 = z7;
                        this.P0 = z8;
                        this.S0 = (byte) 8;
                        objE7 = l2tVar19.E(this);
                        if (objE7 != d9nVar) {
                            l2tVar26 = l2tVar22;
                            zBooleanValue5 = ((Boolean) objE7).booleanValue();
                            this.T0 = s2tVar;
                            this.a = s2tVar;
                            this.b = s2tVar;
                            this.c = s2tVar;
                            this.d = s2tVar;
                            this.e = s2tVar;
                            this.f = s2tVar;
                            this.g = s2tVar;
                            this.h = s2tVar;
                            this.i = l2tVar25;
                            this.t = collectionArtist7;
                            this.X = vum1Var6;
                            this.Y = qrg1Var;
                            this.Z = z9;
                            this.N0 = z10;
                            this.O0 = z7;
                            this.P0 = z8;
                            this.Q0 = zBooleanValue5;
                            this.S0 = (byte) 9;
                            objE8 = l2tVar26.E(this);
                            if (objE8 != d9nVar) {
                                boolean z211110 = z7;
                                z11 = z8;
                                z12 = zBooleanValue5;
                                z13 = z10;
                                z14 = z211110;
                                z15 = z9;
                                qrg1Var2 = qrg1Var;
                                collectionArtist8 = collectionArtist7;
                                l2tVar27 = l2tVar25;
                                zBooleanValue6 = ((Boolean) objE8).booleanValue();
                                this.T0 = s2tVar;
                                this.a = s2tVar;
                                this.b = s2tVar;
                                this.c = s2tVar;
                                this.d = s2tVar;
                                this.e = s2tVar;
                                this.f = s2tVar;
                                this.g = s2tVar;
                                this.h = s2tVar;
                                this.i = s2tVar;
                                this.t = collectionArtist8;
                                this.X = vum1Var6;
                                this.Y = qrg1Var2;
                                this.Z = z15;
                                this.N0 = z13;
                                this.O0 = z14;
                                this.P0 = z11;
                                this.Q0 = z12;
                                this.R0 = zBooleanValue6;
                                this.S0 = (byte) 10;
                                objE9 = l2tVar27.E(this);
                                if (objE9 != d9nVar) {
                                    boolean z211111 = z11;
                                    z16 = z12;
                                    z17 = zBooleanValue6;
                                    collectionArtist9 = collectionArtist8;
                                    qrg1Var3 = qrg1Var2;
                                    z18 = z14;
                                    z19 = z211111;
                                    boolean z211112 = z13;
                                    boolean z211113 = z15;
                                    bs6 bs6Var6 = (bs6) objE9;
                                    Set set6 = s4b1.f;
                                    lik1Var2 = lik1Var;
                                    s4b1VarX = uic.x(lik1Var2.a);
                                    blc0Var = s4b1VarX.c;
                                    blc0Var2 = blc0.v1;
                                    if (blc0Var == blc0Var2) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    m5qVar = js6Var.k;
                                    link = collectionArtist9.q().getLink();
                                    boolean z211114 = z17;
                                    switch (m5qVar.a) {
                                        case 0:
                                            z16 = z16;
                                            z19 = z19;
                                            z18 = z18;
                                            blc0Var = blc0Var;
                                            blc0Var3 = blc0Var2;
                                            v5q v5qVar6 = m5qVar.b.c;
                                            f971 f971Var16 = (f971) v5qVar6.E5.get();
                                            jl21 jl21Var16 = (jl21) v5qVar6.s2.get();
                                            ua91 ua91VarD5 = v5qVar6.D0();
                                            ccc0 ccc0Var16 = (ccc0) v5qVar6.H2.get();
                                            ijr ijrVar16 = (ijr) v5qVar6.o6.get();
                                            daq daqVar16 = v5qVar6.b;
                                            s4b1Var = s4b1VarX;
                                            ks6Var = new ks6(lik1Var2, link, f971Var16, jl21Var16, ua91VarD5, new a680(ccc0Var16, ijrVar16, (kt91) daqVar16.f8.get(), (dg30) v5qVar6.i.a, (q8n) daqVar16.w1.get()), (oh41) v5qVar6.M5.get(), new uf0((Context) daqVar16.x1.a), v5qVar6.y0(), new wp20((ccc0) v5qVar6.H2.get(), (ijr) v5qVar6.o6.get(), (kt91) daqVar16.f8.get(), (dg30) v5qVar6.i.a, (q8n) daqVar16.w1.get()), v5qVar6.p(), new her((ayl) v5qVar6.F2.get(), (byte) 24), new gmt((ca40) v5qVar6.V0.get(), (ik21) v5qVar6.Y0.get(), (byte) 4), v5qVar6.n0(), v5qVar6.h0(), v5qVar6.G0(), v5qVar6.i0(), new i6b((xb40) v5qVar6.b8.get(), (byte) 0), v5qVar6.A());
                                            break;
                                        case 1:
                                            blc0Var3 = blc0Var2;
                                            s7q s7qVar6 = m5qVar.b.d;
                                            f971 f971Var17 = (f971) s7qVar6.E3.get();
                                            jl21 jl21Var17 = (jl21) s7qVar6.G3.get();
                                            ua91 ua91VarT9 = s7qVar6.T4();
                                            ccc0 ccc0Var17 = (ccc0) s7qVar6.L1.get();
                                            ijr ijrVar17 = (ijr) s7qVar6.b3.get();
                                            daq daqVar17 = s7qVar6.b;
                                            ks6Var = new ks6(lik1Var2, link, f971Var17, jl21Var17, ua91VarT9, new a680(ccc0Var17, ijrVar17, (kt91) daqVar17.f8.get(), (dg30) s7qVar6.t.a, (q8n) daqVar17.w1.get()), (oh41) s7qVar6.H3.get(), s7qVar6.O1(), s7qVar6.B4(), new wp20((ccc0) s7qVar6.L1.get(), (ijr) s7qVar6.b3.get(), (kt91) daqVar17.f8.get(), (dg30) s7qVar6.t.a, (q8n) daqVar17.w1.get()), s7qVar6.X(), new her((ayl) s7qVar6.l3.get(), (byte) 24), s7qVar6.f1(), s7qVar6.E3(), s7qVar6.o3(), s7qVar6.j5(), s7qVar6.p3(), s7qVar6.Q(), s7qVar6.Y0());
                                            s4b1Var = s4b1VarX;
                                            break;
                                        default:
                                            teq teqVar6 = m5qVar.b.d;
                                            f971 f971Var18 = (f971) teqVar6.O3.get();
                                            jl21 jl21Var18 = (jl21) teqVar6.l2.get();
                                            ua91 ua91VarJ8 = teqVar6.J3();
                                            ccc0 ccc0Var18 = (ccc0) teqVar6.q3.get();
                                            ijr ijrVar18 = (ijr) teqVar6.n5.get();
                                            daq daqVar18 = teqVar6.d;
                                            blc0Var3 = blc0Var2;
                                            ks6Var = new ks6(lik1Var2, link, f971Var18, jl21Var18, ua91VarJ8, new a680(ccc0Var18, ijrVar18, (kt91) daqVar18.f8.get(), (dg30) teqVar6.f.a, (q8n) daqVar18.w1.get()), (oh41) teqVar6.P3.get(), teqVar6.a1(), teqVar6.s3(), new wp20((ccc0) teqVar6.q3.get(), (ijr) teqVar6.n5.get(), (kt91) daqVar18.f8.get(), (dg30) teqVar6.f.a, (q8n) daqVar18.w1.get()), teqVar6.b0(), new her((ayl) teqVar6.x3.get(), (byte) 24), new gmt((ca40) teqVar6.f2.get(), (ik21) teqVar6.h2.get(), (byte) 4), teqVar6.A2(), teqVar6.n2(), teqVar6.X3(), teqVar6.o2(), new i6b((xb40) teqVar6.J5.get(), (byte) 0), teqVar6.B0());
                                            s4b1Var = s4b1VarX;
                                            break;
                                    }
                                    lik1Var3 = (lik1) ks6Var.a;
                                    str = (String) ks6Var.b;
                                    smc0VarN = k4p1.n();
                                    bm6Var = this.V0;
                                    if (bm6Var.c) {
                                        followed = collectionArtist9.p().getFollowed();
                                        boolean isBanned7 = collectionArtist9.p().getIsBanned();
                                        wp20 wp20Var6 = (wp20) ks6Var.t;
                                        if (followed) {
                                            fuxVar = fux.c;
                                        } else {
                                            fuxVar = hnx.c;
                                        }
                                        fux fuxVar7 = fuxVar;
                                        if (followed) {
                                            i2 = 2131954468;
                                        } else {
                                            i2 = 2131954371;
                                        }
                                        str2 = str;
                                        smc0VarN.add(new jhm("collection_follow_artist", fuxVar7, (fhm) null, Integer.valueOf(i2), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ll20.d1, new cl1(followed, str, (byte) 15)), new ew8(wp20Var6, followed, str, isBanned7, (byte) 2)), 244));
                                    } else {
                                        str2 = str;
                                    }
                                    if (!bm6Var.a) {
                                    }
                                    if (bm6Var.f) {
                                        artistCollectionStateP = collectionArtist9.p();
                                        if (artistCollectionStateP.getNumTracksInCollection() <= 0) {
                                        }
                                        String collectionLink6 = collectionArtist9.p().getCollectionLink();
                                        ArtistSyncState artistSyncStateR6 = collectionArtist9.r();
                                        xwp0VarO = dm5.O(artistSyncStateR6.getSyncProgress(), artistSyncStateR6.getOffline());
                                        if (xwp0VarO.equals(rwp0.a)) {
                                            z22 = false;
                                        } else {
                                            z22 = false;
                                        }
                                        her herVar6 = (her) ks6Var.Y;
                                        if (z22) {
                                            umxVar = umx.c;
                                        } else {
                                            umxVar = tmx.c;
                                        }
                                        umx umxVar7 = umxVar;
                                        if (z22) {
                                            i = 2131954467;
                                        } else {
                                            i = 2131954366;
                                        }
                                        Integer numValueOf6 = Integer.valueOf(i);
                                        ygm ygmVar6 = new ygm(2);
                                        if (z22) {
                                            hhmVar = hhm.b;
                                        } else {
                                            hhmVar = hhm.a;
                                        }
                                        smc0VarN.add(new jhm("artist_download", umxVar7, (fhm) null, numValueOf6, (String) null, false, (tm81) null, new ihm(ygmVar6, hhmVar, new ghm(wiu.T0, new cl1(z22, collectionLink6, (byte) 10)), new c30(z22, herVar6, collectionLink6, (byte) 12)), 244));
                                        break;
                                    }
                                    if (bm6Var.t) {
                                        smc0VarN.add(js6Var.n.d());
                                    }
                                    ugo0Var = bm6Var.h;
                                    if (ugo0Var != null) {
                                        if (ugo0Var.a) {
                                            jhmVarS2 = ((kqi0) ks6Var.O0).k(ugo0Var);
                                        } else {
                                            jhmVarS2 = ((dxy) ks6Var.Q0).s(ugo0Var);
                                        }
                                        smc0VarN.add(jhmVarS2);
                                    }
                                    p860Var = bm6Var.X;
                                    if (p860Var != null) {
                                        smc0VarN.add(js6Var.o.h(p860Var));
                                    }
                                    zJ = u890.j(vum1Var6, tum1.a);
                                    e2t0Var = e2t0.b;
                                    if (!zJ) {
                                        if (!(vum1Var6 instanceof uum1)) {
                                            lik1Var4 = lik1Var3;
                                            smc0VarN.add(((tzr0) ks6Var.N0).g(str2, e2t0Var, lik1Var4));
                                        }
                                        if (lik1Var2.equals(nik1.q2)) {
                                            blc0Var4 = blc0Var;
                                            smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                        } else {
                                            blc0Var4 = blc0Var;
                                            smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                        }
                                        blc0Var4 = blc0Var;
                                        jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                        if (jhmVarS != null) {
                                            smc0VarN.add(jhmVarS);
                                        }
                                        if (!bm6Var.b) {
                                            smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                        }
                                        if (z16) {
                                            smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                        }
                                        if (((no4) js6Var.a.a.get()).h()) {
                                            smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                        }
                                        if (!bm6Var.g) {
                                            smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                        }
                                        if (z20) {
                                            z21 = false;
                                        } else {
                                            z21 = false;
                                        }
                                        if (js6Var.m.a) {
                                            smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                        }
                                        ok51Var = bm6Var.i;
                                        if (ok51Var != null) {
                                            smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                        }
                                        if (bm6Var.d) {
                                            smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                        } else {
                                            smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                        }
                                        if (z19) {
                                            smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                        }
                                        smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                        smc0 smc0VarK11 = k4p1.k(smc0VarN);
                                        String standardLink11 = collectionArtist9.q().getPortraits().getStandardLink();
                                        String name1111 = collectionArtist9.q().getName();
                                        standardLink11.getClass();
                                        String name1112 = collectionArtist9.q().getName();
                                        String name1113 = collectionArtist9.q().getName();
                                        uwr uwrVar11 = cbx.a;
                                        return new kjm(new igm(name1111, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink11, name1112, name1113)})), (String) null, 4), smc0VarK11, 4);
                                    }
                                    smc0VarN.add(((dlg1) ks6Var.P0).i(str2, e2t0Var));
                                    lik1Var4 = lik1Var3;
                                    if (lik1Var2.equals(nik1.q2)) {
                                        blc0Var4 = blc0Var;
                                        smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                    } else {
                                        blc0Var4 = blc0Var;
                                        smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                    }
                                    blc0Var4 = blc0Var;
                                    jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                    if (jhmVarS != null) {
                                        smc0VarN.add(jhmVarS);
                                    }
                                    if (!bm6Var.b) {
                                        smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                    }
                                    if (z16) {
                                        smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                    }
                                    if (((no4) js6Var.a.a.get()).h()) {
                                        smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                    }
                                    if (!bm6Var.g) {
                                        smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                    }
                                    if (z20) {
                                        z21 = false;
                                    } else {
                                        z21 = false;
                                    }
                                    if (js6Var.m.a) {
                                        smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                    }
                                    ok51Var = bm6Var.i;
                                    if (ok51Var != null) {
                                        smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                    }
                                    if (bm6Var.d) {
                                        smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                    } else {
                                        smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                    }
                                    if (z19) {
                                        smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                    }
                                    smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                    smc0 smc0VarK12 = k4p1.k(smc0VarN);
                                    String standardLink12 = collectionArtist9.q().getPortraits().getStandardLink();
                                    String name1114 = collectionArtist9.q().getName();
                                    standardLink12.getClass();
                                    String name1115 = collectionArtist9.q().getName();
                                    String name1116 = collectionArtist9.q().getName();
                                    uwr uwrVar12 = cbx.a;
                                    return new kjm(new igm(name1114, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink12, name1115, name1116)})), (String) null, 4), smc0VarK12, 4);
                                }
                            }
                        }
                    }
                }
                return d9nVar;
            case 6:
                obj2 = null;
                z5 = this.O0;
                boolean z31 = this.N0;
                boolean z32 = this.Z;
                vum1 vum1Var14 = this.X;
                CollectionArtist collectionArtist17 = this.t;
                l2t l2tVar52 = this.i;
                l2tVar24 = this.h;
                l2t l2tVar53 = this.f;
                l2tVar19 = this.e;
                hm5.M(obj);
                collectionArtist6 = collectionArtist17;
                l2tVar25 = l2tVar52;
                lik1Var = lik1Var5;
                z6 = z32;
                vum1Var5 = vum1Var14;
                s2tVar = null;
                z4 = z31;
                js6Var = js6Var2;
                d9nVar = d9nVar2;
                l2tVar22 = l2tVar53;
                objE5 = obj;
                zBooleanValue4 = ((Boolean) objE5).booleanValue();
                this.T0 = s2tVar;
                this.a = s2tVar;
                this.b = s2tVar;
                this.c = s2tVar;
                this.d = s2tVar;
                this.e = l2tVar19;
                this.f = l2tVar22;
                this.g = s2tVar;
                this.h = s2tVar;
                this.i = l2tVar25;
                this.t = collectionArtist6;
                this.X = vum1Var5;
                this.Z = z6;
                this.N0 = z4;
                this.O0 = z5;
                this.P0 = zBooleanValue4;
                this.S0 = (byte) 7;
                objE6 = l2tVar24.E(this);
                if (objE6 != d9nVar) {
                    boolean z211115 = z4;
                    z7 = z5;
                    z8 = zBooleanValue4;
                    collectionArtist7 = collectionArtist6;
                    vum1Var6 = vum1Var5;
                    z9 = z6;
                    z10 = z211115;
                    qrg1Var = (qrg1) objE6;
                    this.T0 = s2tVar;
                    this.a = s2tVar;
                    this.b = s2tVar;
                    this.c = s2tVar;
                    this.d = s2tVar;
                    this.e = s2tVar;
                    this.f = l2tVar22;
                    this.g = s2tVar;
                    this.h = s2tVar;
                    this.i = l2tVar25;
                    this.t = collectionArtist7;
                    this.X = vum1Var6;
                    this.Y = qrg1Var;
                    this.Z = z9;
                    this.N0 = z10;
                    this.O0 = z7;
                    this.P0 = z8;
                    this.S0 = (byte) 8;
                    objE7 = l2tVar19.E(this);
                    if (objE7 != d9nVar) {
                        l2tVar26 = l2tVar22;
                        zBooleanValue5 = ((Boolean) objE7).booleanValue();
                        this.T0 = s2tVar;
                        this.a = s2tVar;
                        this.b = s2tVar;
                        this.c = s2tVar;
                        this.d = s2tVar;
                        this.e = s2tVar;
                        this.f = s2tVar;
                        this.g = s2tVar;
                        this.h = s2tVar;
                        this.i = l2tVar25;
                        this.t = collectionArtist7;
                        this.X = vum1Var6;
                        this.Y = qrg1Var;
                        this.Z = z9;
                        this.N0 = z10;
                        this.O0 = z7;
                        this.P0 = z8;
                        this.Q0 = zBooleanValue5;
                        this.S0 = (byte) 9;
                        objE8 = l2tVar26.E(this);
                        if (objE8 != d9nVar) {
                            boolean z211116 = z7;
                            z11 = z8;
                            z12 = zBooleanValue5;
                            z13 = z10;
                            z14 = z211116;
                            z15 = z9;
                            qrg1Var2 = qrg1Var;
                            collectionArtist8 = collectionArtist7;
                            l2tVar27 = l2tVar25;
                            zBooleanValue6 = ((Boolean) objE8).booleanValue();
                            this.T0 = s2tVar;
                            this.a = s2tVar;
                            this.b = s2tVar;
                            this.c = s2tVar;
                            this.d = s2tVar;
                            this.e = s2tVar;
                            this.f = s2tVar;
                            this.g = s2tVar;
                            this.h = s2tVar;
                            this.i = s2tVar;
                            this.t = collectionArtist8;
                            this.X = vum1Var6;
                            this.Y = qrg1Var2;
                            this.Z = z15;
                            this.N0 = z13;
                            this.O0 = z14;
                            this.P0 = z11;
                            this.Q0 = z12;
                            this.R0 = zBooleanValue6;
                            this.S0 = (byte) 10;
                            objE9 = l2tVar27.E(this);
                            if (objE9 != d9nVar) {
                                boolean z211117 = z11;
                                z16 = z12;
                                z17 = zBooleanValue6;
                                collectionArtist9 = collectionArtist8;
                                qrg1Var3 = qrg1Var2;
                                z18 = z14;
                                z19 = z211117;
                                boolean z211118 = z13;
                                boolean z211119 = z15;
                                bs6 bs6Var7 = (bs6) objE9;
                                Set set7 = s4b1.f;
                                lik1Var2 = lik1Var;
                                s4b1VarX = uic.x(lik1Var2.a);
                                blc0Var = s4b1VarX.c;
                                blc0Var2 = blc0.v1;
                                if (blc0Var == blc0Var2) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                m5qVar = js6Var.k;
                                link = collectionArtist9.q().getLink();
                                boolean z2111110 = z17;
                                switch (m5qVar.a) {
                                    case 0:
                                        z16 = z16;
                                        z19 = z19;
                                        z18 = z18;
                                        blc0Var = blc0Var;
                                        blc0Var3 = blc0Var2;
                                        v5q v5qVar7 = m5qVar.b.c;
                                        f971 f971Var19 = (f971) v5qVar7.E5.get();
                                        jl21 jl21Var19 = (jl21) v5qVar7.s2.get();
                                        ua91 ua91VarD6 = v5qVar7.D0();
                                        ccc0 ccc0Var19 = (ccc0) v5qVar7.H2.get();
                                        ijr ijrVar19 = (ijr) v5qVar7.o6.get();
                                        daq daqVar19 = v5qVar7.b;
                                        s4b1Var = s4b1VarX;
                                        ks6Var = new ks6(lik1Var2, link, f971Var19, jl21Var19, ua91VarD6, new a680(ccc0Var19, ijrVar19, (kt91) daqVar19.f8.get(), (dg30) v5qVar7.i.a, (q8n) daqVar19.w1.get()), (oh41) v5qVar7.M5.get(), new uf0((Context) daqVar19.x1.a), v5qVar7.y0(), new wp20((ccc0) v5qVar7.H2.get(), (ijr) v5qVar7.o6.get(), (kt91) daqVar19.f8.get(), (dg30) v5qVar7.i.a, (q8n) daqVar19.w1.get()), v5qVar7.p(), new her((ayl) v5qVar7.F2.get(), (byte) 24), new gmt((ca40) v5qVar7.V0.get(), (ik21) v5qVar7.Y0.get(), (byte) 4), v5qVar7.n0(), v5qVar7.h0(), v5qVar7.G0(), v5qVar7.i0(), new i6b((xb40) v5qVar7.b8.get(), (byte) 0), v5qVar7.A());
                                        break;
                                    case 1:
                                        blc0Var3 = blc0Var2;
                                        s7q s7qVar7 = m5qVar.b.d;
                                        f971 f971Var110 = (f971) s7qVar7.E3.get();
                                        jl21 jl21Var110 = (jl21) s7qVar7.G3.get();
                                        ua91 ua91VarT10 = s7qVar7.T4();
                                        ccc0 ccc0Var110 = (ccc0) s7qVar7.L1.get();
                                        ijr ijrVar110 = (ijr) s7qVar7.b3.get();
                                        daq daqVar110 = s7qVar7.b;
                                        ks6Var = new ks6(lik1Var2, link, f971Var110, jl21Var110, ua91VarT10, new a680(ccc0Var110, ijrVar110, (kt91) daqVar110.f8.get(), (dg30) s7qVar7.t.a, (q8n) daqVar110.w1.get()), (oh41) s7qVar7.H3.get(), s7qVar7.O1(), s7qVar7.B4(), new wp20((ccc0) s7qVar7.L1.get(), (ijr) s7qVar7.b3.get(), (kt91) daqVar110.f8.get(), (dg30) s7qVar7.t.a, (q8n) daqVar110.w1.get()), s7qVar7.X(), new her((ayl) s7qVar7.l3.get(), (byte) 24), s7qVar7.f1(), s7qVar7.E3(), s7qVar7.o3(), s7qVar7.j5(), s7qVar7.p3(), s7qVar7.Q(), s7qVar7.Y0());
                                        s4b1Var = s4b1VarX;
                                        break;
                                    default:
                                        teq teqVar7 = m5qVar.b.d;
                                        f971 f971Var111 = (f971) teqVar7.O3.get();
                                        jl21 jl21Var111 = (jl21) teqVar7.l2.get();
                                        ua91 ua91VarJ9 = teqVar7.J3();
                                        ccc0 ccc0Var111 = (ccc0) teqVar7.q3.get();
                                        ijr ijrVar111 = (ijr) teqVar7.n5.get();
                                        daq daqVar111 = teqVar7.d;
                                        blc0Var3 = blc0Var2;
                                        ks6Var = new ks6(lik1Var2, link, f971Var111, jl21Var111, ua91VarJ9, new a680(ccc0Var111, ijrVar111, (kt91) daqVar111.f8.get(), (dg30) teqVar7.f.a, (q8n) daqVar111.w1.get()), (oh41) teqVar7.P3.get(), teqVar7.a1(), teqVar7.s3(), new wp20((ccc0) teqVar7.q3.get(), (ijr) teqVar7.n5.get(), (kt91) daqVar111.f8.get(), (dg30) teqVar7.f.a, (q8n) daqVar111.w1.get()), teqVar7.b0(), new her((ayl) teqVar7.x3.get(), (byte) 24), new gmt((ca40) teqVar7.f2.get(), (ik21) teqVar7.h2.get(), (byte) 4), teqVar7.A2(), teqVar7.n2(), teqVar7.X3(), teqVar7.o2(), new i6b((xb40) teqVar7.J5.get(), (byte) 0), teqVar7.B0());
                                        s4b1Var = s4b1VarX;
                                        break;
                                }
                                lik1Var3 = (lik1) ks6Var.a;
                                str = (String) ks6Var.b;
                                smc0VarN = k4p1.n();
                                bm6Var = this.V0;
                                if (bm6Var.c) {
                                    followed = collectionArtist9.p().getFollowed();
                                    boolean isBanned8 = collectionArtist9.p().getIsBanned();
                                    wp20 wp20Var7 = (wp20) ks6Var.t;
                                    if (followed) {
                                        fuxVar = fux.c;
                                    } else {
                                        fuxVar = hnx.c;
                                    }
                                    fux fuxVar8 = fuxVar;
                                    if (followed) {
                                        i2 = 2131954468;
                                    } else {
                                        i2 = 2131954371;
                                    }
                                    str2 = str;
                                    smc0VarN.add(new jhm("collection_follow_artist", fuxVar8, (fhm) null, Integer.valueOf(i2), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ll20.d1, new cl1(followed, str, (byte) 15)), new ew8(wp20Var7, followed, str, isBanned8, (byte) 2)), 244));
                                } else {
                                    str2 = str;
                                }
                                if (!bm6Var.a) {
                                }
                                if (bm6Var.f) {
                                    artistCollectionStateP = collectionArtist9.p();
                                    if (artistCollectionStateP.getNumTracksInCollection() <= 0) {
                                    }
                                    String collectionLink7 = collectionArtist9.p().getCollectionLink();
                                    ArtistSyncState artistSyncStateR7 = collectionArtist9.r();
                                    xwp0VarO = dm5.O(artistSyncStateR7.getSyncProgress(), artistSyncStateR7.getOffline());
                                    if (xwp0VarO.equals(rwp0.a)) {
                                        z22 = false;
                                    } else {
                                        z22 = false;
                                    }
                                    her herVar7 = (her) ks6Var.Y;
                                    if (z22) {
                                        umxVar = umx.c;
                                    } else {
                                        umxVar = tmx.c;
                                    }
                                    umx umxVar8 = umxVar;
                                    if (z22) {
                                        i = 2131954467;
                                    } else {
                                        i = 2131954366;
                                    }
                                    Integer numValueOf7 = Integer.valueOf(i);
                                    ygm ygmVar7 = new ygm(2);
                                    if (z22) {
                                        hhmVar = hhm.b;
                                    } else {
                                        hhmVar = hhm.a;
                                    }
                                    smc0VarN.add(new jhm("artist_download", umxVar8, (fhm) null, numValueOf7, (String) null, false, (tm81) null, new ihm(ygmVar7, hhmVar, new ghm(wiu.T0, new cl1(z22, collectionLink7, (byte) 10)), new c30(z22, herVar7, collectionLink7, (byte) 12)), 244));
                                    break;
                                }
                                if (bm6Var.t) {
                                    smc0VarN.add(js6Var.n.d());
                                }
                                ugo0Var = bm6Var.h;
                                if (ugo0Var != null) {
                                    if (ugo0Var.a) {
                                        jhmVarS2 = ((kqi0) ks6Var.O0).k(ugo0Var);
                                    } else {
                                        jhmVarS2 = ((dxy) ks6Var.Q0).s(ugo0Var);
                                    }
                                    smc0VarN.add(jhmVarS2);
                                }
                                p860Var = bm6Var.X;
                                if (p860Var != null) {
                                    smc0VarN.add(js6Var.o.h(p860Var));
                                }
                                zJ = u890.j(vum1Var6, tum1.a);
                                e2t0Var = e2t0.b;
                                if (!zJ) {
                                    if (!(vum1Var6 instanceof uum1)) {
                                        lik1Var4 = lik1Var3;
                                        smc0VarN.add(((tzr0) ks6Var.N0).g(str2, e2t0Var, lik1Var4));
                                    }
                                    if (lik1Var2.equals(nik1.q2)) {
                                        blc0Var4 = blc0Var;
                                        smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                    } else {
                                        blc0Var4 = blc0Var;
                                        smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                    }
                                    blc0Var4 = blc0Var;
                                    jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                    if (jhmVarS != null) {
                                        smc0VarN.add(jhmVarS);
                                    }
                                    if (!bm6Var.b) {
                                        smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                    }
                                    if (z16) {
                                        smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                    }
                                    if (((no4) js6Var.a.a.get()).h()) {
                                        smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                    }
                                    if (!bm6Var.g) {
                                        smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                    }
                                    if (z20) {
                                        z21 = false;
                                    } else {
                                        z21 = false;
                                    }
                                    if (js6Var.m.a) {
                                        smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                    }
                                    ok51Var = bm6Var.i;
                                    if (ok51Var != null) {
                                        smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                    }
                                    if (bm6Var.d) {
                                        smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                    } else {
                                        smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                    }
                                    if (z19) {
                                        smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                    }
                                    smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                    smc0 smc0VarK13 = k4p1.k(smc0VarN);
                                    String standardLink13 = collectionArtist9.q().getPortraits().getStandardLink();
                                    String name1117 = collectionArtist9.q().getName();
                                    standardLink13.getClass();
                                    String name1118 = collectionArtist9.q().getName();
                                    String name1119 = collectionArtist9.q().getName();
                                    uwr uwrVar13 = cbx.a;
                                    return new kjm(new igm(name1117, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink13, name1118, name1119)})), (String) null, 4), smc0VarK13, 4);
                                }
                                smc0VarN.add(((dlg1) ks6Var.P0).i(str2, e2t0Var));
                                lik1Var4 = lik1Var3;
                                if (lik1Var2.equals(nik1.q2)) {
                                    blc0Var4 = blc0Var;
                                    smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                } else {
                                    blc0Var4 = blc0Var;
                                    smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                }
                                blc0Var4 = blc0Var;
                                jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                if (jhmVarS != null) {
                                    smc0VarN.add(jhmVarS);
                                }
                                if (!bm6Var.b) {
                                    smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                }
                                if (z16) {
                                    smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                }
                                if (((no4) js6Var.a.a.get()).h()) {
                                    smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                }
                                if (!bm6Var.g) {
                                    smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                }
                                if (z20) {
                                    z21 = false;
                                } else {
                                    z21 = false;
                                }
                                if (js6Var.m.a) {
                                    smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                }
                                ok51Var = bm6Var.i;
                                if (ok51Var != null) {
                                    smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                }
                                if (bm6Var.d) {
                                    smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                } else {
                                    smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                }
                                if (z19) {
                                    smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                }
                                smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                smc0 smc0VarK14 = k4p1.k(smc0VarN);
                                String standardLink14 = collectionArtist9.q().getPortraits().getStandardLink();
                                String name11110 = collectionArtist9.q().getName();
                                standardLink14.getClass();
                                String name11111 = collectionArtist9.q().getName();
                                String name11112 = collectionArtist9.q().getName();
                                uwr uwrVar14 = cbx.a;
                                return new kjm(new igm(name11110, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink14, name11111, name11112)})), (String) null, 4), smc0VarK14, 4);
                            }
                        }
                    }
                }
                return d9nVar;
            case 7:
                obj2 = null;
                z8 = this.P0;
                boolean z33 = this.O0;
                boolean z34 = this.N0;
                boolean z35 = this.Z;
                vum1 vum1Var15 = this.X;
                CollectionArtist collectionArtist18 = this.t;
                l2t l2tVar54 = this.i;
                l2t l2tVar55 = this.f;
                l2tVar19 = this.e;
                hm5.M(obj);
                z7 = z33;
                js6Var = js6Var2;
                d9nVar = d9nVar2;
                l2tVar22 = l2tVar55;
                collectionArtist7 = collectionArtist18;
                z9 = z35;
                vum1Var6 = vum1Var15;
                l2tVar25 = l2tVar54;
                lik1Var = lik1Var5;
                objE6 = obj;
                z10 = z34;
                s2tVar = null;
                qrg1Var = (qrg1) objE6;
                this.T0 = s2tVar;
                this.a = s2tVar;
                this.b = s2tVar;
                this.c = s2tVar;
                this.d = s2tVar;
                this.e = s2tVar;
                this.f = l2tVar22;
                this.g = s2tVar;
                this.h = s2tVar;
                this.i = l2tVar25;
                this.t = collectionArtist7;
                this.X = vum1Var6;
                this.Y = qrg1Var;
                this.Z = z9;
                this.N0 = z10;
                this.O0 = z7;
                this.P0 = z8;
                this.S0 = (byte) 8;
                objE7 = l2tVar19.E(this);
                if (objE7 != d9nVar) {
                    l2tVar26 = l2tVar22;
                    zBooleanValue5 = ((Boolean) objE7).booleanValue();
                    this.T0 = s2tVar;
                    this.a = s2tVar;
                    this.b = s2tVar;
                    this.c = s2tVar;
                    this.d = s2tVar;
                    this.e = s2tVar;
                    this.f = s2tVar;
                    this.g = s2tVar;
                    this.h = s2tVar;
                    this.i = l2tVar25;
                    this.t = collectionArtist7;
                    this.X = vum1Var6;
                    this.Y = qrg1Var;
                    this.Z = z9;
                    this.N0 = z10;
                    this.O0 = z7;
                    this.P0 = z8;
                    this.Q0 = zBooleanValue5;
                    this.S0 = (byte) 9;
                    objE8 = l2tVar26.E(this);
                    if (objE8 != d9nVar) {
                        boolean z2111111 = z7;
                        z11 = z8;
                        z12 = zBooleanValue5;
                        z13 = z10;
                        z14 = z2111111;
                        z15 = z9;
                        qrg1Var2 = qrg1Var;
                        collectionArtist8 = collectionArtist7;
                        l2tVar27 = l2tVar25;
                        zBooleanValue6 = ((Boolean) objE8).booleanValue();
                        this.T0 = s2tVar;
                        this.a = s2tVar;
                        this.b = s2tVar;
                        this.c = s2tVar;
                        this.d = s2tVar;
                        this.e = s2tVar;
                        this.f = s2tVar;
                        this.g = s2tVar;
                        this.h = s2tVar;
                        this.i = s2tVar;
                        this.t = collectionArtist8;
                        this.X = vum1Var6;
                        this.Y = qrg1Var2;
                        this.Z = z15;
                        this.N0 = z13;
                        this.O0 = z14;
                        this.P0 = z11;
                        this.Q0 = z12;
                        this.R0 = zBooleanValue6;
                        this.S0 = (byte) 10;
                        objE9 = l2tVar27.E(this);
                        if (objE9 != d9nVar) {
                            boolean z2111112 = z11;
                            z16 = z12;
                            z17 = zBooleanValue6;
                            collectionArtist9 = collectionArtist8;
                            qrg1Var3 = qrg1Var2;
                            z18 = z14;
                            z19 = z2111112;
                            boolean z2111113 = z13;
                            boolean z2111114 = z15;
                            bs6 bs6Var8 = (bs6) objE9;
                            Set set8 = s4b1.f;
                            lik1Var2 = lik1Var;
                            s4b1VarX = uic.x(lik1Var2.a);
                            blc0Var = s4b1VarX.c;
                            blc0Var2 = blc0.v1;
                            if (blc0Var == blc0Var2) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            m5qVar = js6Var.k;
                            link = collectionArtist9.q().getLink();
                            boolean z2111115 = z17;
                            switch (m5qVar.a) {
                                case 0:
                                    z16 = z16;
                                    z19 = z19;
                                    z18 = z18;
                                    blc0Var = blc0Var;
                                    blc0Var3 = blc0Var2;
                                    v5q v5qVar8 = m5qVar.b.c;
                                    f971 f971Var112 = (f971) v5qVar8.E5.get();
                                    jl21 jl21Var112 = (jl21) v5qVar8.s2.get();
                                    ua91 ua91VarD7 = v5qVar8.D0();
                                    ccc0 ccc0Var112 = (ccc0) v5qVar8.H2.get();
                                    ijr ijrVar112 = (ijr) v5qVar8.o6.get();
                                    daq daqVar112 = v5qVar8.b;
                                    s4b1Var = s4b1VarX;
                                    ks6Var = new ks6(lik1Var2, link, f971Var112, jl21Var112, ua91VarD7, new a680(ccc0Var112, ijrVar112, (kt91) daqVar112.f8.get(), (dg30) v5qVar8.i.a, (q8n) daqVar112.w1.get()), (oh41) v5qVar8.M5.get(), new uf0((Context) daqVar112.x1.a), v5qVar8.y0(), new wp20((ccc0) v5qVar8.H2.get(), (ijr) v5qVar8.o6.get(), (kt91) daqVar112.f8.get(), (dg30) v5qVar8.i.a, (q8n) daqVar112.w1.get()), v5qVar8.p(), new her((ayl) v5qVar8.F2.get(), (byte) 24), new gmt((ca40) v5qVar8.V0.get(), (ik21) v5qVar8.Y0.get(), (byte) 4), v5qVar8.n0(), v5qVar8.h0(), v5qVar8.G0(), v5qVar8.i0(), new i6b((xb40) v5qVar8.b8.get(), (byte) 0), v5qVar8.A());
                                    break;
                                case 1:
                                    blc0Var3 = blc0Var2;
                                    s7q s7qVar8 = m5qVar.b.d;
                                    f971 f971Var113 = (f971) s7qVar8.E3.get();
                                    jl21 jl21Var113 = (jl21) s7qVar8.G3.get();
                                    ua91 ua91VarT11 = s7qVar8.T4();
                                    ccc0 ccc0Var113 = (ccc0) s7qVar8.L1.get();
                                    ijr ijrVar113 = (ijr) s7qVar8.b3.get();
                                    daq daqVar113 = s7qVar8.b;
                                    ks6Var = new ks6(lik1Var2, link, f971Var113, jl21Var113, ua91VarT11, new a680(ccc0Var113, ijrVar113, (kt91) daqVar113.f8.get(), (dg30) s7qVar8.t.a, (q8n) daqVar113.w1.get()), (oh41) s7qVar8.H3.get(), s7qVar8.O1(), s7qVar8.B4(), new wp20((ccc0) s7qVar8.L1.get(), (ijr) s7qVar8.b3.get(), (kt91) daqVar113.f8.get(), (dg30) s7qVar8.t.a, (q8n) daqVar113.w1.get()), s7qVar8.X(), new her((ayl) s7qVar8.l3.get(), (byte) 24), s7qVar8.f1(), s7qVar8.E3(), s7qVar8.o3(), s7qVar8.j5(), s7qVar8.p3(), s7qVar8.Q(), s7qVar8.Y0());
                                    s4b1Var = s4b1VarX;
                                    break;
                                default:
                                    teq teqVar8 = m5qVar.b.d;
                                    f971 f971Var114 = (f971) teqVar8.O3.get();
                                    jl21 jl21Var114 = (jl21) teqVar8.l2.get();
                                    ua91 ua91VarJ10 = teqVar8.J3();
                                    ccc0 ccc0Var114 = (ccc0) teqVar8.q3.get();
                                    ijr ijrVar114 = (ijr) teqVar8.n5.get();
                                    daq daqVar114 = teqVar8.d;
                                    blc0Var3 = blc0Var2;
                                    ks6Var = new ks6(lik1Var2, link, f971Var114, jl21Var114, ua91VarJ10, new a680(ccc0Var114, ijrVar114, (kt91) daqVar114.f8.get(), (dg30) teqVar8.f.a, (q8n) daqVar114.w1.get()), (oh41) teqVar8.P3.get(), teqVar8.a1(), teqVar8.s3(), new wp20((ccc0) teqVar8.q3.get(), (ijr) teqVar8.n5.get(), (kt91) daqVar114.f8.get(), (dg30) teqVar8.f.a, (q8n) daqVar114.w1.get()), teqVar8.b0(), new her((ayl) teqVar8.x3.get(), (byte) 24), new gmt((ca40) teqVar8.f2.get(), (ik21) teqVar8.h2.get(), (byte) 4), teqVar8.A2(), teqVar8.n2(), teqVar8.X3(), teqVar8.o2(), new i6b((xb40) teqVar8.J5.get(), (byte) 0), teqVar8.B0());
                                    s4b1Var = s4b1VarX;
                                    break;
                            }
                            lik1Var3 = (lik1) ks6Var.a;
                            str = (String) ks6Var.b;
                            smc0VarN = k4p1.n();
                            bm6Var = this.V0;
                            if (bm6Var.c) {
                                followed = collectionArtist9.p().getFollowed();
                                boolean isBanned9 = collectionArtist9.p().getIsBanned();
                                wp20 wp20Var8 = (wp20) ks6Var.t;
                                if (followed) {
                                    fuxVar = fux.c;
                                } else {
                                    fuxVar = hnx.c;
                                }
                                fux fuxVar9 = fuxVar;
                                if (followed) {
                                    i2 = 2131954468;
                                } else {
                                    i2 = 2131954371;
                                }
                                str2 = str;
                                smc0VarN.add(new jhm("collection_follow_artist", fuxVar9, (fhm) null, Integer.valueOf(i2), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ll20.d1, new cl1(followed, str, (byte) 15)), new ew8(wp20Var8, followed, str, isBanned9, (byte) 2)), 244));
                            } else {
                                str2 = str;
                            }
                            if (!bm6Var.a) {
                            }
                            if (bm6Var.f) {
                                artistCollectionStateP = collectionArtist9.p();
                                if (artistCollectionStateP.getNumTracksInCollection() <= 0) {
                                }
                                String collectionLink8 = collectionArtist9.p().getCollectionLink();
                                ArtistSyncState artistSyncStateR8 = collectionArtist9.r();
                                xwp0VarO = dm5.O(artistSyncStateR8.getSyncProgress(), artistSyncStateR8.getOffline());
                                if (xwp0VarO.equals(rwp0.a)) {
                                    z22 = false;
                                } else {
                                    z22 = false;
                                }
                                her herVar8 = (her) ks6Var.Y;
                                if (z22) {
                                    umxVar = umx.c;
                                } else {
                                    umxVar = tmx.c;
                                }
                                umx umxVar9 = umxVar;
                                if (z22) {
                                    i = 2131954467;
                                } else {
                                    i = 2131954366;
                                }
                                Integer numValueOf8 = Integer.valueOf(i);
                                ygm ygmVar8 = new ygm(2);
                                if (z22) {
                                    hhmVar = hhm.b;
                                } else {
                                    hhmVar = hhm.a;
                                }
                                smc0VarN.add(new jhm("artist_download", umxVar9, (fhm) null, numValueOf8, (String) null, false, (tm81) null, new ihm(ygmVar8, hhmVar, new ghm(wiu.T0, new cl1(z22, collectionLink8, (byte) 10)), new c30(z22, herVar8, collectionLink8, (byte) 12)), 244));
                                break;
                            }
                            if (bm6Var.t) {
                                smc0VarN.add(js6Var.n.d());
                            }
                            ugo0Var = bm6Var.h;
                            if (ugo0Var != null) {
                                if (ugo0Var.a) {
                                    jhmVarS2 = ((kqi0) ks6Var.O0).k(ugo0Var);
                                } else {
                                    jhmVarS2 = ((dxy) ks6Var.Q0).s(ugo0Var);
                                }
                                smc0VarN.add(jhmVarS2);
                            }
                            p860Var = bm6Var.X;
                            if (p860Var != null) {
                                smc0VarN.add(js6Var.o.h(p860Var));
                            }
                            zJ = u890.j(vum1Var6, tum1.a);
                            e2t0Var = e2t0.b;
                            if (!zJ) {
                                if (!(vum1Var6 instanceof uum1)) {
                                    lik1Var4 = lik1Var3;
                                    smc0VarN.add(((tzr0) ks6Var.N0).g(str2, e2t0Var, lik1Var4));
                                }
                                if (lik1Var2.equals(nik1.q2)) {
                                    blc0Var4 = blc0Var;
                                    smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                } else {
                                    blc0Var4 = blc0Var;
                                    smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                                }
                                blc0Var4 = blc0Var;
                                jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                                if (jhmVarS != null) {
                                    smc0VarN.add(jhmVarS);
                                }
                                if (!bm6Var.b) {
                                    smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                                }
                                if (z16) {
                                    smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                                }
                                if (((no4) js6Var.a.a.get()).h()) {
                                    smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                                }
                                if (!bm6Var.g) {
                                    smc0VarN.add(((uf0) ks6Var.h).b(str2));
                                }
                                if (z20) {
                                    z21 = false;
                                } else {
                                    z21 = false;
                                }
                                if (js6Var.m.a) {
                                    smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                                }
                                ok51Var = bm6Var.i;
                                if (ok51Var != null) {
                                    smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                                }
                                if (bm6Var.d) {
                                    smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                } else {
                                    smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                                }
                                if (z19) {
                                    smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                                }
                                smc0VarN.add(((oh41) ks6Var.g).a(str2));
                                smc0 smc0VarK15 = k4p1.k(smc0VarN);
                                String standardLink15 = collectionArtist9.q().getPortraits().getStandardLink();
                                String name11113 = collectionArtist9.q().getName();
                                standardLink15.getClass();
                                String name11114 = collectionArtist9.q().getName();
                                String name11115 = collectionArtist9.q().getName();
                                uwr uwrVar15 = cbx.a;
                                return new kjm(new igm(name11113, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink15, name11114, name11115)})), (String) null, 4), smc0VarK15, 4);
                            }
                            smc0VarN.add(((dlg1) ks6Var.P0).i(str2, e2t0Var));
                            lik1Var4 = lik1Var3;
                            if (lik1Var2.equals(nik1.q2)) {
                                blc0Var4 = blc0Var;
                                smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                            } else {
                                blc0Var4 = blc0Var;
                                smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                            }
                            blc0Var4 = blc0Var;
                            jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                            if (jhmVarS != null) {
                                smc0VarN.add(jhmVarS);
                            }
                            if (!bm6Var.b) {
                                smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                            }
                            if (z16) {
                                smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                            }
                            if (((no4) js6Var.a.a.get()).h()) {
                                smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                            }
                            if (!bm6Var.g) {
                                smc0VarN.add(((uf0) ks6Var.h).b(str2));
                            }
                            if (z20) {
                                z21 = false;
                            } else {
                                z21 = false;
                            }
                            if (js6Var.m.a) {
                                smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                            }
                            ok51Var = bm6Var.i;
                            if (ok51Var != null) {
                                smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                            }
                            if (bm6Var.d) {
                                smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                            } else {
                                smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                            }
                            if (z19) {
                                smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                            }
                            smc0VarN.add(((oh41) ks6Var.g).a(str2));
                            smc0 smc0VarK16 = k4p1.k(smc0VarN);
                            String standardLink16 = collectionArtist9.q().getPortraits().getStandardLink();
                            String name11116 = collectionArtist9.q().getName();
                            standardLink16.getClass();
                            String name11117 = collectionArtist9.q().getName();
                            String name11118 = collectionArtist9.q().getName();
                            uwr uwrVar16 = cbx.a;
                            return new kjm(new igm(name11116, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink16, name11117, name11118)})), (String) null, 4), smc0VarK16, 4);
                        }
                    }
                }
                return d9nVar;
            case 8:
                obj2 = null;
                z8 = this.P0;
                boolean z36 = this.O0;
                boolean z37 = this.N0;
                boolean z38 = this.Z;
                qrg1 qrg1Var4 = this.Y;
                vum1 vum1Var16 = this.X;
                CollectionArtist collectionArtist19 = this.t;
                l2t l2tVar56 = this.i;
                l2tVar26 = this.f;
                hm5.M(obj);
                vum1Var6 = vum1Var16;
                l2tVar25 = l2tVar56;
                lik1Var = lik1Var5;
                objE7 = obj;
                z9 = z38;
                collectionArtist7 = collectionArtist19;
                z7 = z36;
                qrg1Var = qrg1Var4;
                js6Var = js6Var2;
                z10 = z37;
                d9nVar = d9nVar2;
                s2tVar = null;
                zBooleanValue5 = ((Boolean) objE7).booleanValue();
                this.T0 = s2tVar;
                this.a = s2tVar;
                this.b = s2tVar;
                this.c = s2tVar;
                this.d = s2tVar;
                this.e = s2tVar;
                this.f = s2tVar;
                this.g = s2tVar;
                this.h = s2tVar;
                this.i = l2tVar25;
                this.t = collectionArtist7;
                this.X = vum1Var6;
                this.Y = qrg1Var;
                this.Z = z9;
                this.N0 = z10;
                this.O0 = z7;
                this.P0 = z8;
                this.Q0 = zBooleanValue5;
                this.S0 = (byte) 9;
                objE8 = l2tVar26.E(this);
                if (objE8 != d9nVar) {
                    boolean z2111116 = z7;
                    z11 = z8;
                    z12 = zBooleanValue5;
                    z13 = z10;
                    z14 = z2111116;
                    z15 = z9;
                    qrg1Var2 = qrg1Var;
                    collectionArtist8 = collectionArtist7;
                    l2tVar27 = l2tVar25;
                    zBooleanValue6 = ((Boolean) objE8).booleanValue();
                    this.T0 = s2tVar;
                    this.a = s2tVar;
                    this.b = s2tVar;
                    this.c = s2tVar;
                    this.d = s2tVar;
                    this.e = s2tVar;
                    this.f = s2tVar;
                    this.g = s2tVar;
                    this.h = s2tVar;
                    this.i = s2tVar;
                    this.t = collectionArtist8;
                    this.X = vum1Var6;
                    this.Y = qrg1Var2;
                    this.Z = z15;
                    this.N0 = z13;
                    this.O0 = z14;
                    this.P0 = z11;
                    this.Q0 = z12;
                    this.R0 = zBooleanValue6;
                    this.S0 = (byte) 10;
                    objE9 = l2tVar27.E(this);
                    if (objE9 != d9nVar) {
                        boolean z2111117 = z11;
                        z16 = z12;
                        z17 = zBooleanValue6;
                        collectionArtist9 = collectionArtist8;
                        qrg1Var3 = qrg1Var2;
                        z18 = z14;
                        z19 = z2111117;
                        boolean z2111118 = z13;
                        boolean z2111119 = z15;
                        bs6 bs6Var9 = (bs6) objE9;
                        Set set9 = s4b1.f;
                        lik1Var2 = lik1Var;
                        s4b1VarX = uic.x(lik1Var2.a);
                        blc0Var = s4b1VarX.c;
                        blc0Var2 = blc0.v1;
                        if (blc0Var == blc0Var2) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        m5qVar = js6Var.k;
                        link = collectionArtist9.q().getLink();
                        boolean z21111110 = z17;
                        switch (m5qVar.a) {
                            case 0:
                                z16 = z16;
                                z19 = z19;
                                z18 = z18;
                                blc0Var = blc0Var;
                                blc0Var3 = blc0Var2;
                                v5q v5qVar9 = m5qVar.b.c;
                                f971 f971Var115 = (f971) v5qVar9.E5.get();
                                jl21 jl21Var115 = (jl21) v5qVar9.s2.get();
                                ua91 ua91VarD8 = v5qVar9.D0();
                                ccc0 ccc0Var115 = (ccc0) v5qVar9.H2.get();
                                ijr ijrVar115 = (ijr) v5qVar9.o6.get();
                                daq daqVar115 = v5qVar9.b;
                                s4b1Var = s4b1VarX;
                                ks6Var = new ks6(lik1Var2, link, f971Var115, jl21Var115, ua91VarD8, new a680(ccc0Var115, ijrVar115, (kt91) daqVar115.f8.get(), (dg30) v5qVar9.i.a, (q8n) daqVar115.w1.get()), (oh41) v5qVar9.M5.get(), new uf0((Context) daqVar115.x1.a), v5qVar9.y0(), new wp20((ccc0) v5qVar9.H2.get(), (ijr) v5qVar9.o6.get(), (kt91) daqVar115.f8.get(), (dg30) v5qVar9.i.a, (q8n) daqVar115.w1.get()), v5qVar9.p(), new her((ayl) v5qVar9.F2.get(), (byte) 24), new gmt((ca40) v5qVar9.V0.get(), (ik21) v5qVar9.Y0.get(), (byte) 4), v5qVar9.n0(), v5qVar9.h0(), v5qVar9.G0(), v5qVar9.i0(), new i6b((xb40) v5qVar9.b8.get(), (byte) 0), v5qVar9.A());
                                break;
                            case 1:
                                blc0Var3 = blc0Var2;
                                s7q s7qVar9 = m5qVar.b.d;
                                f971 f971Var116 = (f971) s7qVar9.E3.get();
                                jl21 jl21Var116 = (jl21) s7qVar9.G3.get();
                                ua91 ua91VarT12 = s7qVar9.T4();
                                ccc0 ccc0Var116 = (ccc0) s7qVar9.L1.get();
                                ijr ijrVar116 = (ijr) s7qVar9.b3.get();
                                daq daqVar116 = s7qVar9.b;
                                ks6Var = new ks6(lik1Var2, link, f971Var116, jl21Var116, ua91VarT12, new a680(ccc0Var116, ijrVar116, (kt91) daqVar116.f8.get(), (dg30) s7qVar9.t.a, (q8n) daqVar116.w1.get()), (oh41) s7qVar9.H3.get(), s7qVar9.O1(), s7qVar9.B4(), new wp20((ccc0) s7qVar9.L1.get(), (ijr) s7qVar9.b3.get(), (kt91) daqVar116.f8.get(), (dg30) s7qVar9.t.a, (q8n) daqVar116.w1.get()), s7qVar9.X(), new her((ayl) s7qVar9.l3.get(), (byte) 24), s7qVar9.f1(), s7qVar9.E3(), s7qVar9.o3(), s7qVar9.j5(), s7qVar9.p3(), s7qVar9.Q(), s7qVar9.Y0());
                                s4b1Var = s4b1VarX;
                                break;
                            default:
                                teq teqVar9 = m5qVar.b.d;
                                f971 f971Var117 = (f971) teqVar9.O3.get();
                                jl21 jl21Var117 = (jl21) teqVar9.l2.get();
                                ua91 ua91VarJ11 = teqVar9.J3();
                                ccc0 ccc0Var117 = (ccc0) teqVar9.q3.get();
                                ijr ijrVar117 = (ijr) teqVar9.n5.get();
                                daq daqVar117 = teqVar9.d;
                                blc0Var3 = blc0Var2;
                                ks6Var = new ks6(lik1Var2, link, f971Var117, jl21Var117, ua91VarJ11, new a680(ccc0Var117, ijrVar117, (kt91) daqVar117.f8.get(), (dg30) teqVar9.f.a, (q8n) daqVar117.w1.get()), (oh41) teqVar9.P3.get(), teqVar9.a1(), teqVar9.s3(), new wp20((ccc0) teqVar9.q3.get(), (ijr) teqVar9.n5.get(), (kt91) daqVar117.f8.get(), (dg30) teqVar9.f.a, (q8n) daqVar117.w1.get()), teqVar9.b0(), new her((ayl) teqVar9.x3.get(), (byte) 24), new gmt((ca40) teqVar9.f2.get(), (ik21) teqVar9.h2.get(), (byte) 4), teqVar9.A2(), teqVar9.n2(), teqVar9.X3(), teqVar9.o2(), new i6b((xb40) teqVar9.J5.get(), (byte) 0), teqVar9.B0());
                                s4b1Var = s4b1VarX;
                                break;
                        }
                        lik1Var3 = (lik1) ks6Var.a;
                        str = (String) ks6Var.b;
                        smc0VarN = k4p1.n();
                        bm6Var = this.V0;
                        if (bm6Var.c) {
                            followed = collectionArtist9.p().getFollowed();
                            boolean isBanned10 = collectionArtist9.p().getIsBanned();
                            wp20 wp20Var9 = (wp20) ks6Var.t;
                            if (followed) {
                                fuxVar = fux.c;
                            } else {
                                fuxVar = hnx.c;
                            }
                            fux fuxVar10 = fuxVar;
                            if (followed) {
                                i2 = 2131954468;
                            } else {
                                i2 = 2131954371;
                            }
                            str2 = str;
                            smc0VarN.add(new jhm("collection_follow_artist", fuxVar10, (fhm) null, Integer.valueOf(i2), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ll20.d1, new cl1(followed, str, (byte) 15)), new ew8(wp20Var9, followed, str, isBanned10, (byte) 2)), 244));
                        } else {
                            str2 = str;
                        }
                        if (!bm6Var.a) {
                        }
                        if (bm6Var.f) {
                            artistCollectionStateP = collectionArtist9.p();
                            if (artistCollectionStateP.getNumTracksInCollection() <= 0) {
                            }
                            String collectionLink9 = collectionArtist9.p().getCollectionLink();
                            ArtistSyncState artistSyncStateR9 = collectionArtist9.r();
                            xwp0VarO = dm5.O(artistSyncStateR9.getSyncProgress(), artistSyncStateR9.getOffline());
                            if (xwp0VarO.equals(rwp0.a)) {
                                z22 = false;
                            } else {
                                z22 = false;
                            }
                            her herVar9 = (her) ks6Var.Y;
                            if (z22) {
                                umxVar = umx.c;
                            } else {
                                umxVar = tmx.c;
                            }
                            umx umxVar10 = umxVar;
                            if (z22) {
                                i = 2131954467;
                            } else {
                                i = 2131954366;
                            }
                            Integer numValueOf9 = Integer.valueOf(i);
                            ygm ygmVar9 = new ygm(2);
                            if (z22) {
                                hhmVar = hhm.b;
                            } else {
                                hhmVar = hhm.a;
                            }
                            smc0VarN.add(new jhm("artist_download", umxVar10, (fhm) null, numValueOf9, (String) null, false, (tm81) null, new ihm(ygmVar9, hhmVar, new ghm(wiu.T0, new cl1(z22, collectionLink9, (byte) 10)), new c30(z22, herVar9, collectionLink9, (byte) 12)), 244));
                            break;
                        }
                        if (bm6Var.t) {
                            smc0VarN.add(js6Var.n.d());
                        }
                        ugo0Var = bm6Var.h;
                        if (ugo0Var != null) {
                            if (ugo0Var.a) {
                                jhmVarS2 = ((kqi0) ks6Var.O0).k(ugo0Var);
                            } else {
                                jhmVarS2 = ((dxy) ks6Var.Q0).s(ugo0Var);
                            }
                            smc0VarN.add(jhmVarS2);
                        }
                        p860Var = bm6Var.X;
                        if (p860Var != null) {
                            smc0VarN.add(js6Var.o.h(p860Var));
                        }
                        zJ = u890.j(vum1Var6, tum1.a);
                        e2t0Var = e2t0.b;
                        if (!zJ) {
                            if (!(vum1Var6 instanceof uum1)) {
                                lik1Var4 = lik1Var3;
                                smc0VarN.add(((tzr0) ks6Var.N0).g(str2, e2t0Var, lik1Var4));
                            }
                            if (lik1Var2.equals(nik1.q2)) {
                                blc0Var4 = blc0Var;
                                smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                            } else {
                                blc0Var4 = blc0Var;
                                smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                            }
                            blc0Var4 = blc0Var;
                            jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                            if (jhmVarS != null) {
                                smc0VarN.add(jhmVarS);
                            }
                            if (!bm6Var.b) {
                                smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                            }
                            if (z16) {
                                smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                            }
                            if (((no4) js6Var.a.a.get()).h()) {
                                smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                            }
                            if (!bm6Var.g) {
                                smc0VarN.add(((uf0) ks6Var.h).b(str2));
                            }
                            if (z20) {
                                z21 = false;
                            } else {
                                z21 = false;
                            }
                            if (js6Var.m.a) {
                                smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                            }
                            ok51Var = bm6Var.i;
                            if (ok51Var != null) {
                                smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                            }
                            if (bm6Var.d) {
                                smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                            } else {
                                smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                            }
                            if (z19) {
                                smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                            }
                            smc0VarN.add(((oh41) ks6Var.g).a(str2));
                            smc0 smc0VarK17 = k4p1.k(smc0VarN);
                            String standardLink17 = collectionArtist9.q().getPortraits().getStandardLink();
                            String name11119 = collectionArtist9.q().getName();
                            standardLink17.getClass();
                            String name111110 = collectionArtist9.q().getName();
                            String name111111 = collectionArtist9.q().getName();
                            uwr uwrVar17 = cbx.a;
                            return new kjm(new igm(name11119, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink17, name111110, name111111)})), (String) null, 4), smc0VarK17, 4);
                        }
                        smc0VarN.add(((dlg1) ks6Var.P0).i(str2, e2t0Var));
                        lik1Var4 = lik1Var3;
                        if (lik1Var2.equals(nik1.q2)) {
                            blc0Var4 = blc0Var;
                            smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                        } else {
                            blc0Var4 = blc0Var;
                            smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                        }
                        blc0Var4 = blc0Var;
                        jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                        if (jhmVarS != null) {
                            smc0VarN.add(jhmVarS);
                        }
                        if (!bm6Var.b) {
                            smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                        }
                        if (z16) {
                            smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                        }
                        if (((no4) js6Var.a.a.get()).h()) {
                            smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                        }
                        if (!bm6Var.g) {
                            smc0VarN.add(((uf0) ks6Var.h).b(str2));
                        }
                        if (z20) {
                            z21 = false;
                        } else {
                            z21 = false;
                        }
                        if (js6Var.m.a) {
                            smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                        }
                        ok51Var = bm6Var.i;
                        if (ok51Var != null) {
                            smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                        }
                        if (bm6Var.d) {
                            smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                        } else {
                            smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                        }
                        if (z19) {
                            smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                        }
                        smc0VarN.add(((oh41) ks6Var.g).a(str2));
                        smc0 smc0VarK18 = k4p1.k(smc0VarN);
                        String standardLink18 = collectionArtist9.q().getPortraits().getStandardLink();
                        String name111112 = collectionArtist9.q().getName();
                        standardLink18.getClass();
                        String name111113 = collectionArtist9.q().getName();
                        String name111114 = collectionArtist9.q().getName();
                        uwr uwrVar18 = cbx.a;
                        return new kjm(new igm(name111112, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink18, name111113, name111114)})), (String) null, 4), smc0VarK18, 4);
                    }
                }
                return d9nVar;
            case 9:
                obj2 = null;
                z12 = this.Q0;
                boolean z39 = this.P0;
                boolean z40 = this.O0;
                boolean z41 = this.N0;
                boolean z42 = this.Z;
                qrg1Var2 = this.Y;
                vum1 vum1Var17 = this.X;
                CollectionArtist collectionArtist20 = this.t;
                l2tVar27 = this.i;
                hm5.M(obj);
                z11 = z39;
                js6Var = js6Var2;
                d9nVar = d9nVar2;
                z13 = z41;
                vum1Var6 = vum1Var17;
                lik1Var = lik1Var5;
                collectionArtist8 = collectionArtist20;
                objE8 = obj;
                z15 = z42;
                z14 = z40;
                s2tVar = null;
                zBooleanValue6 = ((Boolean) objE8).booleanValue();
                this.T0 = s2tVar;
                this.a = s2tVar;
                this.b = s2tVar;
                this.c = s2tVar;
                this.d = s2tVar;
                this.e = s2tVar;
                this.f = s2tVar;
                this.g = s2tVar;
                this.h = s2tVar;
                this.i = s2tVar;
                this.t = collectionArtist8;
                this.X = vum1Var6;
                this.Y = qrg1Var2;
                this.Z = z15;
                this.N0 = z13;
                this.O0 = z14;
                this.P0 = z11;
                this.Q0 = z12;
                this.R0 = zBooleanValue6;
                this.S0 = (byte) 10;
                objE9 = l2tVar27.E(this);
                if (objE9 != d9nVar) {
                    boolean z21111111 = z11;
                    z16 = z12;
                    z17 = zBooleanValue6;
                    collectionArtist9 = collectionArtist8;
                    qrg1Var3 = qrg1Var2;
                    z18 = z14;
                    z19 = z21111111;
                    boolean z21111112 = z13;
                    boolean z21111113 = z15;
                    bs6 bs6Var10 = (bs6) objE9;
                    Set set10 = s4b1.f;
                    lik1Var2 = lik1Var;
                    s4b1VarX = uic.x(lik1Var2.a);
                    blc0Var = s4b1VarX.c;
                    blc0Var2 = blc0.v1;
                    if (blc0Var == blc0Var2) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    m5qVar = js6Var.k;
                    link = collectionArtist9.q().getLink();
                    boolean z21111114 = z17;
                    switch (m5qVar.a) {
                        case 0:
                            z16 = z16;
                            z19 = z19;
                            z18 = z18;
                            blc0Var = blc0Var;
                            blc0Var3 = blc0Var2;
                            v5q v5qVar10 = m5qVar.b.c;
                            f971 f971Var118 = (f971) v5qVar10.E5.get();
                            jl21 jl21Var118 = (jl21) v5qVar10.s2.get();
                            ua91 ua91VarD9 = v5qVar10.D0();
                            ccc0 ccc0Var118 = (ccc0) v5qVar10.H2.get();
                            ijr ijrVar118 = (ijr) v5qVar10.o6.get();
                            daq daqVar118 = v5qVar10.b;
                            s4b1Var = s4b1VarX;
                            ks6Var = new ks6(lik1Var2, link, f971Var118, jl21Var118, ua91VarD9, new a680(ccc0Var118, ijrVar118, (kt91) daqVar118.f8.get(), (dg30) v5qVar10.i.a, (q8n) daqVar118.w1.get()), (oh41) v5qVar10.M5.get(), new uf0((Context) daqVar118.x1.a), v5qVar10.y0(), new wp20((ccc0) v5qVar10.H2.get(), (ijr) v5qVar10.o6.get(), (kt91) daqVar118.f8.get(), (dg30) v5qVar10.i.a, (q8n) daqVar118.w1.get()), v5qVar10.p(), new her((ayl) v5qVar10.F2.get(), (byte) 24), new gmt((ca40) v5qVar10.V0.get(), (ik21) v5qVar10.Y0.get(), (byte) 4), v5qVar10.n0(), v5qVar10.h0(), v5qVar10.G0(), v5qVar10.i0(), new i6b((xb40) v5qVar10.b8.get(), (byte) 0), v5qVar10.A());
                            break;
                        case 1:
                            blc0Var3 = blc0Var2;
                            s7q s7qVar10 = m5qVar.b.d;
                            f971 f971Var119 = (f971) s7qVar10.E3.get();
                            jl21 jl21Var119 = (jl21) s7qVar10.G3.get();
                            ua91 ua91VarT13 = s7qVar10.T4();
                            ccc0 ccc0Var119 = (ccc0) s7qVar10.L1.get();
                            ijr ijrVar119 = (ijr) s7qVar10.b3.get();
                            daq daqVar119 = s7qVar10.b;
                            ks6Var = new ks6(lik1Var2, link, f971Var119, jl21Var119, ua91VarT13, new a680(ccc0Var119, ijrVar119, (kt91) daqVar119.f8.get(), (dg30) s7qVar10.t.a, (q8n) daqVar119.w1.get()), (oh41) s7qVar10.H3.get(), s7qVar10.O1(), s7qVar10.B4(), new wp20((ccc0) s7qVar10.L1.get(), (ijr) s7qVar10.b3.get(), (kt91) daqVar119.f8.get(), (dg30) s7qVar10.t.a, (q8n) daqVar119.w1.get()), s7qVar10.X(), new her((ayl) s7qVar10.l3.get(), (byte) 24), s7qVar10.f1(), s7qVar10.E3(), s7qVar10.o3(), s7qVar10.j5(), s7qVar10.p3(), s7qVar10.Q(), s7qVar10.Y0());
                            s4b1Var = s4b1VarX;
                            break;
                        default:
                            teq teqVar10 = m5qVar.b.d;
                            f971 f971Var1110 = (f971) teqVar10.O3.get();
                            jl21 jl21Var1110 = (jl21) teqVar10.l2.get();
                            ua91 ua91VarJ12 = teqVar10.J3();
                            ccc0 ccc0Var1110 = (ccc0) teqVar10.q3.get();
                            ijr ijrVar1110 = (ijr) teqVar10.n5.get();
                            daq daqVar1110 = teqVar10.d;
                            blc0Var3 = blc0Var2;
                            ks6Var = new ks6(lik1Var2, link, f971Var1110, jl21Var1110, ua91VarJ12, new a680(ccc0Var1110, ijrVar1110, (kt91) daqVar1110.f8.get(), (dg30) teqVar10.f.a, (q8n) daqVar1110.w1.get()), (oh41) teqVar10.P3.get(), teqVar10.a1(), teqVar10.s3(), new wp20((ccc0) teqVar10.q3.get(), (ijr) teqVar10.n5.get(), (kt91) daqVar1110.f8.get(), (dg30) teqVar10.f.a, (q8n) daqVar1110.w1.get()), teqVar10.b0(), new her((ayl) teqVar10.x3.get(), (byte) 24), new gmt((ca40) teqVar10.f2.get(), (ik21) teqVar10.h2.get(), (byte) 4), teqVar10.A2(), teqVar10.n2(), teqVar10.X3(), teqVar10.o2(), new i6b((xb40) teqVar10.J5.get(), (byte) 0), teqVar10.B0());
                            s4b1Var = s4b1VarX;
                            break;
                    }
                    lik1Var3 = (lik1) ks6Var.a;
                    str = (String) ks6Var.b;
                    smc0VarN = k4p1.n();
                    bm6Var = this.V0;
                    if (bm6Var.c) {
                        followed = collectionArtist9.p().getFollowed();
                        boolean isBanned11 = collectionArtist9.p().getIsBanned();
                        wp20 wp20Var10 = (wp20) ks6Var.t;
                        if (followed) {
                            fuxVar = fux.c;
                        } else {
                            fuxVar = hnx.c;
                        }
                        fux fuxVar11 = fuxVar;
                        if (followed) {
                            i2 = 2131954468;
                        } else {
                            i2 = 2131954371;
                        }
                        str2 = str;
                        smc0VarN.add(new jhm("collection_follow_artist", fuxVar11, (fhm) null, Integer.valueOf(i2), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ll20.d1, new cl1(followed, str, (byte) 15)), new ew8(wp20Var10, followed, str, isBanned11, (byte) 2)), 244));
                    } else {
                        str2 = str;
                    }
                    if (!bm6Var.a) {
                    }
                    if (bm6Var.f) {
                        artistCollectionStateP = collectionArtist9.p();
                        if (artistCollectionStateP.getNumTracksInCollection() <= 0) {
                        }
                        String collectionLink10 = collectionArtist9.p().getCollectionLink();
                        ArtistSyncState artistSyncStateR10 = collectionArtist9.r();
                        xwp0VarO = dm5.O(artistSyncStateR10.getSyncProgress(), artistSyncStateR10.getOffline());
                        if (xwp0VarO.equals(rwp0.a)) {
                            z22 = false;
                        } else {
                            z22 = false;
                        }
                        her herVar10 = (her) ks6Var.Y;
                        if (z22) {
                            umxVar = umx.c;
                        } else {
                            umxVar = tmx.c;
                        }
                        umx umxVar11 = umxVar;
                        if (z22) {
                            i = 2131954467;
                        } else {
                            i = 2131954366;
                        }
                        Integer numValueOf10 = Integer.valueOf(i);
                        ygm ygmVar10 = new ygm(2);
                        if (z22) {
                            hhmVar = hhm.b;
                        } else {
                            hhmVar = hhm.a;
                        }
                        smc0VarN.add(new jhm("artist_download", umxVar11, (fhm) null, numValueOf10, (String) null, false, (tm81) null, new ihm(ygmVar10, hhmVar, new ghm(wiu.T0, new cl1(z22, collectionLink10, (byte) 10)), new c30(z22, herVar10, collectionLink10, (byte) 12)), 244));
                        break;
                    }
                    if (bm6Var.t) {
                        smc0VarN.add(js6Var.n.d());
                    }
                    ugo0Var = bm6Var.h;
                    if (ugo0Var != null) {
                        if (ugo0Var.a) {
                            jhmVarS2 = ((kqi0) ks6Var.O0).k(ugo0Var);
                        } else {
                            jhmVarS2 = ((dxy) ks6Var.Q0).s(ugo0Var);
                        }
                        smc0VarN.add(jhmVarS2);
                    }
                    p860Var = bm6Var.X;
                    if (p860Var != null) {
                        smc0VarN.add(js6Var.o.h(p860Var));
                    }
                    zJ = u890.j(vum1Var6, tum1.a);
                    e2t0Var = e2t0.b;
                    if (!zJ) {
                        if (!(vum1Var6 instanceof uum1)) {
                            lik1Var4 = lik1Var3;
                            smc0VarN.add(((tzr0) ks6Var.N0).g(str2, e2t0Var, lik1Var4));
                        }
                        if (lik1Var2.equals(nik1.q2)) {
                            blc0Var4 = blc0Var;
                            smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                        } else {
                            blc0Var4 = blc0Var;
                            smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                        }
                        blc0Var4 = blc0Var;
                        jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                        if (jhmVarS != null) {
                            smc0VarN.add(jhmVarS);
                        }
                        if (!bm6Var.b) {
                            smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                        }
                        if (z16) {
                            smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                        }
                        if (((no4) js6Var.a.a.get()).h()) {
                            smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                        }
                        if (!bm6Var.g) {
                            smc0VarN.add(((uf0) ks6Var.h).b(str2));
                        }
                        if (z20) {
                            z21 = false;
                        } else {
                            z21 = false;
                        }
                        if (js6Var.m.a) {
                            smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                        }
                        ok51Var = bm6Var.i;
                        if (ok51Var != null) {
                            smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                        }
                        if (bm6Var.d) {
                            smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                        } else {
                            smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                        }
                        if (z19) {
                            smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                        }
                        smc0VarN.add(((oh41) ks6Var.g).a(str2));
                        smc0 smc0VarK19 = k4p1.k(smc0VarN);
                        String standardLink19 = collectionArtist9.q().getPortraits().getStandardLink();
                        String name111115 = collectionArtist9.q().getName();
                        standardLink19.getClass();
                        String name111116 = collectionArtist9.q().getName();
                        String name111117 = collectionArtist9.q().getName();
                        uwr uwrVar19 = cbx.a;
                        return new kjm(new igm(name111115, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink19, name111116, name111117)})), (String) null, 4), smc0VarK19, 4);
                    }
                    smc0VarN.add(((dlg1) ks6Var.P0).i(str2, e2t0Var));
                    lik1Var4 = lik1Var3;
                    if (lik1Var2.equals(nik1.q2)) {
                        blc0Var4 = blc0Var;
                        smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                    } else {
                        blc0Var4 = blc0Var;
                        smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                    }
                    blc0Var4 = blc0Var;
                    jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                    if (jhmVarS != null) {
                        smc0VarN.add(jhmVarS);
                    }
                    if (!bm6Var.b) {
                        smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                    }
                    if (z16) {
                        smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                    }
                    if (((no4) js6Var.a.a.get()).h()) {
                        smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                    }
                    if (!bm6Var.g) {
                        smc0VarN.add(((uf0) ks6Var.h).b(str2));
                    }
                    if (z20) {
                        z21 = false;
                    } else {
                        z21 = false;
                    }
                    if (js6Var.m.a) {
                        smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                    }
                    ok51Var = bm6Var.i;
                    if (ok51Var != null) {
                        smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                    }
                    if (bm6Var.d) {
                        smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                    } else {
                        smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                    }
                    if (z19) {
                        smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                    }
                    smc0VarN.add(((oh41) ks6Var.g).a(str2));
                    smc0 smc0VarK110 = k4p1.k(smc0VarN);
                    String standardLink110 = collectionArtist9.q().getPortraits().getStandardLink();
                    String name111118 = collectionArtist9.q().getName();
                    standardLink110.getClass();
                    String name111119 = collectionArtist9.q().getName();
                    String name1111110 = collectionArtist9.q().getName();
                    uwr uwrVar110 = cbx.a;
                    return new kjm(new igm(name111118, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink110, name111119, name1111110)})), (String) null, 4), smc0VarK110, 4);
                }
                return d9nVar;
            case 10:
                z17 = this.R0;
                boolean z43 = this.Q0;
                boolean z44 = this.P0;
                boolean z45 = this.O0;
                z13 = this.N0;
                z15 = this.Z;
                obj2 = null;
                qrg1 qrg1Var5 = this.Y;
                vum1 vum1Var18 = this.X;
                CollectionArtist collectionArtist21 = this.t;
                hm5.M(obj);
                objE9 = obj;
                vum1Var6 = vum1Var18;
                collectionArtist9 = collectionArtist21;
                lik1Var = lik1Var5;
                qrg1Var3 = qrg1Var5;
                z18 = z45;
                z19 = z44;
                z16 = z43;
                js6Var = js6Var2;
                boolean z21111115 = z13;
                boolean z21111116 = z15;
                bs6 bs6Var11 = (bs6) objE9;
                Set set11 = s4b1.f;
                lik1Var2 = lik1Var;
                s4b1VarX = uic.x(lik1Var2.a);
                blc0Var = s4b1VarX.c;
                blc0Var2 = blc0.v1;
                if (blc0Var == blc0Var2) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                m5qVar = js6Var.k;
                link = collectionArtist9.q().getLink();
                boolean z21111117 = z17;
                switch (m5qVar.a) {
                    case 0:
                        z16 = z16;
                        z19 = z19;
                        z18 = z18;
                        blc0Var = blc0Var;
                        blc0Var3 = blc0Var2;
                        v5q v5qVar11 = m5qVar.b.c;
                        f971 f971Var1111 = (f971) v5qVar11.E5.get();
                        jl21 jl21Var1111 = (jl21) v5qVar11.s2.get();
                        ua91 ua91VarD10 = v5qVar11.D0();
                        ccc0 ccc0Var1111 = (ccc0) v5qVar11.H2.get();
                        ijr ijrVar1111 = (ijr) v5qVar11.o6.get();
                        daq daqVar1111 = v5qVar11.b;
                        s4b1Var = s4b1VarX;
                        ks6Var = new ks6(lik1Var2, link, f971Var1111, jl21Var1111, ua91VarD10, new a680(ccc0Var1111, ijrVar1111, (kt91) daqVar1111.f8.get(), (dg30) v5qVar11.i.a, (q8n) daqVar1111.w1.get()), (oh41) v5qVar11.M5.get(), new uf0((Context) daqVar1111.x1.a), v5qVar11.y0(), new wp20((ccc0) v5qVar11.H2.get(), (ijr) v5qVar11.o6.get(), (kt91) daqVar1111.f8.get(), (dg30) v5qVar11.i.a, (q8n) daqVar1111.w1.get()), v5qVar11.p(), new her((ayl) v5qVar11.F2.get(), (byte) 24), new gmt((ca40) v5qVar11.V0.get(), (ik21) v5qVar11.Y0.get(), (byte) 4), v5qVar11.n0(), v5qVar11.h0(), v5qVar11.G0(), v5qVar11.i0(), new i6b((xb40) v5qVar11.b8.get(), (byte) 0), v5qVar11.A());
                        break;
                    case 1:
                        blc0Var3 = blc0Var2;
                        s7q s7qVar11 = m5qVar.b.d;
                        f971 f971Var1112 = (f971) s7qVar11.E3.get();
                        jl21 jl21Var1112 = (jl21) s7qVar11.G3.get();
                        ua91 ua91VarT14 = s7qVar11.T4();
                        ccc0 ccc0Var1112 = (ccc0) s7qVar11.L1.get();
                        ijr ijrVar1112 = (ijr) s7qVar11.b3.get();
                        daq daqVar1112 = s7qVar11.b;
                        ks6Var = new ks6(lik1Var2, link, f971Var1112, jl21Var1112, ua91VarT14, new a680(ccc0Var1112, ijrVar1112, (kt91) daqVar1112.f8.get(), (dg30) s7qVar11.t.a, (q8n) daqVar1112.w1.get()), (oh41) s7qVar11.H3.get(), s7qVar11.O1(), s7qVar11.B4(), new wp20((ccc0) s7qVar11.L1.get(), (ijr) s7qVar11.b3.get(), (kt91) daqVar1112.f8.get(), (dg30) s7qVar11.t.a, (q8n) daqVar1112.w1.get()), s7qVar11.X(), new her((ayl) s7qVar11.l3.get(), (byte) 24), s7qVar11.f1(), s7qVar11.E3(), s7qVar11.o3(), s7qVar11.j5(), s7qVar11.p3(), s7qVar11.Q(), s7qVar11.Y0());
                        s4b1Var = s4b1VarX;
                        break;
                    default:
                        teq teqVar11 = m5qVar.b.d;
                        f971 f971Var1113 = (f971) teqVar11.O3.get();
                        jl21 jl21Var1113 = (jl21) teqVar11.l2.get();
                        ua91 ua91VarJ13 = teqVar11.J3();
                        ccc0 ccc0Var1113 = (ccc0) teqVar11.q3.get();
                        ijr ijrVar1113 = (ijr) teqVar11.n5.get();
                        daq daqVar1113 = teqVar11.d;
                        blc0Var3 = blc0Var2;
                        ks6Var = new ks6(lik1Var2, link, f971Var1113, jl21Var1113, ua91VarJ13, new a680(ccc0Var1113, ijrVar1113, (kt91) daqVar1113.f8.get(), (dg30) teqVar11.f.a, (q8n) daqVar1113.w1.get()), (oh41) teqVar11.P3.get(), teqVar11.a1(), teqVar11.s3(), new wp20((ccc0) teqVar11.q3.get(), (ijr) teqVar11.n5.get(), (kt91) daqVar1113.f8.get(), (dg30) teqVar11.f.a, (q8n) daqVar1113.w1.get()), teqVar11.b0(), new her((ayl) teqVar11.x3.get(), (byte) 24), new gmt((ca40) teqVar11.f2.get(), (ik21) teqVar11.h2.get(), (byte) 4), teqVar11.A2(), teqVar11.n2(), teqVar11.X3(), teqVar11.o2(), new i6b((xb40) teqVar11.J5.get(), (byte) 0), teqVar11.B0());
                        s4b1Var = s4b1VarX;
                        break;
                }
                lik1Var3 = (lik1) ks6Var.a;
                str = (String) ks6Var.b;
                smc0VarN = k4p1.n();
                bm6Var = this.V0;
                if (bm6Var.c) {
                    followed = collectionArtist9.p().getFollowed();
                    boolean isBanned12 = collectionArtist9.p().getIsBanned();
                    wp20 wp20Var11 = (wp20) ks6Var.t;
                    if (followed) {
                        fuxVar = fux.c;
                    } else {
                        fuxVar = hnx.c;
                    }
                    fux fuxVar12 = fuxVar;
                    if (followed) {
                        i2 = 2131954468;
                    } else {
                        i2 = 2131954371;
                    }
                    str2 = str;
                    smc0VarN.add(new jhm("collection_follow_artist", fuxVar12, (fhm) null, Integer.valueOf(i2), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ll20.d1, new cl1(followed, str, (byte) 15)), new ew8(wp20Var11, followed, str, isBanned12, (byte) 2)), 244));
                } else {
                    str2 = str;
                }
                if (!bm6Var.a) {
                }
                if (bm6Var.f) {
                    artistCollectionStateP = collectionArtist9.p();
                    if (artistCollectionStateP.getNumTracksInCollection() <= 0) {
                    }
                    String collectionLink11 = collectionArtist9.p().getCollectionLink();
                    ArtistSyncState artistSyncStateR11 = collectionArtist9.r();
                    xwp0VarO = dm5.O(artistSyncStateR11.getSyncProgress(), artistSyncStateR11.getOffline());
                    if (xwp0VarO.equals(rwp0.a)) {
                        z22 = false;
                    } else {
                        z22 = false;
                    }
                    her herVar11 = (her) ks6Var.Y;
                    if (z22) {
                        umxVar = umx.c;
                    } else {
                        umxVar = tmx.c;
                    }
                    umx umxVar12 = umxVar;
                    if (z22) {
                        i = 2131954467;
                    } else {
                        i = 2131954366;
                    }
                    Integer numValueOf11 = Integer.valueOf(i);
                    ygm ygmVar11 = new ygm(2);
                    if (z22) {
                        hhmVar = hhm.b;
                    } else {
                        hhmVar = hhm.a;
                    }
                    smc0VarN.add(new jhm("artist_download", umxVar12, (fhm) null, numValueOf11, (String) null, false, (tm81) null, new ihm(ygmVar11, hhmVar, new ghm(wiu.T0, new cl1(z22, collectionLink11, (byte) 10)), new c30(z22, herVar11, collectionLink11, (byte) 12)), 244));
                    break;
                }
                if (bm6Var.t) {
                    smc0VarN.add(js6Var.n.d());
                }
                ugo0Var = bm6Var.h;
                if (ugo0Var != null) {
                    if (ugo0Var.a) {
                        jhmVarS2 = ((kqi0) ks6Var.O0).k(ugo0Var);
                    } else {
                        jhmVarS2 = ((dxy) ks6Var.Q0).s(ugo0Var);
                    }
                    smc0VarN.add(jhmVarS2);
                }
                p860Var = bm6Var.X;
                if (p860Var != null) {
                    smc0VarN.add(js6Var.o.h(p860Var));
                }
                zJ = u890.j(vum1Var6, tum1.a);
                e2t0Var = e2t0.b;
                if (!zJ) {
                    if (!(vum1Var6 instanceof uum1)) {
                        lik1Var4 = lik1Var3;
                        smc0VarN.add(((tzr0) ks6Var.N0).g(str2, e2t0Var, lik1Var4));
                    }
                    if (lik1Var2.equals(nik1.q2)) {
                        blc0Var4 = blc0Var;
                        smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                    } else {
                        blc0Var4 = blc0Var;
                        smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                    }
                    blc0Var4 = blc0Var;
                    jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                    if (jhmVarS != null) {
                        smc0VarN.add(jhmVarS);
                    }
                    if (!bm6Var.b) {
                        smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                    }
                    if (z16) {
                        smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                    }
                    if (((no4) js6Var.a.a.get()).h()) {
                        smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                    }
                    if (!bm6Var.g) {
                        smc0VarN.add(((uf0) ks6Var.h).b(str2));
                    }
                    if (z20) {
                        z21 = false;
                    } else {
                        z21 = false;
                    }
                    if (js6Var.m.a) {
                        smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                    }
                    ok51Var = bm6Var.i;
                    if (ok51Var != null) {
                        smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                    }
                    if (bm6Var.d) {
                        smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                    } else {
                        smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                    }
                    if (z19) {
                        smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                    }
                    smc0VarN.add(((oh41) ks6Var.g).a(str2));
                    smc0 smc0VarK111 = k4p1.k(smc0VarN);
                    String standardLink111 = collectionArtist9.q().getPortraits().getStandardLink();
                    String name1111111 = collectionArtist9.q().getName();
                    standardLink111.getClass();
                    String name1111112 = collectionArtist9.q().getName();
                    String name1111113 = collectionArtist9.q().getName();
                    uwr uwrVar111 = cbx.a;
                    return new kjm(new igm(name1111111, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink111, name1111112, name1111113)})), (String) null, 4), smc0VarK111, 4);
                }
                smc0VarN.add(((dlg1) ks6Var.P0).i(str2, e2t0Var));
                lik1Var4 = lik1Var3;
                if (lik1Var2.equals(nik1.q2)) {
                    blc0Var4 = blc0Var;
                    smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                } else {
                    blc0Var4 = blc0Var;
                    smc0VarN.add(((i6c) ks6Var.X).a(str2, collectionArtist9.q().getName()));
                }
                blc0Var4 = blc0Var;
                jhmVarS = js6Var.f31p.s(collectionArtist9.q().getLink());
                if (jhmVarS != null) {
                    smc0VarN.add(jhmVarS);
                }
                if (!bm6Var.b) {
                    smc0VarN.add(f971.b((f971) ks6Var.c, str2, (String) null));
                }
                if (z16) {
                    smc0VarN.add(((i6b) ks6Var.R0).h(str2));
                }
                if (((no4) js6Var.a.a.get()).h()) {
                    smc0VarN.add(((ua91) ks6Var.e).x(str2, (String) null, mno1.b, qrg1Var3.c));
                }
                if (!bm6Var.g) {
                    smc0VarN.add(((uf0) ks6Var.h).b(str2));
                }
                if (z20) {
                    z21 = false;
                } else {
                    z21 = false;
                }
                if (js6Var.m.a) {
                    smc0VarN.add(new jhm("song_dna_artist", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_artist", (iu30) null, true), new ihm(ahm.c, new ghm(cv6.Y0, new wk3(str2, (byte) 13)), new xg6((yx6) ((mxr) ks6Var.S0).b, str2, (byte) 19)), 84));
                }
                ok51Var = bm6Var.i;
                if (ok51Var != null) {
                    smc0VarN.add(((dc31) ks6Var.i).d(ok51Var));
                }
                if (bm6Var.d) {
                    smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                } else {
                    smc0VarN.add(jl21.b((jl21) ks6Var.d, str2, lik1Var4));
                }
                if (z19) {
                    smc0VarN.add(((gmt) ks6Var.Z).e(str2));
                }
                smc0VarN.add(((oh41) ks6Var.g).a(str2));
                smc0 smc0VarK112 = k4p1.k(smc0VarN);
                String standardLink112 = collectionArtist9.q().getPortraits().getStandardLink();
                String name1111114 = collectionArtist9.q().getName();
                standardLink112.getClass();
                String name1111115 = collectionArtist9.q().getName();
                String name1111116 = collectionArtist9.q().getName();
                uwr uwrVar112 = cbx.a;
                return new kjm(new igm(name1111114, new ufm(mqo1.s(new phx[]{new phx(((yex) zex.a.d).d, standardLink112, name1111115, name1111116)})), (String) null, 4), smc0VarK112, 4);
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
