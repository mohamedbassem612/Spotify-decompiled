package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p.avw0;
import p.cbn1;
import p.d8n1;
import p.efn1;
import p.hcn1;
import p.hen1;
import p.hzh;
import p.im00;
import p.jen1;
import p.mfg;
import p.o321;
import p.oin1;
import p.ot71;
import p.p321;
import p.pbo1;
import p.qok0;
import p.t9n1;
import p.tok0;
import p.u2o1;
import p.vrg;
import p.vzh;
import p.wct;
import p.xam1;
import p.yxm1;
import p.zhm0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        vzh vzhVar = ot71.b;
        hzh hzhVarA = vzh.a(zhm0.class);
        hzhVarA.a(wct.a(qok0.class));
        hzhVarA.f = new cbn1();
        vzh vzhVarB = hzhVarA.b();
        hzh hzhVarA2 = vzh.a(tok0.class);
        hzhVarA2.f = new hen1();
        vzh vzhVarB2 = hzhVarA2.b();
        hzh hzhVarA3 = vzh.a(p321.class);
        hzhVarA3.a(new wct(o321.class, 2, 0));
        hzhVarA3.f = new avw0((byte) 22);
        vzh vzhVarB3 = hzhVarA3.b();
        hzh hzhVarA4 = vzh.a(im00.class);
        hzhVarA4.a(new wct(tok0.class, 1, 1));
        hzhVarA4.f = new xam1();
        vzh vzhVarB4 = hzhVarA4.b();
        hzh hzhVarA5 = vzh.a(mfg.class);
        hzhVarA5.f = new yxm1();
        vzh vzhVarB5 = hzhVarA5.b();
        hzh hzhVarA6 = vzh.a(vrg.class);
        hzhVarA6.a(wct.a(mfg.class));
        hzhVarA6.f = new d8n1();
        vzh vzhVarB6 = hzhVarA6.b();
        hzh hzhVarA7 = vzh.a(pbo1.class);
        hzhVarA7.a(wct.a(qok0.class));
        hzhVarA7.f = new t9n1();
        vzh vzhVarB7 = hzhVarA7.b();
        hzh hzhVarA8 = vzh.a(o321.class);
        hzhVarA8.e = true;
        hzhVarA8.a(new wct(pbo1.class, 1, 1));
        hzhVarA8.f = new hcn1();
        vzh vzhVarB8 = hzhVarA8.b();
        jen1 jen1Var = efn1.g;
        Object[] objArr = {vzhVar, vzhVarB, vzhVarB2, vzhVarB3, vzhVarB4, vzhVarB5, vzhVarB6, vzhVarB7, vzhVarB8};
        u2o1.x(9, objArr);
        return new oin1(9, objArr);
    }
}
