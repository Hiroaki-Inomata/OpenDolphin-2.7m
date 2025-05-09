## OpenDolphin-2.7m

### 概要
OpenDolphin-2.7m (2.7m) は、 dolphin-dev/OpenDolphin のオープンソース電子カルテ OpenDolphin2.7.0b (2.7) の modified version（ bugfix + α）です。
 * クライアント外観・データ構造は 2.7 と完全に同一です。
 * ファイルバックアップ機能を備えています。

### インストール方法

 * [OpenOcean/OpenDolphin をカスタマイズするために知っておいた方がよいこと](https://phazor.info/OpenOcean/?p=1)
 * [OpenOcean/OpenDolphin をカスタマイズするために知っておいた方がよいこと ２](https://phazor.info/OpenOcean/?p=217)
 * [Open Dolphin 2.7.0b を Win10 にインストールしてみた](https://phazor.info/air/?page_id=543)
 * [Open Dolphin 2.7(m) を Mac OSX にインストールする](https://allnightnihon2b.net/blog-jp/?page_id=367)

　などを参考にしてください。

### クライアント起動方法
　windows か Mac であれば、ダブルクリック一発で起動します。  
  
![opendolphin on JakartaEE, Java17](https://user-images.githubusercontent.com/8698703/200154977-39c4a66a-058d-40a5-b12d-d3bc1dc7aad2.png)
  
  
### 派生プロジェクト
[OpenOcean](https://github.com/air-h-128k-il/OpenOcean)が実質的な後継プロジェクトです。  
  
* 当プロジェクト fork 後、コードメンテナンスおよびいくつかの機能が追加されています。  
* さらに将来的に DICOMviewer/PACS [HorliX](https://github.com/air-h-128k-il/HorliX) との連携も期待できます。  
  
OpenOcean の利用も検討してみてください。  
と言っていたのですが OpenOcean 大幅書き直しの予定（→ [DolphORCA](https://p-horlix.net/blog/?page_id=346) プロジェクトに統合されました）なのでこちらを現役復帰させる（かも）。  
現在でも使えることは使えると思います。  
ただし、安全性に関するガイドラインの Ver5.2 以降、システム停止時には本系統とは「別に」見読性確保のためのビューアを設置することが推奨されています。 
   
![OpenDolphin HTML/PDF Viewer](https://i0.wp.com/p-horlix.net/blog/wp-content/uploads/2022/05/OpenDolphin_HTML_PDF_Viewer_inomata_air-h-128k-il.png?w=900&ssl=1)
  
2.7m 系列では [OpenDolphin HTML/PDF Viewer](https://p-horlix.net/blog/?p=289) が用意されています。  
こちらはオープンソースでもなんでもないため、本リポジトリには含まれていません。  
　　
### 著作権表記  
本家の README には、松村哲理・増田茂などの名前が上がっているのですが、疑問に思うところがあって LSC に問い合わせたところ「クレジットするには及ばない」とのことでした。  
念の為、（事業譲渡された後に）メドレーにも照会しましたが、「著作権はメドレーが完全に保有している。両氏は現在は著作権は有していない。クレジットする必要はない」とかなり明快な回答をいただいています。  
だから、ここでは特に著作権者として名前は挙げません。  
ただ、混乱を避けるためソースコード上での author 表記は残してあります。  
<br>
### その他
Java17 移行に伴い、画像の取り扱いを拡張。  
  
  ![opendolphin-java17-image](https://user-images.githubusercontent.com/8698703/200156601-e4ad9bce-aecf-48ec-b7ae-b3ce92712777.png)  
　　
    
[猪股弘明](https://phazor.info/blog-ja/?page_id=2)  
[フェイザー合同会社](https://phazor.info)（PHAZOR, LLC）  
精神科医  
